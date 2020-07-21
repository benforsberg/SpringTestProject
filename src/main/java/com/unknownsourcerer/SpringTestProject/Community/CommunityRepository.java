package com.unknownsourcerer.SpringTestProject.Community;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CommunityRepository extends CrudRepository<Community,String>{	//string bc ID is a string

	
}
