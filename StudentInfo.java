package week5.day1;

public class StudentInfo {
	public void getStudentInfo(int id,String name)
	{
		System.out.println(id+" "+name);
	}
	public void getStudentInfo(String EmailId,long PhoneNumber)
	{
		System.out.println(EmailId+" "+PhoneNumber);
		
	}
	public static void main(String[] args) {
		StudentInfo student=new StudentInfo();
		student.getStudentInfo(1001, "aathimuthu");
		student.getStudentInfo("aathimuthu2001@gmail.com", 9789112506l);
	}
   
}
