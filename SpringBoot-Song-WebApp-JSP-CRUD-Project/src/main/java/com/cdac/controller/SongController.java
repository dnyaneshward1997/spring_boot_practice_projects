package com.cdac.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cdac.model.Song;
import com.cdac.service.SongService;

@Controller
public class SongController {

	@Autowired
	private SongService songService;

	@RequestMapping(value = "/list-songs", method = RequestMethod.GET)
	public String showSongs(ModelMap model) {
		String UserName = getLoggedInUserName(model);
		model.put("songs", songService.getSongsByUserName(UserName));
		return "list-songs";
	}

	private String getLoggedInUserName(ModelMap model) {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

		if (principal instanceof UserDetails) {
			return ((UserDetails) principal).getUsername();
		}

		return principal.toString();
	}

	@RequestMapping(value = "/add-song", method = RequestMethod.GET)
	public String showAddSongPage(ModelMap model) {
		model.addAttribute("song", new Song());
		return "song";
	}

	@RequestMapping(value = "/delete-song", method = RequestMethod.GET)
	public String deleteSong(@RequestParam int id) {
		songService.deleteById(id);
		// service.deleteTodo(id);
		return "redirect:/list-songs";
	}

	@RequestMapping(value = "/update-song", method = RequestMethod.GET)
	public String showUpdateSongPage(@RequestParam int id, ModelMap model) {
		Song song = songService.getById(id).get();
		model.put("song", song);
		return "song";
	}

	@RequestMapping(value = "/update-song", method = RequestMethod.POST)
	public String updateSong(ModelMap model, @Validated Song song, BindingResult result) {

		if (result.hasErrors()) {
			return "song";
		}

		song.setUserName(getLoggedInUserName(model));
		songService.update(song);
		return "redirect:/list-songs";
	}

	@RequestMapping(value = "/add-song", method = RequestMethod.POST)
	public String addSong(ModelMap model, @Validated Song song, BindingResult result) {

		if (result.hasErrors()) {
			return "song";
		}

		song.setUserName(getLoggedInUserName(model));
		songService.add(song);
		return "redirect:/list-songs";
	}
}