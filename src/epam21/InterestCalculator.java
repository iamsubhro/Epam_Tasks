package epam21;

public class InterestCalculator {

	double simpleint(double principle, double rate, double time){
		
		return (principle*rate*time)/100;
	}
	
	double compoundint(double principle, double rate, double time){
		
		double amount=principle*(Math.pow((1+rate/100), time));
		
		return amount-principle;
	}
	
}
