package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = in.nextInt();
		
		boolean [] primeNum = new boolean [n];
		for (int i = 2; i < n; i++) {
			primeNum[i] = true; //setting all values true 
		}
		
		for(int i = 2; i < n; i++) {
			if (primeNum[i] = true){
				for(int x = 2*i; x < n; x = x + i ) {
					primeNum[i] = false;
					//System.out.println(primeNum[i]);
				}
			}
		}
		//return [i]; 
	}

}
