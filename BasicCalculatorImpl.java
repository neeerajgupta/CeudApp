package intern.BasicCalculater;

public class BasicCalculatorImpl implements BasicCalculator {
	public static void main(String[] args) {
	
	}

	
	@Override
	public int add(int a, int b) {
		 int ans = a + b;
	      System.out.println("ICalculator - add " + a + " und " + b + "= " + ans);
	      return ans;
	}

	@Override
	public int subtract(int a, int b) {
		 int ans = a -b;
	      System.out.println("ICalculator - subtract " + a + " und " + b
	        + "= " + ans);
	      return ans;
	}

	@Override
	public int min(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int crosssum(int a) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int multiply(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}
}