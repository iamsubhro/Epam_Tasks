package epam2;
import java.util.*;
public class Calculator {
	
	int div(int num0, int num1){
		
		return num0/num1;
	}
	
	int sum(ArrayList<Integer> num){
		
		int sum=0;
		for(int i=0; i<num.size(); i++){
			sum=sum+num.get(i);
		}
		
		return sum;
	}
	
	int multiply(ArrayList<Integer> num){
		
		int product=1;
		for(int i=0; i<num.size(); i++){
			product=product*num.get(i);
		}
		
		return product;
	}
	
}
