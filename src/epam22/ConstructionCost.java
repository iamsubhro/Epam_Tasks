package epam22;

public class ConstructionCost {

	double cost(String quality, double area, String automate){
		
		double cost=0.0;
		if(quality.equalsIgnoreCase("Standard") && automate.equalsIgnoreCase("No"))
			cost=area*1200;
		
		if(quality.equalsIgnoreCase("Above") && automate.equalsIgnoreCase("No"))
			cost=area*1500;
		
		if(quality.equalsIgnoreCase("High") && automate.equalsIgnoreCase("No"))
			cost=area*1800;
		
		if(quality.equalsIgnoreCase("High") && automate.equalsIgnoreCase("Yes"))
			cost=area*2500;
		
		if(quality.equalsIgnoreCase("Standard") && automate.equalsIgnoreCase("Yes"))
			System.out.println("Automated House not possible with Standard materials");
		
		if(quality.equalsIgnoreCase("Above") && automate.equalsIgnoreCase("Yes"))
			System.out.println("Automated House not possible with Above Standard Materials");
		
		return cost;
	}
}
