package com.assignment.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.Service.MapBoxItineraryService;

@RestController
public class MapBoxItineraryController {

	@Autowired
	private MapBoxItineraryService mapBoxItineraryService;
	
	@GetMapping("/itinerary")
	public String getRegionItinerary() {
		return mapBoxItineraryService.getRegionItinerary();
		
	}
	
}
