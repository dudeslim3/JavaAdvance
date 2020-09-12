package mypack;

public class LoginBean 
{
	public boolean validate(String name,String pass)
	{
		if(name.equalsIgnoreCase("Ganesh") && pass.equals("GK@508"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}
