package com.classesobject;

public class SumMethodOverloading {
	SumMethodOverloading() {
		int number1 = 23;
		int number2 = 34;
		int number3 = 35;
		int Addition1 = number1 + number2 + number3;
		System.out.println("Addition1 = " + Addition1);

	}

	SumMethodOverloading(int number4, int number5) {
		int Addition2 = number4 + number5;
		System.out.println("Addition2 = " + Addition2);
	}

	SumMethodOverloading(int number6, int number7, int number8) {
		int Addition3 = number6 + number7 + number8;
		System.out.println("Addition3 = " + Addition3);
	}

	public static void main(String arg[]) {
		SumMethodOverloading Addition1 = new SumMethodOverloading();
		SumMethodOverloading Addition2 = new SumMethodOverloading(30, 23);
		SumMethodOverloading Addition3 = new SumMethodOverloading(23, 56);
	}

}
