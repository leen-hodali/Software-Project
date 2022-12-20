package c21;

import java.util.ArrayList;

public class book {
	
	
	
	static ArrayList<String> month=new ArrayList<String>();
	static ArrayList<String> week=new ArrayList<String>();
	static ArrayList<String> day=new ArrayList<String>();
	static ArrayList<String> service=new ArrayList<String>();
	static ArrayList<String> price=new ArrayList<String>();

	public book()
	{
		
		//ali
		month.add("January");
		month.add("April");
		week.add("week2");
		week.add("week4");
		day.add("saturday");
		day.add("sunday");
		service.add("Root canal treatment");
		service.add("Braces");
		price.add("200");
		price.add("300");
		
		 //ameer
		     month.add("March");
			month.add("April");
			week.add("week1");
			week.add("week4");
			day.add("tuesday");
			day.add("sunday");
			service.add("Root canal treatment");
			service.add("Scale and polish");
			price.add("200");
			price.add("100");

	}

	public void setMonth(String month) {
		// TODO Auto-generated method stub
		
	}

	public void setWeek(String week) {
		// TODO Auto-generated method stub
		
	}
	
	public void setDay(String day) {
		// TODO Auto-generated method stub
		
	}
	
	public void setService(String service) {
		// TODO Auto-generated method stub
		
	}
	
	public void setPrice(String price) {
		// TODO Auto-generated method stub
		
	}

	public Boolean thebook(String m,String w,String d) {
		// TODO Auto-generated method stub
		for(int i=0;i<month.size();i++)
		{
			if(m.equals(month.get(i))&&w.equals(week.get(i))&&d.equals(day.get(i)))
				return true;
		}
		return false;
	}
	
	public Boolean checkapiontment(String m,String w,String d) {
		for(int i=0;i<month.size();i++)
		{
			if(m.equals("January")&&w.equals("week2")&&d.equals("saturday"))
				return true;
		}
		return false;
	}
	
	public Boolean checkapiontment1(String m,String w,String d) {
		for(int i=0;i<month.size();i++)
		{
			if(m.equals("march")&&w.equals("week1")&&d.equals("tuesday"))
				return true;
		}
		return false;
	}

	
	
	
	
	
	

}
