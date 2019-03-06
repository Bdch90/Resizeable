
public class Square extends Rectangle implements Resizeable 
{
	private double side = 1.0;
	public Square(){

	}
	public Square( double side)
	{
		super(side,side);
	}
	public Square(double side, String color, boolean filled)
	{
		super(side,side,color,filled);
	}
	public double getSide()
	{
		return this.side;
	}
	public void setSide(double side)
	{
		setWidth(side);
		setLength(side);
	}
	@Override
	public void setWidth(double width)
	{
		setSide(width);
	}
	@Override
	public void setLength(double length)
	{
		setSide(length);
	}
	@Override
	public String toString()
	{
		return "A Square with side : " + getSide() + super.toString();
	}

}
