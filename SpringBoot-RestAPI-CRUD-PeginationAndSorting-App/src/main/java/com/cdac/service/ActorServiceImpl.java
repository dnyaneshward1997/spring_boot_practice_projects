package com.cdac.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.cdac.dao.ActorDao;
import com.cdac.model.Actor;

@Service
public class ActorServiceImpl implements ActorService {

	@Autowired
	private ActorDao actorDao;

	@Override
	public void add(Actor actor) {
		actorDao.save(actor);
	}

	@Override
	public void update(Actor actor) {
		actorDao.save(actor);

	}

	@Override
	public void deleteById(int id) {
		actorDao.deleteById((long) id);

	}

	@Override
	public Actor getById(int id) {
		Optional<Actor> opt = actorDao.findById((long) id);
		if (opt.isPresent()) {
			return opt.get();
		}
		return null;
	}

	@Override
	public List<Actor> getAll() {
		Iterable<Actor> itr = actorDao.findAll();
		List<Actor> lst = new ArrayList<Actor>();
		itr.forEach(ele -> lst.add(ele));
		return lst;
	}


	@Override
	public List<Actor> getActorsByGender(String gender) {
		Iterable<Actor> itr2 = actorDao.getActorsByGender(gender);

		List<Actor> lst2 = new ArrayList<Actor>();
		itr2.forEach(ele -> lst2.add(ele));
		return lst2;
	}

	@Override
	public List<Actor> getActorsByIndustry(String industry) {
		Iterable<Actor> itr2 = actorDao.getActorsByIndustry(industry);

		List<Actor> lst2 = new ArrayList<Actor>();
		itr2.forEach(ele -> lst2.add(ele));
		return lst2;
	}

	@Override
	public List<Actor> findAllActorsPaginated(int pageNo, int pageSize) {
		Pageable page = PageRequest.of(pageNo, pageSize);

		return actorDao.findAll(page).toList();
	}

	@Override
	public List<Actor> findAllActorsPaginatedAndSorted(int pageNo, int pageSize, String field) {

		Pageable page = PageRequest.of(pageNo, pageSize, Direction.ASC, field);

		return actorDao.findAll(page).toList();
	}

}
