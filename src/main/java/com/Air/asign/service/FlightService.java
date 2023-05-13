package com.Air.asign.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Air.asign.model.Flight;
import com.Air.asign.repo.FlightRepository;

@Service
public class FlightService {
	

	@Autowired
	private FlightRepository repo;
	
	public List<Flight> getAll(){
		
		List<Flight> flights = new ArrayList<>();
		repo.findAll().forEach(flights :: add);
		
		return flights;
	}
	
	public Optional<Flight> getFlight(Long id){
		return repo.findById(id);
	}
	
	public List<Flight> getByName(String name){
		List<Flight> flights = new ArrayList<>();
		repo.findAll().forEach(flights :: add);
		List<Flight> res = flights.stream().filter(x -> x.getName().equalsIgnoreCase(name))
		.collect(Collectors.toList());
		
		return res;
	}
	
	public List<Flight> getByTiming(String timing){
		List<Flight> flights = new ArrayList<>();
		repo.findAll().forEach(flights :: add);
		List<Flight> res = flights.stream().filter((Flight flight)->{
			return flight.getTiming().equalsIgnoreCase(timing);
		}).collect(Collectors.toList());
		
		return res;
	}
	
	public List<Flight> getByStop(String stop){
		List<Flight> flights = new ArrayList<>();
		repo.findAll().forEach(flights :: add);
		List<Flight> res = flights.stream().filter((Flight flight)->{
			return flight.getStop().equalsIgnoreCase(stop);
		}).collect(Collectors.toList());
		
		return res;
	}
}