package week5.day1;

public class AxisBank extends Bankinfo{
	public void deposit()
	{
		System.out.println("550000");
		
	}
	public static void main(String[] args) {
		AxisBank obj=new AxisBank();
		obj.saving();
		obj.fixed();
		obj.deposit();
	}

}
