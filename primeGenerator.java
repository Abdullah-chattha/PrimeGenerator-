public class primeGenerator
{
	private int current;
 public primeGenerator()
 {
 current = 5;
 }
 public int nextPrime()
 {
	 int  i,j;
	 int flag = 0;
	 
	for(i = current + 1; i<100;i++) {
		flag = 0;
		
		for(j = 2; j < i ; j++)
	 if(i%j ==0) 
	 {
		 flag = 1;
		 break;
	 }
		if(flag == 0) {
			 System.out.println("Next prime number from current is ");
			 break;
			 }	}
		return i;
	}

 public static boolean isPrime(int n)
 {
	 int  i;
	 
	for(i =2; i<n;i++) {
	 if(n%i ==0) 
		 return false;
	}
	 
	return true;
	
 }
}

