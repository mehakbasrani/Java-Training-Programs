package day1;

public class OddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 50;
		int count = 0;
		for(int i=0; i<n; i++) {
			if(i%2 != 0) {
				count ++;
				
			}
		}
		System.out.print(count+ " ");
	}

}
