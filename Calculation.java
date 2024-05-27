public class Calculation {
	public static void calculate(String operation, float firstNumber, float secondNumber) {
		try {
			switch (operation) {
				case "+":
					System.out.println(add(firstNumber, secondNumber));
					break;
				case "-":
					System.out.println(subtraction(firstNumber, secondNumber));
					break;
				case "*":
					System.out.println(multiplication(firstNumber, secondNumber));
					break;
				case "/":
					if (secondNumber == 0) {
						throw new ArithmeticException();
					}
					System.out.println(division(firstNumber, secondNumber));
					break;
				default:
					break;
			}
		} catch (ArithmeticException e) {
			System.out.println("You can't divide by zero!");
		}
	}

	private static float add(float firstNumber, float secondNumber) {
		return firstNumber + secondNumber;
	}

	private static float subtraction(float firstNumber, float secondNumber) {
		return firstNumber - secondNumber;
	}

	private static float multiplication(float firstNumber, float secondNumber) {
		return firstNumber * secondNumber;
	}

	private static float division(float firstNumber, float secondNumber) {
		return firstNumber / secondNumber;
	}
}

