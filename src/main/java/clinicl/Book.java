package clinicl;

import java.util.ArrayList;

public class Book {
	
	
	
	static ArrayList<String> month=new ArrayList<>();
	static ArrayList<String> week=new ArrayList<>();
	static ArrayList<String> day=new ArrayList<>();
	static ArrayList<String> service=new ArrayList<>();
	static ArrayList<String> price=new ArrayList<>();

	public Book()
	{
		
		//Ail
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
		
		 //Amber
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
		return;
		
	}

	public void setWeek(String week) {
		return;
		
	}
	
	public void setDay(String day) {
		return;
		
	}
	
	public void setService(String service) {
		return;
		
	}
	
	public void setPrice(String price) {
		return;
		
	}

	public Boolean thebook(String m,String w,String d) {
		
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
