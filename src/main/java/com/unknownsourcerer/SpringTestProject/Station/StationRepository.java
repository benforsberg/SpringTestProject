package com.unknownsourcerer.SpringTestProject.Station;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
public interface StationRepository extends CrudRepository<Station,String>{

	//custom filter using findBy syntax + what you want filtered with it as the arg
//	public List<Station> findByName(String name);
//	public List<Station> findByDescription(String description);
	
	//looking at the id field of a specific community object so add to method name
	public List<Station> findByCommunityId(String communityId);

}
