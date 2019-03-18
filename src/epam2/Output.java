package epam2;

import java.util.*;
public class Output {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator obj= new Calculator();
		Scanner sc= new Scanner(System.in);
		int flag=0;
		
		while(flag==0){
	
		System.out.println("CALCULATOR");
		System.out.println("1: Addition");
		System.out.println("2: Multiplication");
		System.out.println("3: Division");
		System.out.println("4: EXIT");
		System.out.println("Enter your choice");
		int ch=sc.nextInt();
		
		switch(ch){
		
		case 1:
			ArrayList<Integer> l1 = new ArrayList<>();
			System.out.println("Enter the total numbers you want to add");
			int n=sc.nextInt();
			
			System.out.println("Enter the numbers");
			for(int i=0; i<n; i++){
				l1.add(sc.nextInt());
			}
			
			System.out.println("Sum is: " +obj.sum(l1));
			break;
			
		case 2:
			ArrayList<Integer> l2 = new ArrayList<>();
			System.out.println("Enter the total numbers you want to multiply");
			int n1=sc.nextInt();
			
			System.out.println("Enter the numbers");
			for(int i=0; i<n1; i++){
				l2.add(sc.nextInt());
			}
			
			System.out.println("Product is: " +obj.multiply(l2));
			break;
			
		case 3:
			
			System.out.println("Enter the dividend");
			int n2=sc.nextInt();
			
			System.out.println("Enter the divisor");
			int n3=sc.nextInt();
			
			System.out.println("Quotient is: " +obj.div(n2, n3));
			break;
			
		case 4:
			flag=1;
			break;
			
			default:
				System.out.println("Invalid Choice");
				break;
				
		}
		}
	}
}
