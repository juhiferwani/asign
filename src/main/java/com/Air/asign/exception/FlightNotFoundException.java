package com.Air.asign.exception;

public class FlightNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public FlightNotFoundException(Long id) {
		super("The Flight with "+id+" cannot not Found!");
	}
}
