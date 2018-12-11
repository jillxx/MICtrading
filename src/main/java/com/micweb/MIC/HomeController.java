package com.micweb.MIC;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.micweb.MIC.dao.PlayerRepo;
import com.micweb.MIC.dao.PlayerShikiDao;
import com.micweb.MIC.dao.PlayerShikiRepo;
import com.micweb.MIC.model.Player;
import com.micweb.MIC.model.PlayerShiki;

@Controller
public class HomeController {

	@Autowired
	PlayerRepo playerRepo;

	@Autowired
	PlayerShikiRepo psRepo;

	@Autowired
	PlayerShikiDao psDao;

	@RequestMapping("/")
	public ModelAndView index() {

		System.out.println(psRepo.findAll());

		return new ModelAndView("index", "test", "Hello");
	}

	@RequestMapping("tradinglist")
	public ModelAndView tradelist() {

		ModelAndView mv = new ModelAndView("tradinglist");
		mv.addObject("list", psRepo.findAll());


		return mv;

	}

}
