package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StudentService {

	static HashMap<Integer, StudentInfo> studentIdMap = null; // map list

	public StudentService() {
		if (studentIdMap == null) {
			studentIdMap = new HashMap<Integer, StudentInfo>();

			// Creating some objects of Student while initializing
			StudentInfo GermanyStudent = new StudentInfo(1, "Satyam", "satyam@gmail.com", "8449602979", "mumbai", 22222,
					"234", "CS");
			StudentInfo IndiaStudent = new StudentInfo(2, "naveen", "naveen@gmail.com", "0123456789", "delhi", 245405,
					"02", "IT");
			StudentInfo nepalStudent = new StudentInfo(3, "abhinav", "abhinavgmail.com", "8985654336", "noida", 32,
					"453", "EE");
			StudentInfo EnglandStudent = new StudentInfo(4, "sahil", "sahilgmail.com", "9354795476", "Greater Noida",
					111000, "56", "ME");

			// adding map list of collections in java
			studentIdMap.put(1, GermanyStudent);
			studentIdMap.put(4, IndiaStudent);
			studentIdMap.put(3, nepalStudent);
			studentIdMap.put(2, EnglandStudent);
		}

	}

	public List<StudentInfo> getAllStudentlist() {
		List<StudentInfo> personlist = new ArrayList<StudentInfo>(studentIdMap.values());
		return personlist;
	}

	public StudentInfo getStudent(int id) {
		StudentInfo Student = studentIdMap.get(id);
		return Student;
	}

// add student
	public StudentInfo addStudent(StudentInfo student) {
		student.setId(getMaxId() + 1);
// key , value
		studentIdMap.put(student.getId(), student); /// logic class
		return student;
	}

	// update
	public StudentInfo updateStudent(StudentInfo student) {
		if (student.getId() <= 0)
			return null;
		studentIdMap.put(student.getId(), student);
		return student;
	}
//delete

	public void deleteStudent(int id)

	{
		studentIdMap.remove(id);
	}

	public static HashMap<Integer, StudentInfo> getStudentIdMap()

	{

		return studentIdMap;
	}

	// Utility method to get max id
	public static int getMaxId()
    {
    	int max = 0;
        for (int id : studentIdMap.keySet()){
        	if (max <= id)
                max = id;}
        return max;
    }
}
