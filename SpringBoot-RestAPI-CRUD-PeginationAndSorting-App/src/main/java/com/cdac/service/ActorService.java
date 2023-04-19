package com.cdac.service;

import java.util.List;
import com.cdac.model.Actor;

public interface ActorService {
	
	void add(Actor actor);
	
	void update(Actor actor);
	
	void deleteById(int id);
	
	Actor getById(int id);

	List<Actor> getAll();
	
	List<Actor> findAllActorsPaginated(int pageNo, int pageSize);
	
	List<Actor> findAllActorsPaginatedAndSorted(int pageNo, int pageSize, String field);

	List<Actor> getActorsByGender(String gender);

	List<Actor> getActorsByIndustry(String industry);

	
	
}
