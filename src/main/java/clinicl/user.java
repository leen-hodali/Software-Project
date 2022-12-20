package clinicl;

import java.util.ArrayList;
import java.util.Scanner;







public class user {
	static Scanner in=new Scanner(System.in);
	static public ArrayList<String> users=new ArrayList<String>();
	static ArrayList<String> password=new ArrayList<String>();
	static public ArrayList<String> phone=new ArrayList<String>();
	static ArrayList<String> id=new ArrayList<String>();
	
	public user()
	{
		users.add("ali");
		users.add("ameer");
		users.add("tala");
		password.add("123451");
		password.add("949441");
		password.add("123432");
		phone.add("0598672242");
		phone.add("0598674522");
		phone.add("0598674599");
		id.add("1");
		id.add("2");
		id.add("8");
		
		
	}
	
	
	public void setUsername(String username) {
		// TODO Auto-generated method stub
		
	}
	
	

	public void setPasword(String password) {
		// TODO Auto-generated method stub
		
	}

	public void setId(String id2) {
		// TODO Auto-generated method stub
		
	}

	public void setPhone(String phone2) {
		// TODO Auto-generated method stub
		
	}

	public static Boolean login(String us,String pa) {
		// TODO Auto-generated method stub
		for(int i=0;i<users.size();i++)
		{
			if(us.equals(users.get(i))&&pa.equals(password.get(i)))
				return true;
		}
		return false;
	}
	


	public Boolean search(String name) {
		// TODO Auto-generated method stub
		for(int i=0;i<users.size();i++)
		{
			if(name.equals(users.get(i)))
				return true;
		}
		return false;
	}
	
	public Boolean search1(String iD) {
		// TODO Auto-generated method stub
		
	
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
		// TODO Auto-generated method stub
		for(int i=0;i<users.size();i++)
		{
			if(us.equals(users.get(i))&&d.equals(id.get(i)))
				return false;
		}
		return true;
	}

	public boolean adduser(String username, String password2, String phone2, String id2) {
		// TODO Auto-generated method stub
		users.add(username);
		password.add(password2);
		phone.add(phone2);
		id.add(id2);
		return true;
	}

	


	public Boolean checkuser1(String us) {
		// TODO Auto-generated method stub
		for(int i=0;i<users.size();i++)
		{
			if(us.equals(users.get(i)))
				return true;
		}
		return false;
	}
	
	
	
	}



