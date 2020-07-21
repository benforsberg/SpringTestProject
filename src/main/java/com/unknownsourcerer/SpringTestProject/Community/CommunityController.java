package com.unknownsourcerer.SpringTestProject.Community;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unknownsourcerer.SpringTestProject.Community.Community;

@RestController
public class CommunityController {
	
	@Autowired
	private CommunityService communityService;
	
	@GetMapping("/")
	public String welcome() {
		return "Hello! Welcome to my Spring Boot application! I really need to hire a front end dev to make this look better. ";
	}
	
	@GetMapping("/error")
	public String error() {
		return "Oops! Error 404 Page Not Found. Please try again later or contact the site administrator at benj.forsberg@gmail.com.";
	}
	

	@GetMapping("/communities")
	public List<Community> getAllCommunities() {
		return communityService.getAllCommunities();
	}
	
	@GetMapping("/communities/{id}")
	public Optional<Community> getCommunity(@PathVariable String id) {
		return communityService.getCommunity(id);
	}
	
	@PostMapping(value = "/communities")
	public void addCommunity(@RequestBody Community community) {
		communityService.addCommunity(community);
	}
	
	@PutMapping(value = "/communities/{id}")
	public void updateCommunity(@RequestBody Community community, @PathVariable String id) {
		communityService.updateCommunity(community);
	}
	
	@DeleteMapping(value = "/communities/{id}")
	public void deleteCommunity(@PathVariable String id) {
		communityService.deleteCommunity(id);
	}
}
