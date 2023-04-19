package com.cdac.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.model.Songs;
import com.cdac.service.SongsService;

@RestController
public class SongsController {

	@Autowired
	private SongsService songsService;

	@PostMapping(value = { "/song" })
	public String add_Songs(@RequestBody Songs song) {
		songsService.add(song);
		return "Songs added successfully";
	}

	@PutMapping(value = { "/song" })
	public String update_Songs(@RequestBody Songs song) {
		songsService.update(song);
		return "Songs updated successfully";
	}

	@DeleteMapping(value = { "/song" })
	public String delete_Songs(@RequestParam int id) {
		System.out.println("first delete");
		songsService.deleteById(id);
		return "Songs deleted successfully";
	}

	@DeleteMapping(value = { "/song/{id}" })
	public String delete_Songs1(@PathVariable int id) {
		System.out.println("second delete");
		songsService.deleteById(id);
		return "Songs deleted successfully";
	}

	@GetMapping(value = { "/song/{id}" })
	public Songs get_Songs_By_Id(@PathVariable int id) {
		return songsService.getById(id);
	}

	@GetMapping(value = { "/song" })
	public List<Songs> get_All_Songs() {
		return songsService.getAllSongs();
	}
	
	@GetMapping("/song/{pageNo}/{pageSize}")
	public List<Songs> get_Paginated_Songs(@PathVariable int pageNo, @PathVariable int pageSize) {
		return songsService.findAllSongsPaginated(pageNo, pageSize);
	}

}
