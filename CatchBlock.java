package com;

public class CatchBlock {
	public void catchBlockNeverReachedException() {
		try {
			int num = 1/0;
			System.out.println("Catch block is never used.");
		}catch(Exception e) {
			System.out.println("Exception caught.");
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException caught.");
			System.out.println("This block leads to compile time error"
					+ " unreachable catch block error.");
		}
	}

}
