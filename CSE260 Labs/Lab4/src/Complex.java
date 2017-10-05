
public class Complex {
	private double a, b;
	public Complex() {
		a = 0;
		b = 0;
	}
	public Complex(double a) {
		this.a = a;
		this.b = 0;
	}
	public Complex(double a, double b) {
		this.a = a;
		this.b = b;
	}
	public double getRealPart()
	{
		return a;
	}
	public double getImaginaryPart()
	{
		return b;
	}
	
	public String add(Complex c)
	{
		double real = a + c.getRealPart();
		double imaginary = b + c.getImaginaryPart();
		Complex total = new Complex(real, imaginary);
		return total.toString();
	}
	public String subtract(Complex c)
	{
		double real = a - c.getRealPart();
		double imaginary = b - c.getImaginaryPart();
		Complex total = new Complex(real, imaginary);
		return total.toString();
	}
	public String multiply(Complex second)
	{
		double c = second.getRealPart();
		double d = second.getImaginaryPart();
		double real = a*c - b*d;
		double imaginary = b*c + a*d;
		Complex total = new Complex(real, imaginary);
		return total.toString();
	}
	
	public String divide(Complex second)
	{
		double c = second.getRealPart();
		double d = second.getImaginaryPart();
		double real = (a*c + b*d)/(Math.pow(c, 2)+Math.pow(d, 2));
		double imaginary = (b*c - a*d)/(Math.pow(c, 2)+Math.pow(d, 2));
		Complex total = new Complex(real, imaginary);
		return total.toString();
	}
	
	public String toString()
	{
		return a + " + " + b + "i";
	}

}
