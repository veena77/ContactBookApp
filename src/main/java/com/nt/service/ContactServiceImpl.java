package com.nt.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.bo.ContactDetailsBO;
import com.nt.dao.ContactDetailsDAO;
import com.nt.dto.ContactDetailDTO;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactDetailsDAO dao;
	
	@Override
	public boolean saveContact(ContactDetailDTO dto) {
		ContactDetailsBO bo=null;
		if(dto.getCid()!=null) {
			Optional<ContactDetailsBO> findById= dao.findById(dto.getCid());
			bo=findById.get();
		}
		bo=new ContactDetailsBO();
		BeanUtils.copyProperties(dto, bo);
		return dao.save(bo)!=null;
	}

	@Override
	public boolean updateContact(ContactDetailDTO dto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteContact(int id) {
		dao.deleteById(id);
		return true;
	}

	@Override
	public List<ContactDetailDTO> getAllContacts() {
		List<ContactDetailDTO> listDTO=new ArrayList<ContactDetailDTO>();
		List<ContactDetailsBO> listBO=null;
		listBO=dao.findAll();
		//convert bo to dto
		listBO.forEach(bo->{
			ContactDetailDTO dto=new ContactDetailDTO();
			BeanUtils.copyProperties(bo, dto);
			listDTO.add(dto);
		});
		return listDTO;
	}

	@Override
	public ContactDetailDTO getContactById(Integer id) {
		Optional<ContactDetailsBO> findById=dao.findById(id);
		if(findById.isPresent()) {
			ContactDetailsBO bo=findById.get();
			ContactDetailDTO dto=new ContactDetailDTO();
			BeanUtils.copyProperties(bo, dto);
			return dto;
		}
		return null;
	}


}
