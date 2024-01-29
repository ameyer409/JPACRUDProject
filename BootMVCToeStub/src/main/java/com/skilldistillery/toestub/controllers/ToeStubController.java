package com.skilldistillery.toestub.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
		model.addAttribute("ts",ts);
		return "stub";
	}
	
	@GetMapping(path="addToeStub.do")
	public String addStub() {
		return "addToeStub";
	}
	
	@PostMapping(path="createStub.do")
	public ModelAndView createStub(ToeStub toeStub, RedirectAttributes redir) {
		ModelAndView mv = new ModelAndView();
		ToeStub ts = tsDAO.create(toeStub);
		redir.addFlashAttribute("toeStub", ts);
		mv.setViewName("redirect:ToeStubAdded.do");
		return mv;
	}
	
	@GetMapping(path="ToeStubAdded.do")
	public String stubCreated(ToeStub toeStub, Model model) {
		model.addAttribute("ts", toeStub);
		return "createToeStub";
	}
	
	@PostMapping(path = "updateToeStub.do")
	public ModelAndView updateToeStubDetails(@RequestParam("stubId") int id) {
		ModelAndView mv = new ModelAndView();
		ToeStub ts = tsDAO.getToeStubById(id);
		mv.addObject("tw", ts);
		mv.setViewName("toeStubEdit");
		return mv;
	}
}

