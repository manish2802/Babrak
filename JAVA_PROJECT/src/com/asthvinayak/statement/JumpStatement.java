package com.asthvinayak.statement;

public class JumpStatement {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Break
		FIRST: for (int i = 1; i <= 3; i++) {
			System.out.println("i: " + i);
			SECOND: for (int j = 1; j <= 10; j++) {
				if (j == 5) {
					break;
				}
				System.out.println(j);

			}

		}

		// continue
		for (int i = 1; i <= 10; i++) {

			if (i > 5) {
				System.out.println(i);
				continue;

			}
		}

		// break and continue
		int a = 5;
		while (a++ <= 12) { /// 5 6 7 8 9 10 11 12
			if (a < 7) {
				continue;
			}
			if (a > 7) {
				break; // control will be jump by loop that means loop will be terminted
			}
			System.out.println(a);

		}

	}
}
