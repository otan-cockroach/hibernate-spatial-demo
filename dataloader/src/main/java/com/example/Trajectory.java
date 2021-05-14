package com.example;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.geolatte.geom.LineString;


@Entity
public class Trajectory {

	@Id
	@GeneratedValue
	private UUID id;

	private LineString<?> geometry;

	private LocalDateTime start;

	private Long durationInMinutes;

	public Trajectory(){}

	public Trajectory(LineString<?> lineString, LocalDateTime start, LocalDateTime stop) {
		this.geometry = lineString;
		this.start = start;
		this.durationInMinutes = Duration.between( start, stop ).toMinutes();
	}

}
