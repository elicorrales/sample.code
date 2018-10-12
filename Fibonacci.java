import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
public class Fibonacci {

	//just a reference to see how big these numbers could get.
	//not used in program.
	long a = Long.MAX_VALUE;
	double d = Double.MAX_VALUE;

	//used during 1st attempt (iterate starting at 0)
	//also used as a comparison( a check) against 2nd attempt (recursion starting a 0 and incrementing)
	BigInteger[] list;
	
	//used during 2nd attempt (recursion starting at 0 and incrementing)
	BigInteger[] list2;
	int index2;
	
	//used during 3rd attempt 
	BigInteger[] list3;
	int index3;
	int size3;

	static final double sqrtFive = Math.sqrt(5); 
	static final double oneOverSqrtFive = 1/sqrtFive;
	static final double powBasePlus  = (1 + sqrtFive)/2;
	static final double powBaseMinus  = (1 - sqrtFive)/2;
	static final BigDecimal bigDecimalOneOverSqrtFive = new BigDecimal(oneOverSqrtFive);
	static final BigDecimal bigDecimalPowBasePlus = new BigDecimal(powBasePlus);
	static final BigDecimal bigDecimalPowBaseMinus = new BigDecimal(powBaseMinus);
	
	//my own 1st attempt without help, just knowing that fibonacci means
	//0,1, 2 (0+1), 3 (2 + 1), etc
	void calcFibonacci(int size) {
		list = new BigInteger[size];
		list[0]=BigInteger.valueOf(0);
		list[1]=BigInteger.valueOf(1);
		for (int i=2;i<size;i++) { list[i] = list[i-1].add(list[i-2]); }
	}

	//my own 2nd attempt without help, just knowing that fibonacci means
	//0,1, 2 (0+1), 3 (2 + 1), etc
	public void calcFibonacci2(int size) {
		if (3>size) throw new RuntimeException("size must be at least 3");
		list2 = new BigInteger[size];
		list2[0] = BigInteger.valueOf(0);
		list2[1] = BigInteger.valueOf(1);
		index2 = 2;
		nextFibonacciNumber(list2[1],list2[0],size);
	}
	
	//this method is used by above 2nd attempt
	public BigInteger nextFibonacciNumber(BigInteger b, BigInteger a, int size) {

		size = size>0?--size:0;
		BigInteger temp = a;
		if (size>0) {
			a = b;
			b = b.add(temp);
			list2[index2] = b;
			if (index2<list2.length-1) {
				index2++;
				b = nextFibonacciNumber(b,a,size);
			}
		}
		return b;
	}

	//started out using this method to display a list of fibonacci numbers
	//but when nearing a list of 1000 numbers, it just goes silent;
	//does not fail and does not display anything.
	/*
	String toString(BigInteger[] list) {
		StringBuffer buf = new StringBuffer();
		buf.append("[");
		for (BigInteger i : list) {
			buf.append(i+",");
		}
		buf.append("]");
		return buf.toString();
	}
	 */

	void display(BigInteger[] list) {
		System.out.print("[");
		for (BigInteger b : list) {
			if (null!=b) System.out.print(b.toString()+",");
		}
		System.out.println("]");
	}

	//used this method to check if 2nd attempt matches 1st attempt
	void compareLists(BigInteger[] l1, BigInteger[] l2) {
		int s1 = l1.length;
		int s2 = l2.length;
		int size = (s1<2?s1:s2);
		if (0==size) throw new RuntimeException("Empty Lists");
		int i=0;
		for (;i<size;i++) {
			if (null==l1[i] || null==l2[i]) break;
			if (l1[i].longValue()!=l2[i].longValue()) throw new RuntimeException("List sequences dont match"); 
		}
		System.out.println("Sequences match to " + i);
	}

	
	/*
	 * this was based off of
	 * https://dzone.com/articles/what-fibonacci-taught-me-about
	 * (Javascript)
	 * 
	 * function fibMath(i) {
	 *  var sqrtFive = Math.sqrt(5);
	 *  var firstHalf = 0;
	 *  var secondHalf = 0;
	 *  firstHalf = 1 / sqrtFive * Math.pow( ( ( 1 + sqrtFive ) / 2), i);
	 *  secondHalf = 1 / sqrtFive * Math.pow( ( (1 - sqrtFive ) / 2 ), i);
	 *  return Math.round(firstHalf - secondHalf);
	 *}
	 * 
	 * 
	 */
	BigInteger fibMath(int i) {
		return fibMath(BigInteger.valueOf(i));
	}
	BigInteger fibMath(BigInteger i) {
		BigDecimal firstHalf  = bigDecimalOneOverSqrtFive.multiply(bigDecimalPowBasePlus.pow(i.intValue()));
		BigDecimal secondHalf = bigDecimalOneOverSqrtFive.multiply(bigDecimalPowBaseMinus.pow(i.intValue()));
		BigDecimal difference = firstHalf.subtract(secondHalf);

		//both of these return the same values, and the rounding becomes an issue after
		//reaching 1304969544928660
		return difference.round(new MathContext(difference.toBigInteger().toString().length(),RoundingMode.HALF_UP)).toBigInteger();
		//return firstHalf.subtract(secondHalf).setScale(0,RoundingMode.HALF_UP).toBigInteger();
}	

	public static void main(String[] args) {

		Fibonacci f = new Fibonacci();

		int size = 80;
		f.calcFibonacci(size);
		//System.out.println(f.toString(f.list));
		f.display(f.list);
		f.calcFibonacci2(size);
		f.display(f.list2);
		//System.out.println(f.toString(f.list));
		f.compareLists(f.list,f.list2);

		/*********************************************************************
		 * everything before this point was done from scratch without any
		 * help other than reviewing the very basics of fibonacci. one rule
		 * only: starting at zero and one, add them to get next number,
		 * add that result to previous, and keep going.
		 * 
		 * After this point(below), got more help. Using:
		 * F(n) = F(n-1) + F(n-2)
		 * 
		 * All methods related to below are part of the above explanation.
		 ********************************************************************/
		 int n = 0;
		System.out.print("[");
		 for (int i=0;i<size;i++) {
			System.out.print(f.fibMath(n++).toString() + ",");
		 }
		System.out.print("]");
	}

}
