import java.util.*;


class armStrong{

	public static boolean checkNumber(int num){
		
		if(num < 0){
			return false;
		}
		
		int original = num;
		int digit = String.valueOf(num).length(); // Number of digit present 
		int sum = 0;
		
		while(num >0){
			
			int number = num % 10;
			sum += Math.pow(number , digit); // power of number
			num /= 10;
		}
		
		return sum == original;
	}

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = sc.nextInt();
		
		if(checkNumber(num)){
			System.out.println(" The Numebr " + num + " is ArmStrong ");
		}else{
			System.out.println(" The Numebr " + num + " is not ArmStrong ");
		}
	}
}