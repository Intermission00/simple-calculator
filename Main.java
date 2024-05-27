import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Simple calculator. \n \n Possible operations: \n -addition [ + ] \n -subtraction [ - ] \n -multiplication [ * ]  \n -division [ / ] \n");

		try {
			System.out.print("Enter first number: ");
			float firstNumberInput = scanner.nextFloat();

			System.out.print("Type of operation: ");
			String typeOfOperation = scanner.next();
			OperationChecker.isOperationExists(typeOfOperation);

			System.out.print("Enter second number: ");
			float secondNumberInput = scanner.nextFloat();

			Calculation.calculate(typeOfOperation, firstNumberInput, secondNumberInput);
		} catch (InputMismatchException e) {
			System.out.println("You need to input numbers, not letter");
		} catch (UnidentifiedTypeOfOperationException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Press ENTER to exit");
		System.in.read();
		scanner.close();
	}
}