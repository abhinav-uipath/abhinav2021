package com.assignment06_09;


class Student1{
	String name;
	int rollNum;
	String mobileNum;
	String address;
	void studentDetails(String name,int rollNum,String mobileNum,String address) {
		name=name;
		rollNum=rollNum;
		mobileNum=mobileNum;
		address=address;
		System.out.println("Name : "+name+"\nRoll number : "+rollNum+"\nMobile Number : "+mobileNum+"\nAddress : "+address+"\n");
	}
}
public class SttudentRecord2 {
	public static void main(String args[]) {
		//Creating object for student sam
		Student1 Student1=new Student1();
		Student1.studentDetails("Sam",1,"9812345670","Mau");
		
		Student1 Student11=new Student1();
		Student11.studentDetails("John",2,"9764395670","Buxar");
	}

}
