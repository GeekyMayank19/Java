import java.lang.Math;
public class Fraction {
	private int numerator;
	private int denominator;
	
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		if (denominator == 0) {
			// TODO error out
		}
		this.denominator = denominator;
		simplify();
	}
	
	
	public int getDenominator() {
		return denominator;
	}
	
	public int getNumerator() {
		return numerator;
	}
	
	public void setNumerator(int n) {
		this.numerator = n;
		simplify();
	}
	
	
	public void setDenominator(int d) {
		if (d == 0){
			// TODO error out
			return;
		}
		this.denominator = d;
		this.simplify();
	}
	
	public void print() {
		if (denominator == 1) {
			System.out.println(numerator);
		} else {
			System.out.println(numerator + "/" + denominator);
		}

		
	}
	
	private void simplify() {
		
	}
	
	// public static Fraction add(Fraction f1, Fraction f2) {
		
	// }
	
	public void add(Fraction f2) {
		
	}
	
	public void multiply(Fraction f2) {
		
	}
    public static void main(String[] args) {
        
    }
	
}
