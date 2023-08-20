package intern.BasicCalculater;

public interface BasicCalculator {
	/** Returns a+b */
	public int add(int a, int b);

	/** Returns a-b */
	public int subtract(int a, int b);

	/** Returns a*b */
	public int multiply(int a, int b);

	/** Returns minimum of a and b */
	public int min(int a, int b);

	/** Calculate cross sum */
	public int crosssum(int a);

}
