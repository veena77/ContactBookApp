package com.nt.bo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name="Contact_Details")
public class ContactDetailsBO {

	@Id

	  @GeneratedValue(strategy = GenerationType.AUTO, generator = "increment")
	  @GenericGenerator(name = "increment", strategy = "increment")
	 //	@GeneratedValue(generator="contact_seq", strategy=GenerationType.SEQUENCE)
	//@SequenceGenerator(name="contact_seq", sequenceName="test_seq")
	@Column(name="Contact_Id")
	private Integer cid;
	
	@Column(name="Contact_Name")
	private String cname;
	
	@Column(name="Email_Id")
	private String mailId;
	
	@Column(name="Phone_No")
	private Integer mbNo;
	
	@CreationTimestamp
	@Temporal(TemporalType.DATE)
	@Column(name="Create_Date")
	private Date createdDate;
	
	@UpdateTimestamp
	@Temporal(TemporalType.DATE)
	private Date updatedDate;

		public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

		public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public Integer getMbNo() {
		return mbNo;
	}

	public void setMbNo(Integer mbNo) {
		this.mbNo = mbNo;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
}
