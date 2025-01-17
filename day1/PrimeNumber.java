package day1;

public class PrimeNumber {
	public void primeNumbers(int n) {
		
		for(int i=2; i<n; i++) {
			boolean isPrime = true;
			
			for(int j=2; j*j<=i; j++) {
				if(i%j == 0) {
					isPrime = false;
					break;
				}
			}
					
				if(isPrime)
					System.out.print(i + " ");
			
		}
		
		
	}
	
	
public void SumPrimeNumbers(int n) {
	int sum = 0;
		
		for(int i=2; i<n; i++) {
			boolean isPrime = true;
			
			for(int j=2; j*j<=i; j++) {
				if(i%j == 0) {
					isPrime = false;
					break;
				}
			}
					
				if(isPrime)
					sum +=	i;		
		}
		System.out.println( " ");
		System.out.println(sum + " ");
	
	}

public void AvgPrimeNumbers(int n) {
	int sum = 0,avg = 0, count = 0;
		
		for(int i=2; i<n; i++) {
			boolean isPrime = true;
			
			for(int j=2; j*j<=i; j++) {
				if(i%j == 0) {
					isPrime = false;
					break;
				}
			}
					
				if(isPrime) {
					sum +=	i;
					count++;
				}
		}
		System.out.println( " ");
		
		avg = sum/count;
		
		System.out.println(avg + " ");
	
	}

	public static void main(String[] args) {
		PrimeNumber pm = new PrimeNumber();
		pm.primeNumbers(20);
		pm.SumPrimeNumbers(20);
		pm.AvgPrimeNumbers(20);
	}
}
