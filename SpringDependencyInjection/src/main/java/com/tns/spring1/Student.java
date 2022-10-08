package com.tns.spring1;

public class Student {
	private String studentName;
    private int id;
   
	public Student(String studentName, int id) {
		this.studentName = studentName;
		this.id = id;
	}

	public void display()
	{
		System.out.println("Student data is "+studentName+" "+id);
	}
	
	
}
