package studio7;

public class Fraction {
	
	private int num;
	private int denom;
	
	public Fraction(int initNum, int initDenom)
	{
		num = initNum;
		denom = initDenom;
	}
	
	public void setNum(int num)
	{
		this.num = num;
	}
	
	public void setDenom(int denom)
	{
		this.denom = denom;
	}

	public int getNum()
	{
		return num;
	}
	
	public int getDenom()
	{
		return denom;
	}
	
	public Fraction mult(Fraction other)
	{
		int newNum = this.num * other.num;
		int newDenom = this.denom * other.denom;
		return new Fraction(newNum, newDenom);
	}
	
	public static void main(String[] args) {
		Fraction f1 = new Fraction(3,4);
		Fraction f2 = new Fraction(5,6);
		System.out.println(f1.mult(f2));
	}

}
