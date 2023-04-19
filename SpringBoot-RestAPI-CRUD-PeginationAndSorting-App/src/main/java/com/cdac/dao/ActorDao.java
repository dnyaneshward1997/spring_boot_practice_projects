package com.cdac.dao;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.cdac.model.Actor;

@Repository
public interface ActorDao extends PagingAndSortingRepository<Actor, Long> {

	List<Actor> getActorsByGender(String gender);

	List<Actor> getActorsByIndustry(String industry);

}
