package com.skilldistillery.toestub.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.skilldistillery.toestub.data.ToeStubDAO;
import com.skilldistillery.toestub.entities.ToeStub;

@Controller
public class ToeStubController {
	
	@Autowired
	private ToeStubDAO tsDAO;

	@RequestMapping(path={"/", "home.do"})
	public String index(Model model) {
		
		return "home";
	}
	
	@PostMapping(path="stub.do")
	public String getStubById(@RequestParam(name="stubId") int id, Model model){
		ToeStub ts = tsDAO.getToeStubById(id);
		System.out.println(ts);
		model.addAttribute("ts",ts);
		return "stub";
	}
}

