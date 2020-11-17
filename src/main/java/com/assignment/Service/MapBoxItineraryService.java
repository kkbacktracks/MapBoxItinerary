package com.assignment.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.Dao.MapBoxItineraryDao;

@Service
public class MapBoxItineraryService {

	@Autowired
	private MapBoxItineraryDao mapBoxItineraryDao;
	
	public String getRegionItinerary() {
		return mapBoxItineraryDao.getRegionItinerary();
	}
	
}
