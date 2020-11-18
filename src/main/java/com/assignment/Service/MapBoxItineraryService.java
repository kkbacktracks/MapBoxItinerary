package com.assignment.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.Dao.MapBoxItineraryDao;
import com.assignment.model.FinalResponse;

@Service
public class MapBoxItineraryService {

	@Autowired
	private MapBoxItineraryDao mapBoxItineraryDao;
	
	public List<FinalResponse> getRegionItinerary() {
		return mapBoxItineraryDao.getRegionItinerary();
	}
	
}
