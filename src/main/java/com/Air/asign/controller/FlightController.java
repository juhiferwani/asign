package com.Air.asign.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.Air.asign.exception.FlightNotFoundException;
import com.Air.asign.model.Flight;
import com.Air.asign.service.FlightService;

@RestController
public class FlightController {
	
	@Autowired
	private FlightService flightService;
	
	@GetMapping("/flights")
	public List<Flight> getAllFlights(){
		return flightService.getAll();
	}
	
	@GetMapping("/flights/{pId}")
	public Flight getFlightById(@PathVariable("pId") Long pid) {
		return flightService.getFlight(pid).orElseThrow(() -> new FlightNotFoundException(pid));
	}
	
	@GetMapping("/flights/{name}")
	public List<Flight> getFlightByName(@PathVariable("name") String name) {
		return flightService.getByName(name);
		}
	@GetMapping("/flights/{timing}")
	public List<Flight> getFlightByTiming(@PathVariable("timing") String timing) {
		return flightService.getByTiming(timing);
		}
	@GetMapping("/flights/{stop}")
	public List<Flight> getFlightByStop(@PathVariable("stop") String stop) {
		return flightService.getByStop(stop);
		}
}
	