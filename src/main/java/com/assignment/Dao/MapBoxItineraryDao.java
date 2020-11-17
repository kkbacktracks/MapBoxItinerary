package com.assignment.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public class MapBoxItineraryDao {

	@Autowired
	private RestTemplate restTemplate;
	
	public String getRegionItinerary() {
		
		String url = "https://api.mapbox.com/geocoding/v5/mapbox.places/museum.json?proximity=28.96737468317292,40.9982265828352&access_token=pk.eyJ1Ijoia2tiYWNrdHJhY2tzIiwiYSI6ImNraG05c3hsODE3eW4ycXBmbnN2cjRpd2EifQ.qnAyW1RGR2IlvED5HmEAbA";
		
		ResponseEntity<String> response
		  = restTemplate.getForEntity(url, String.class);
		System.out.println("Response is :"+response.getBody());
		return "success";
	}
	
}
