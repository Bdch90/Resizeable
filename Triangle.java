public class Triangle extends Shape
{

	private double side1 = 1;
	private double side2 = 1;
	private double side3 = 1;
	public Triangle(){}
	public Triangle(double side1,double side2,double side3)
	{
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	public double getSide1()
	{
		return this.side1;
	}
	public double getSide2()
	{
		return this.side2;
	}
	public double getSide3()
	{
		return this.side3;
	}
	public double getPerimeter()
	{
		return side1 + side3 + side2;
	}

	@Override
	public String toString()
	{
		return super.toString() + "\nside1 : " + getSide1() + "\nside2 : " + getSide2() +
				"\nside3 : " + getSide3() + "\nPerimeter : " + getPerimeter();
	}
}
