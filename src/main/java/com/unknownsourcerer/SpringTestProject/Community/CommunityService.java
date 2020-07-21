package com.unknownsourcerer.SpringTestProject.Community;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommunityService {

	@Autowired
	private CommunityRepository communityRepository;

	public List<Community> getAllCommunities() {
		List<Community> communities = new ArrayList<>();
		communityRepository.findAll().forEach(communities::add); //was this
		return communities;
	}

	// optional<> helps prevent null pointers exception if entity not found
	public Optional<Community> getCommunity(String id) {
		return communityRepository.findById(id);
	}

	public void addCommunity(Community community) {
		communityRepository.save(community);
	}

	public void updateCommunity(Community community) {
		//uses same method as add and updates it if found
		communityRepository.save(community);
	}

	public void deleteCommunity(String id) {
		communityRepository.deleteById(id);
	}
}
