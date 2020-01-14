package utils;

public class Ratio {
	private double ratio;
	public Ratio(double input, double output) {
		ratio = input/output;
	}
	public double calculateRatio(double d) {
		return d/ratio;
	}
	public double calculateInverseRatio(double d) {
		return d*ratio;
	}
}
