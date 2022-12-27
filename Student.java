package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName()
	{
		System.out.println("Aathimuthu");
	}
	public void studentDept()
	{
		System.out.println("B.sc Mathematics");
	}
	public void studentId()
	{
		System.out.println("29");
	}
	public static void main(String[] args) {
		Student obj=new Student();
		obj.deptName();
		obj.studentName();
		obj.studentDept();
		obj.studentId();
		
	}

}
