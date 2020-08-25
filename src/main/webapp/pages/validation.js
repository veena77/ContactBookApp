function validate(frm){

	//Empty Error msgs
	document.getElementById("ContactNameErr").innerHTML="";
	document.getElementById("EmailIdErr").innerHTML="";
	document.getElementById("MbNoErr").innerHTML="";
	
	//let Command Values
	let name=frm.cname.value;
	let mailId=frm.mailId.value;
	let mbNo=frm.mbNo.value;
	let vflag=frm.vflag.value;

	if(name==""){
		document.getElementById("ContactNameErr").innerHTML="<b>Person name is manditory</b>";
		frm.cname.focus();
		vflag=false;
	}
	
	if(mailId=""){
		document.getElementById("EmailIdErr").innerHTML="<b>Mail Id Required</b>";
		frm.mailId.focus();
		vflag=false;
	}
	
	if(mbNo=""){
		document.getElementById("MbNoErr").innerHTML="<b>Mobile Number is Manditory</b>";
		frm.mbNo.focus();
		vflag=false;
	}
	
	if(vflag)
		return false;
	else
		return true;
}