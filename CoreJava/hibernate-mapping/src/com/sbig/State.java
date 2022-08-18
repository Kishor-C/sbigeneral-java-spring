package com.sbig;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity
public class State {

	@Id
	@Column(name = "state_id")
	private String stateId;
	
	@Column(name = "state_name")
	private String stateName;
	
	// These two below annotations initializes the City entities belonging to the State entity
	@OneToMany
	@JoinTable(name = "state_city_ref", joinColumns = @JoinColumn(name = "state_ref"), 
			inverseJoinColumns = @JoinColumn(name = "city_ref"))
	private List<City> cities;

	public String getStateId() {
		return stateId;
	}

	public void setStateId(String stateId) {
		this.stateId = stateId;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public List<City> getCities() {
		return cities;
	}

	public void setCities(List<City> cities) {
		this.cities = cities;
	}
	
	
}
