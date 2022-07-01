package week3.day1;

public class students {
	
	public void getstudentInfo(int ID)
	{
		System.out.println("The student ID is:"+ID);
		
	}
	
	public void getstudentInfo(int ID, String Name) {
		System.out.println("The ID is:"+ID +","+ "The name is"+Name);
				
	}
public void getstudentInfo(String email, float phonenumber)

{
	System.out.println("The student mailID is"+email +","+ " The phonenumber:"+phonenumber);
	
}
public static void main(String[] args)

{
	students sdetails=new students();
	sdetails.getstudentInfo(4567);
	sdetails.getstudentInfo(4567,"Abirami j");
	sdetails.getstudentInfo("abishreee.153@gmail.com" , 96000702);
	
	
}

}




