package com.Air.asign.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Builder

@Entity
@Table(name = "Flight")
public class Flight {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	//auto generates the id by JPA and hibernate
	private Long id;
	
	private String name;
	private String timing;
	//Possible timing values are  (Morning / Afternoon / Evening / Night)

	private String stop;
	//Possible stop values are Direct or Indirect
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTiming() {
		return timing;
	}
	public void setTiming(String timing) {
		this.timing = timing;
	}
	public String getStop() {
		return stop;
	}
	public void setStop(String stop) {
		this.stop = stop;
	}
	
	

}
