package day1;

public class OddNumbersSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 50;
		int sum = 0;
		for(int i = 0; i < n; i++) {
			if(i%2 != 0) {
				sum += i;
				
			}
		}
		System.out.println(sum);
	}

}
