package example;

import java.lang.Math;

public class Main {	
	
	public static void main(String args[]) {
		new MathComputation(new External()).compute();
	}
}

class External implements MathComputation.Externals {

	@Override
	public int log(int x0, int x1) {
		return (int) (Math.log(x0) / Math.log(x1));
	}
	
}

class MathComputation {
	
	private Externals externals;
	
	public static interface Externals {
		public int log(int x0, int x1);
	}
	
	public MathComputation(Externals _externals) {
   		externals = _externals;
	}
			
	public void compute() {
		System.out.println("simple calculation -> 5 + 1" + " = " + (5 + 1));
				
		System.out.println("power calculation -> Math.pow(5, (2 * 3))" + " = " + (Math.pow(5, (2 * 3))));
				
		System.out.println("external calculation -> externals.log(10, 2)" + " = " + (externals.log(10, 2)));
				
		int y = 3;
		System.out.println("defined y = 3");
		System.out.println("y + 4" + " = " + (y + 4));
		
		int z = 5;
		System.out.println("defined z = 5");
		y = 4;
		System.out.println("defined y = 4");
		System.out.println("z * y" + " = " + (z * y));
		
		int g = 2;
		System.out.println("defined g = 2");
		z = 7;
		System.out.println("defined z = 7");
		int x = 34;
		System.out.println("defined x = 34");
		y = 5;
		System.out.println("defined y = 5");
		System.out.println("x + y + z - g" + " = " + (x + y + z - g));
		
	}
}
