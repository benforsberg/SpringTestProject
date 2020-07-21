package com.unknownsourcerer.SpringTestProject.Station;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.unknownsourcerer.SpringTestProject.Community.Community;

@Entity
public class Station {

	@Id
	private String id;
	private double longitude;
	private double latitude;
	private String name;
	private String description;

	@ManyToOne
	private Community community;
	
	public Station() {

	}

	public Station(String id, double longitude, double latitude, String name, String description,String communityId) {
		super();
		this.id = id;
		this.longitude = longitude;
		this.latitude = latitude;
		this.name = name;
		this.description = description;
		this.community = new Community(communityId,"","");
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Community getCommunity() {
		return community;
	}

	public void setCommunity(Community community) {
		this.community = community;
	}

}
