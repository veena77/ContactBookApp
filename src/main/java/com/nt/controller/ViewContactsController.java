package com.nt.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nt.dto.ContactDetailDTO;
import com.nt.service.ContactService;

@Controller
public class ViewContactsController {

	@Autowired
	private ContactService service;
	
	@RequestMapping("/editContact")
	public String editContact(@RequestParam("cid") Integer ContactId,Model model) {
		ContactDetailDTO contact=service.getContactById(ContactId);
		model.addAttribute("contact",contact);
		return "add_contact";
	}
	
	
	  @RequestMapping("/deleteContact") 
	  public String deleteContact(@RequestParam("cid")Integer ContactId,Map<String,String> map,@ModelAttribute("contact") ContactDetailDTO contact) {
	  
	  boolean isDel=service.deleteContact(ContactId);
	  if(isDel) {
		  map.put("resMsg",contact.getCname()+" deleted Successfully");
		  return "redirect:/viewContact"; 
	  }
		  return null;
	  }
	 
}
