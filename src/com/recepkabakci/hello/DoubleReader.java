package com.recepkabakci.hello;

import java.util.Scanner;

public class DoubleReader {
	
	public double readX() {
		Scanner in = new Scanner(System.in);
		double retValue = in.nextDouble();
		in.close();
		return retValue;
	}

	public double readY() {
		Scanner in = new Scanner(System.in);
		double retValue = in.nextDouble();
		in.close();
		return retValue;
	}
}
