package prob5;

import java.util.Random;

import java.util.Scanner;

public class Prob5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Random r = new Random();

		while (true) {
			int k = r.nextInt(100) + 1;
			System.out.println("수를 결정하였습니다. 맞추어 보세요");
			int i = 1;
			int fir = 1;
			int last = 100;
			while (true) {
				System.out.println(fir + "-" + last);
				System.out.print(i++ + ">>");
				int input = scanner.nextInt();

				if (input > k) {
					System.out.println("더 낮게");
					last = input;
				} else if (input < k) {
					System.out.println("더 높게");
					fir = input;
				} else {
					System.out.println("맞았습니다.");
					break;
				}

			}

			System.out.print("다시 하시겠습니까(y/n)>>");

			String answer = scanner.next();
			if (!answer.toLowerCase().equals("y")) {
				break;
			}

		}
		scanner.close();
	}
}