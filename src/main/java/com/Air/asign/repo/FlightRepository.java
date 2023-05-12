package com.Air.asign.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Air.asign.model.Flight;


@Repository
public interface FlightRepository extends JpaRepository<Flight,Long>{

}
