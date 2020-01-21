import java.util.*;
public class PrimePrinter
{
 public static void main (String[] args)
 {
	 Scanner in = new Scanner(System.in);
	 
	 	System.out.print("Enter upper limit: ");
	 	int limit = in.nextInt();
 
	 	System.out.println("Enter the number to check if its prime or not \n");
	 	int prime = in.nextInt();
 
 	primeGenerator myClass =  new primeGenerator();
 	System.out.println("Is "+ prime + " a Prime Number? = " + myClass.isPrime(prime));
 	System.out.println(myClass.nextPrime());
 	
 	System.out.println("prime numbers are");
 	
	 int  i,j;
	 int flag = 0;
	 
	for(i = 3; i<limit;i++) {
		flag = 0;
		
		for(j = 2; j < i ; j++)
	 if(i%j ==0) 
	 {
		 flag = 1;
		 break;
	 }
		if(flag == 0) {
			 System.out.println(i);
			
			 }	}
	}

 	
 	
 
}