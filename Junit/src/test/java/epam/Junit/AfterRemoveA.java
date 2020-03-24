package epam.Junit;

public class AfterRemoveA {

	public String remove(String string)
	{
		String result=string;
		if(string.length()>1)
		{
			if(string.substring(0, 2).equals("AA"))
			{
				result=string.substring(2,string.length());	
			}
			else if(string.substring(0,1).equals("A"))
			{
				result=string.substring(1,string.length());
			}
			else if(string.substring(1,2).equals("A"))
			{
				result=string.substring(0,1)+string.substring(2,string.length());	
			}
				
		}
		else
		{
			if(string=="A")
				result="";
		}

		return result;
		}
}
