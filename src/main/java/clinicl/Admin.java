package clinicl;

import java.util.ArrayList;





public class Admin {

	protected static  ArrayList<String> users=new ArrayList<>();
	static ArrayList<String> password=new ArrayList<>();
	static ArrayList<String> service=new ArrayList<>();
	static ArrayList<String> price=new ArrayList<>();
	private Boolean login;
	
	public Admin()
	{
		super();
		users.add("aya");
		users.add("suha");
		password.add("12345");
		password.add("94944");
		service.add("Root canal treatment");
		service.add("Scale and polish");
		service.add("Braces");
		service.add("Dental implants");
		service.add("cleaning teath");
		password.add("200");
		password.add("100");
		password.add("300");
		password.add("200");
		password.add("50");
	}
	
	
	
	public Boolean getlogin() {
		return login;
	}
	
	public void setlogin(Boolean login) {
		this.login = login;
	}

	public Boolean login(String u,String p) {
		
		for(int i=0;i<users.size();i++)
		{
			if(u.equals(users.get(i))&&p.equals(password.get(i)))
				return true;
			    
		}
		return false;
	}
	
	public boolean deletes(String sr,String p) {
		service.remove(sr);
		price.remove(p);
		return true;
	}


	public boolean checkLogin(String u) {
		
		for(int i=0;i<users.size();i++)
		{
			if(u.equals(users.get(i)))
				return true;
		}
		return false;
	}


	public boolean addservice(String service2, String price2) {
		
		service.add(service2);
		price.add(price2);
		
		return true;
	}
	
	


	
	public Boolean logout(String u) {
		
		for(int i=0;i<users.size();i++)
		{
			if(u.equals(users.get(i)))
				return false;
			    
		}
		return true;
	}
	

}
	
	
	
