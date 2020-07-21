package com.unknownsourcerer.SpringTestProject.Station;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unknownsourcerer.SpringTestProject.Community.Community;

@Service
public class StationService {

	@Autowired
	private StationRepository stationRepository;

	public List<Station> getAllStations(String communityId) {
		List<Station> stations = new ArrayList<>();
		//stationRepository.findAll().forEach(stations::add);
		stationRepository.findByCommunityId(communityId).forEach(stations::add);
		return stations;

	}

	public Optional<Station> getStation(String id) {
		return stationRepository.findById(id);
	}

	public void addStation(Station station) {
		stationRepository.save(station);
	}

	public void updateStation(Station station) {
		stationRepository.save(station);
	}

	public void deleteStation(String id) {
		stationRepository.deleteById(id);
	}
}
