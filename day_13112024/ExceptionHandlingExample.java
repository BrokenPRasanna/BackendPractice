package day_13112024;

public class ExceptionHandlingExample {
	public static void main(String[] args) {
		try {
			int result = calculate(10, 0);
			System.out.println("Result: " + result);
		} catch (ArithmeticException e) {
			System.out.println("Exception caught: " + e.getMessage());
			System.out.println("Cannot divide by zero. Please check your inputs.");
		} finally {
			System.out.println("Execution completed. Always ensure proper inputs.");
		}
	}

	public static int calculate(int a, int b) {
		return a / b;
	}
}
