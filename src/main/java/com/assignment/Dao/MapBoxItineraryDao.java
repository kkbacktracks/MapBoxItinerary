package com.assignment.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.assignment.model.BackendResponse;
import com.assignment.model.Features;
import com.assignment.model.FinalResponse;

@Repository
public class MapBoxItineraryDao {

	@Autowired
	private RestTemplate restTemplate;
	
	public List<FinalResponse> getRegionItinerary() {
		
		//museums
		String museumUrl = "https://api.mapbox.com/geocoding/v5/mapbox.places/museum.json?proximity=28.96737468317292,40.9982265828352&access_token=pk.eyJ1Ijoia2tiYWNrdHJhY2tzIiwiYSI6ImNraG05c3hsODE3eW4ycXBmbnN2cjRpd2EifQ.qnAyW1RGR2IlvED5HmEAbA";
		
		ResponseEntity<BackendResponse> response
		  = restTemplate.getForEntity(museumUrl, BackendResponse.class);
		
		//palace
		String palaceUrl = "https://api.mapbox.com/geocoding/v5/mapbox.places/palace.json?proximity=28.96737468317292,40.9982265828352&access_token=pk.eyJ1Ijoia2tiYWNrdHJhY2tzIiwiYSI6ImNraG05c3hsODE3eW4ycXBmbnN2cjRpd2EifQ.qnAyW1RGR2IlvED5HmEAbA";
				
		ResponseEntity<BackendResponse> response2
				  = restTemplate.getForEntity(palaceUrl, BackendResponse.class);
				
		int limit = 0;
		List<FinalResponse> finalResponse = new ArrayList<>();
		
		for(Features feature : response.getBody().getFeatures()) {
			if(limit > 10) {
				break;
			}
			FinalResponse resp = new FinalResponse();
			resp.setCategories(feature.getProperties().getCategory());
			resp.setName(feature.getText());
			resp.setRegion(feature.getContext().get(0).getText());
			finalResponse.add(resp);
			limit++;
		}
		
		for(Features feature : response2.getBody().getFeatures()) {
			if(limit > 10) {
				break;
			}
			FinalResponse resp = new FinalResponse();
			resp.setCategories(feature.getProperties().getCategory());
			resp.setName(feature.getText());
			resp.setRegion(feature.getContext().get(0).getText());
			finalResponse.add(resp);
			limit++;
		}
		
		return finalResponse;
	}
	
}
