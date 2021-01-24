package learning_programs.practice.com;
public class AlternatePrimeNumberBetween1And100 {
	
	public static boolean isPrime(int num) {
		if(num == 2) {
			return true;
		}
		
		for(int i = 2; i <= num/2; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void printAlternatePrimeNumber() {
		
		int count = 0;
		for(int i = 2; i <= 100; i++) {
			if(isPrime(i)) {
				count++;
				
				if(count % 2 != 0) {
					System.out.print(i+" ");
				}
			}
		}
	}

	public static void main(String[] args) {
		printAlternatePrimeNumber();
	}

}