package studio7;

public class Die {
	
	private int sides;
	
	public Die(int initSides)
	{
		sides = initSides;
	}
	
	public void setSides(int sides)
	{
		this.sides = sides;
	}
	
	public int getSides()
	{
		return sides;
	}
	
	public int roll()
	{
		int value = (int)(Math.random() * getSides()) + 1 ;
		return value;
	}

	public static void main(String[] args) {
		Die die1 = new Die(6);
		System.out.println(die1.roll());
	}

}
