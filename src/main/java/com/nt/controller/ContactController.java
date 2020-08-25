package com.nt.controller;

import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nt.dto.ContactDetailDTO;
import com.nt.service.ContactService;

@Controller
public class ContactController {

	@Autowired
	private ContactService service;
	
	@GetMapping(value= {"/","/addContact"})
	public String loadForm(Model model) {
		ContactDetailDTO contact=new ContactDetailDTO();
		model.addAttribute("contact",contact);
		return "add_contact";
	}
	
	@PostMapping("/saveContact")
	public String processForm(@Valid @ModelAttribute("contact") ContactDetailDTO dto,RedirectAttributes attributes,BindingResult errors) {
		if(service.saveContact(dto))
		attributes.addFlashAttribute("resMsg","Contact Saved");
		else
			attributes.addFlashAttribute("resMsg","Contact Failed to Save");
		
		if(errors.hasErrors()) {
			return "add_contact";
		}
	
		
		return "redirect:/resubmission";
	}
	
	@GetMapping("/resubmission")
	public String redirectFormSumition(Model model) {
		ContactDetailDTO contact=new ContactDetailDTO();
		model.addAttribute("contact",contact);
		
		return "add_contact";
	}
	
	@RequestMapping("/viewContact")
	public String viewContactsForm(@ModelAttribute("contact") ContactDetailDTO dto,Map<String,Object> map) throws Exception {

		List<ContactDetailDTO> listDTO=null;
		listDTO=service.getAllContacts();
		if(listDTO==null)
			throw new Exception("Contacts are not available");
		else {
		
			map.put("listDTO",listDTO);
		}
		
		return "contact_info";
	}
	
	
}

