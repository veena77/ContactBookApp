package com.nt.service;

import java.util.List;

import com.nt.dto.ContactDetailDTO;

public interface ContactService{

	public boolean saveContact(ContactDetailDTO dto);
	
	public boolean updateContact(ContactDetailDTO dto);
	
	public boolean deleteContact(int id);
	
	public List<ContactDetailDTO> getAllContacts();
	
	public ContactDetailDTO getContactById(Integer id );
}
