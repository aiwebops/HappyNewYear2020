package com.aiwebops.house.biz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aiwebops.house.common.model.House;
import com.aiwebops.house.common.page.PageParams;

@Service
public class RecommendService {

	@Autowired
	private HouseService houseService;

	public List<House> getLatest() {
		House query = new House();
		query.setSort("create_time");
		List<House> houses = houseService.queryAndSetImg(query, new PageParams(0, 1));
		return houses;
	}

}
