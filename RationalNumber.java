
/**
 * This is the Rational Number class we will use it to create rational numbers
 * 
 * @author Chase Hall
 * @version 3-13-23 Project 2 CS131
 */
public class RationalNumber implements Comparable<RationalNumber> {

	private int numerator, denominator;// These will be used to create a rational number

	/**
	 * Allows you to construct a Rational Number
	 * 
	 * @param numer allows you to input a numerator through calling method
	 * @param denom allows you to input a denominator through calling method
	 */
	public RationalNumber(int numer, int denom) {
		if (denom == 0)
			denom = 1;

		// Make the numerator "store" the sign
		if (denom < 0) {
			numer = numer * -1;
			denom = denom * -1;
		}

		numerator = numer;
		denominator = denom;

		reduce();
	}// end constructor

	/**
	 * Outputs the numerator
	 * 
	 * @return the numerator
	 */
	public int getNumerator() {
		return numerator;
	}// end getNumerator

	/**
	 * Outputs the denominator
	 * 
	 * @return the denominator
	 */
	public int getDenominator() {
		return denominator;
	}// end getDenominator

	/**
	 * Outputs the opposite the rational number
	 * 
	 * @return the opposite rational number
	 */
	public RationalNumber reciprocal() {
		return new RationalNumber(denominator, numerator);
	}// end reciprocal

	/**
	 * Adds this rational number to the one passed as a parameter. A common
	 * denominator is found by multiplying the individual denominators.
	 *
	 * @param op2 used to input 2nd rational number
	 * @return a final Rational Number made from other two
	 */
	public RationalNumber add(RationalNumber op2) {
		int commonDenominator = denominator * op2.getDenominator();
		int numerator1 = numerator * op2.getDenominator();
		int numerator2 = op2.getNumerator() * denominator;
		int sum = numerator1 + numerator2;

		return new RationalNumber(sum, commonDenominator);
	}// end add

	/**
	 * Subtracts the rational number passed as a parameter from this rational
	 * number.
	 * 
	 * @param op2 used to input 2nd rational number
	 * @return a final Rational Number made from other two
	 */
	public RationalNumber subtract(RationalNumber op2) {
		int commonDenominator = denominator * op2.getDenominator();
		int numerator1 = numerator * op2.getDenominator();
		int numerator2 = op2.getNumerator() * denominator;
		int difference = numerator1 - numerator2;

		return new RationalNumber(difference, commonDenominator);
	}// end subtract

	/**
	 * Multiplies this rational number by the one passed as a parameter.
	 * 
	 * @param op2 used to input 2nd rational number
	 * @return a final Rational Number made from other two
	 */
	public RationalNumber multiply(RationalNumber op2) {
		int numer = numerator * op2.getNumerator();
		int denom = denominator * op2.getDenominator();

		return new RationalNumber(numer, denom);
	}// end multiply

	/**
	 * Divides this rational number by the one passed as a parameter by multiplying
	 * by the reciprocal of the second rational.
	 * 
	 * @param op2 used to input 2nd rational number
	 * @return a final Rational Number made from other two
	 */

	public RationalNumber divide(RationalNumber op2) {
		return multiply(op2.reciprocal());
	}// end divide

	/**
	 * Determines if this rational number is equal to the one passed as a parameter.
	 * Assumes they are both reduced.
	 * 
	 * @param op2 allows for input of second rational number
	 * @return true or false based on if their equal
	 */
	public boolean isLike(RationalNumber op2) {
		return (numerator == op2.getNumerator() && denominator == op2.getDenominator());
	}// end isLike

	/**
	 * Returns a Rational Number
	 */
	public String toString() {
		String result;

		if (numerator == 0)
			result = "0";
		else if (denominator == 1)
			result = numerator + "";
		else
			result = numerator + "/" + denominator;

		return result;
	}// end toString

	/**
	 * Reduces this rational number by dividing both the numerator and the
	 * denominator by their greatest common divisor.
	 */

	private void reduce() {
		if (numerator != 0) {
			int common = gcd(Math.abs(numerator), denominator);

			numerator = numerator / common;
			denominator = denominator / common;
		}
	}// end reduce

	/**
	 * Computes and returns the greatest common divisor of the two positive
	 * parameters. Uses Euclid's algorithm.
	 * 
	 * @param num1 used in calling method for first number
	 * @param num2 used in calling method for second number
	 * @return the greatest common denominator
	 */
	private int gcd(int num1, int num2) {
		while (num1 != num2)
			if (num1 > num2)
				num1 = num1 - num2;
			else
				num2 = num2 - num1;

		return num1;
	}// end gcd

	/**
	 * Allows you to compare two rational numbers and returns 1,0,-1 based on if the
	 * first number is greater, equal or less
	 */

	public int compareTo(RationalNumber r) {
		double f1 = (double) getNumerator() / (double) getDenominator();
		double f2 = (double) r.getNumerator() / (double) r.getDenominator();

		if (f1 - f2 == 0) {
			return 0;
		} else if (f1 - f2 < 0) {
			return (-1);
		} else {
			return 1;
		}

	}// end compareTo
}// end class
