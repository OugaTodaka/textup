package jp.ac.ohara.address.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import jp.ac.ohara.address.model.AddressBook;
import jp.ac.ohara.address.service.AddressBookService;

@Controller
public class MainController {

	@Autowired
	private AddressBookService AddressBookService;
	
	@GetMapping("/")
	public String top(Model model) {
		model.addAttribute("addressBook",AddressBookService.getAddressList());
		return "top";
	}
	@GetMapping("/form")
	public ModelAndView form(AddressBook addressBook,ModelAndView model) {
		model.addObject("addressBook",addressBook);
		
		model.setViewName("form");
		return model;
	}
}
