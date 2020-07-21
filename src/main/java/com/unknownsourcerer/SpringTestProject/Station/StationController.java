package com.unknownsourcerer.SpringTestProject.Station;

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
public class StationController {

	@Autowired
	private StationService stationService;
	
	@GetMapping("/communities/{id}/stations")
	public List<Station> getAllStations(@PathVariable String id) {
		return stationService.getAllStations(id);
	}
	
	@GetMapping("/communities/{communityId}/stations/{id}")
	public Optional<Station> getStations(@PathVariable String id) {
		return stationService.getStation(id);
	}
	
	@PostMapping(value = "/communities/{communityId}/stations")
	public void addStation(@RequestBody Station station, @PathVariable String communityId) {
		station.setCommunity(new Community(communityId,"",""));
		stationService.addStation(station);
	}
	
	@PutMapping(value = "/communities/{communityId}/stations/{id}")
	public void updateStation(@RequestBody Station station, @PathVariable String id, @PathVariable String communityId) {
		station.setCommunity(new Community(communityId,"",""));
		stationService.updateStation(station);
	}
	
	@DeleteMapping(value = "/communities/{communityId}/stations/{id}")
	public void deleteStation(@PathVariable String id) {
		stationService.deleteStation(id);
	}
	
}
