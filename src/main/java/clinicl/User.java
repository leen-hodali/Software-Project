package clinicl;

import java.util.ArrayList;

import java.util.Scanner;







public class User {
	static Scanner in=new Scanner(System.in);
	protected static  ArrayList<String> users=new ArrayList<>();
	static ArrayList<String> password=new ArrayList<>();
	private static  ArrayList<String> phone=new ArrayList<>();
	static ArrayList<String> id=new ArrayList<>();
	
	    
	public User()
	{
		users.add("ali");
		users.add("ameer");
		users.add("tala");
		password.add("123451");
		password.add("949441");
		password.add("123432");
		getPhone().add("0598672242");
		getPhone().add("0598674522");
		getPhone().add("0598674599");
		id.add("1");
		id.add("2");
		id.add("8");
	    
		
	}
	
	
	
	
	


	public static Boolean login(String us,String pa) {
		
		for(int i=0;i<users.size();i++)
		{
			if(us.equals(users.get(i))&&pa.equals(password.get(i)))
				return true;
		}
		return false;
	}
	


	public Boolean search(String name) {
		
		for(int i=0;i<users.size();i++)
		{
			if(name.equals(users.get(i)))
				return true;
		}
		return false;
	}
	
	public Boolean search1(String iD) {
		
		
	
		for(int i=0;i<id.size();i++)
		{
			if(iD.equals(id.get(i))) 
				return true;	
		}
		return false;
	}
	
	
	public boolean delete(String name) {
		users.remove(name);
		return true;
	}
	
	public Boolean checkuser(String us,String d) {
		
		for(int i=0;i<users.size();i++)
		{
			if(us.equals(users.get(i))&&d.equals(id.get(i)))
				return false;
		}
		return true;
	}

	public boolean adduser(String username, String password2, String phone2, String id2) {
		
		users.add(username);
		password.add(password2);
		getPhone().add(phone2);
		id.add(id2);
		return true;
	}

	


	public Boolean checkuser1(String us) {
	
		for(int i=0;i<users.size();i++)
		{
			if(us.equals(users.get(i)))
				return true;
		}
		return false;
	}


	public static ArrayList<String> getPhone() {
		return phone;
	}


	public static void setPhone(ArrayList<String> phone) {
		User.phone = phone;
	}
	
	
	
	}



