package week3.day1.abstruction;

public  class automation extends multilanguage implements Testtool,language
{

	@Override
	public void java() {
		// TODO Auto-generated method stub
		
		System.out.println("Java class going to complete");
		
	}

	@Override
	public void selinium() {
		
		
	System.out.println("class name is selinium");
	
		
	}

	@Override

	public void ruby() {
		System.out.println("ruby is not popular language");
		
		
	}
	
public static void main(String[] args)

{
	automation Atool=new automation();
	
	Atool.java();
	Atool.selinium();
	Atool.ruby();
	Atool.python();
	
}
	
	

}
