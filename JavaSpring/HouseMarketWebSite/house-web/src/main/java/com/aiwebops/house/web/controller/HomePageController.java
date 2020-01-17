package com.aiwebops.house.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aiwebops.house.biz.service.RecommendService;
import com.aiwebops.house.common.model.House;

@Controller
public class HomePageController {
	
	@Autowired
	private RecommendService recommendService;

	@RequestMapping("index")
	public String accountRegister(ModelMap modelMap) {
		List<House> houses = recommendService.getLatest(){
			modelMap.put("recomHouses", houses);
		    return "/homepage/index";
		}
	}

	@RequestMapping("")
	public String index(ModelMap modelMap) {
		return "redirect:/index";
	}
}
