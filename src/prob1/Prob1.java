package prob1;

import java.util.Scanner;

public class Prob1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("금액:");
		int money = scanner.nextInt();

		int[] ary2 = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };
		int[] ary = new int[10];

		while (money > 0) {

			if (money >= ary2[0]) {
				ary[0]++;
				money -= ary2[0];
			}

			if (money >= ary2[1] && money < ary2[0]) {
				ary[1]++;
				money -= ary2[1];
			}

			if (money >= ary2[2] && money < ary2[1]) {
				ary[2]++;
				money -= ary2[2];
			}

			if (money >= ary2[3] && money < ary2[2]) {
				ary[3]++;
				money -= ary2[3];
			}
			if (money >= ary2[4] && money < ary2[3]) {
				ary[4]++;
				money -= ary2[4];
			}
			if (money >= ary2[5] && money < ary2[4]) {
				ary[5]++;
				money -= ary2[5];
			}
			if (money >= ary2[6] && money < ary2[5]) {
				ary[6]++;
				money -= ary2[6];
			}
			if (money >= ary2[7] && money < ary2[6]) {
				ary[7]++;
				money -= ary2[7];
			}
			if (money >= ary2[8] && money < ary2[7]) {
				ary[8]++;
				money -= ary2[8];
			}
			if (money >= ary2[9] && money < ary2[8]) {
				ary[9]++;
				money -= ary2[9];
			}
		}

		for (int i = 0; i < 10; i++) {
			System.out.println(ary2[i] + "원 : " + ary[i] + "개");
		}

		scanner.close();
	}
}