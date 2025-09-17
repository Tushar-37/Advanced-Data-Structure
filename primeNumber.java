import java.util.*;

class primeNumber{

	static boolean checkPrime(int num){
		
		if(num <= 1)
			return false;
		if(num == 2)
			return true;
		if(num % 2 == 0)
			return false;
			
		for(int i=3; i<=Math.sqrt(num); i+=2){
			if(num % i == 0) return false;
		}
		
		return true;
	}

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		
		//checkPrime(num);
		
		if(checkPrime(num))
			System.out.println(num + " is a prime Number ");
		else
			System.out.println(num + " is a not Prime Number ");
		
		
		
		
		
		
		
		
		
		
		
	}
}