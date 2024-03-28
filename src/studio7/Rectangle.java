package studio7;

public class Rectangle {
	
	private double length;
	private double width;
	
	public Rectangle(double initlength, double initwidth)
	{
		length = initlength;
		width = initwidth;
	}
	
	public void setLength(double length)
	{
		this.length = length;
	}
	
	public void setWidth(double width)
	{
		this.width = width;
	}
	
	public double getLength()
	{
		return length;
	}
	
	public double getWidth()
	{
		return width;
	}
	
	public double area()
	{
		double area = getLength() * getWidth();
		return area;
	}
	
	public double perimeter()
	{
		double perimeter = (2*getLength()) + (2*getWidth());
		return perimeter;
	}
	
	public boolean isSquare()
	{
		if (getWidth() == getLength())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean smallerThan(Rectangle other)
	{
		if(this.area() < other.area())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(2.776,2);
		Rectangle r2 = new Rectangle(10.543354,3.87);
		System.out.println(r1.smallerThan(r2));
		System.out.println(r1.isSquare());
		System.out.println(r2.isSquare());
		System.out.println(r1.area());
		System.out.println(r2.area());
		

	}

}
