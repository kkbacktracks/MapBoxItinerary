package com.assignment.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.Service.MapBoxItineraryService;
import com.assignment.model.FinalResponse;

@RestController
public class MapBoxItineraryController {

	@Autowired
	private MapBoxItineraryService mapBoxItineraryService;
	
	@GetMapping("/itinerary")
	@ResponseBody
	public List<FinalResponse> getRegionItinerary() {
		return mapBoxItineraryService.getRegionItinerary();
		
	}
	
}
