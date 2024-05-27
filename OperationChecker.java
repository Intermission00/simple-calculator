import java.util.ArrayList;

public class OperationChecker {
	public static void isOperationExists(String typeOfOperation) throws UnidentifiedTypeOfOperationException {
		ArrayList<String> operators = new ArrayList<>();
		operators.add("+");
		operators.add("-");
		operators.add("/");
		operators.add("*");

		if(!(operators.contains(typeOfOperation))){
			throw new UnidentifiedTypeOfOperationException();
		}
	}
}
