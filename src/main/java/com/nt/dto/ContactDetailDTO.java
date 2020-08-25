package com.nt.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class ContactDetailDTO {
	
	
	private int srNum;
	private Integer cid;
	
	@NotEmpty(message="Contact Name is Mandatory")
	private String cname;
	@Email(message = "Email Address is Required")
	private String mailId;

		@NotNull(message = "Mobile Number is Mandatory")
//	@Pattern(regexp = "[0-9]",message = "Must be Number")
	private Integer mbNo;
	private String vflag;
	
	public String getVflag() {
		return vflag;
	}
	public void setVflag(String vflag) {
		this.vflag = vflag;
	}
	public int getSrNum() {
		return srNum;
	}
	public void setSrNum(int srNum) {
		this.srNum = srNum;
	}
	
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
	
}
