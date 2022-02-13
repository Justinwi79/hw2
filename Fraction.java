// Harold Justin Windham
// Class Fraction

class Fraction
{
  private int numerator = 0;		// numerator (and keeps sign)
  private int denominator = 1;		// always stores positive value

  public Fraction()
  {

  }

  public Fraction(int n)
  {
    this(n,1);
  }

  public Fraction(int n, int d)
  {
    if (set(n,d)==false)
	set(0,1);
  }

  public boolean set(int n, int d)
  {
    if (d > 0)
    {
	numerator = n;
	denominator = d;
	return true;
    }
    else
	return false;
  }
  
  public void show()
  {
    System.out.print(numerator + "/" + denominator);
  }

  public String toString()
  {
    return (numerator + "/" + denominator);
  }

  public int getNumerator()
  {
    return numerator;
  }

  public int getDenominator()
  {
    return denominator;
  }

  public double decimal()
  {
    return (double)numerator / denominator;
  }

  // more features? -- think some up and add them!
  // Added methods:
  // ideas for math algorithms found at geeksforgeeks.org and stackoverflow.com

  public Fraction simplify()
  {
	int n = this.getNumerator();
	int d = this.getDenominator();
	if(n == 0)
	{
		d = 1; //set dem to 1 if num is 0 
	}
	else
    {
		for(int i = d; i > 0; i--)
		{
			if(n % i == 0 && d % i == 0)
			{   // reducing fraction 
				n = n / i;
				d = d / i;
			}
		}
	  }
	  if(d < 0)
	  {  // giving sign to numerator if denominator is negative 
		d = d * -1;
		n = n * -1;
	  }
	  Fraction temp = new Fraction(n,d);
	  return temp;
  }

  public Fraction add(Fraction f)
  {
	  int n1 = this.getNumerator();
	  int d1 = this.getDenominator();
	  int n2 = f.getNumerator();
	  int d2 = f.getDenominator();
	  int n = 0, d = 0;
	  // add numerator while finding gcd
	  n = ((n1 * d2) + (n2 * d1));
	  d = (d1 * d2);
	  
	  if(d < 0)
	  {  // giving sign to numerator 
		d = d * -1;
		n = n * -1;
	  }
	  Fraction temp = new Fraction(n,d);
	  temp = temp.simplify();
	  return temp;
  }

  public Fraction subtract(Fraction f)
  {
	  int n1 = this.getNumerator();
	  int d1 = this.getDenominator();
	  int n2 = f.getNumerator();
	  int d2 = f.getDenominator();
	  int n = 0, d = 0;
	  // subtract numerator while finding gcd 
	  n = ((n1 * d2) - (n2 * d1));
	  d = (d1 * d2);
	  if(d < 0)
	  {  // giving sign to numerator 
		d = d * -1;
		n = n * -1;
	  }
	  Fraction temp = new Fraction(n,d);
	  temp = temp.simplify();
	  return temp;
  }

  public Fraction multiply(Fraction f)
  {
	  int n1 = this.getNumerator();
	  int d1 = this.getDenominator();
	  int n2 = f.getNumerator();
	  int d2 = f.getDenominator();
	  int n = 0, d = 0;
	  // multiplication of num and dem
	  n = n1 * n2;  
	  d = d1 * d2;
	  
	  if(d < 0)
	  {   // giving sign to numerator 
		d = d * -1;
		n = n * -1;
	  }
	  Fraction temp = new Fraction(n,d);
	  temp = temp.simplify();
	  return temp;
  }

  public Fraction divide(Fraction f) 
  {
	  int n1 = this.getNumerator();
	  int d1 = this.getDenominator();
	  int n2 = f.getNumerator();
	  int d2 = f.getDenominator();
	  int n = 0, d = 0;
	  // division by multiplication of nums and dems
	  n = n1 * d2;
	  d = d1 * n2;
	  
	  if(d < 0)
	  {   // giving sign to numerator 
		d = d * -1;
		n = n * -1;
	  }
	  Fraction temp = new Fraction(n,d);
	  temp = temp.simplify();
	  return temp;
  }

  // sample test program
  public static void main(String[] args)
  {
    Fraction f1, f2;
    f1 = new Fraction();
    f2 = new Fraction(3, 5);

    System.out.print("\nFraction f1 = ");
    f1.show();
    System.out.print("\nFraction f2 = " + f2);	// uses toString

    System.out.println("\nCalling f1.set(11,14)");
    if (f1.set(11,14) == false)
	System.out.println("** set attempt failed");
    System.out.println("\nCalling f2.set(4,0)");
    if (!f2.set(4,0))
	System.out.println("** set attempt failed");

    System.out.print("\nFraction f1 = ");
    f1.show();
    System.out.print("\nFraction f2 = ");
    f2.show();

    System.out.println("\nDecimal value of f1 = " + f1.decimal());
    System.out.println("Decimal value of f2 = " + f2.decimal());
  }  

}