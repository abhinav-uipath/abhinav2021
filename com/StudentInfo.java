package com;

public class StudentInfo {
	private Integer id;
	private String name;
	private String email;
	private String address;
	private String branch;
	private String rollno;
	private String mobile;
	private Integer pincode;
	
	public StudentInfo()
	{
		super();
	}
	public StudentInfo(Integer id ,String name,String email,String mobile,String address,Integer pincode,String rollno,String branch)
	{

		
		super();
		this.id=id;
		this.name=name;
		this.email=email;
		this.address=address;
		this.branch=branch;
		this.rollno=rollno;
		this.mobile=mobile;
		this.pincode=pincode;
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getPincode() {
		return pincode;
	}
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}

}
