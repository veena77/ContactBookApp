package com.nt.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.bo.ContactDetailsBO;

public interface ContactDetailsDAO extends JpaRepository<ContactDetailsBO, Serializable>{


	
	
}
