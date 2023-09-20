package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {

		System.out.println("Enter an integer");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		boolean[] isPrime = new boolean[n];

		for (int i = 2; i < n; i++) {
			isPrime[i] = true;
		}

		for (int j = 2; j < n; j++) {
			if (isPrime[j]) {
				for (int i = j+j; i < n; i += j) {
					isPrime[i] = false;
				}
				System.out.println(j);

			}
		}

	}

}
