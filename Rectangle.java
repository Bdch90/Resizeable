
public class Rectangle extends Shape implements Resizeable 
{
	private double width = 1.0;
	private  double length = 2.0;

	public Rectangle(){}
	public Rectangle(double side, double v, String color, boolean filled){}
	public Rectangle( double width, double length )
	{
		this.width = width;
		this.length = length;
	}
	public Rectangle( String color, boolean filled, double width, double length )
	{
		super(color,filled);
		this.width = width;
		this.length = length;
	}
	public double getWidth()
	{
		return this.width;
	}
	public void setWidth(double width)
	{
		this.width = width;
	}
	public double getLength()
	{
		return this.length;
	}
	public void setLength(double length)
	{
		this.length = length;
	}
	public double getArea()
	{
		return this.length * this.width;
	}
	public double getPerimeter()
	{
		return ( this.length + this.width ) * 2;
	}

	@Override
	public String toString() {
		return "A Rectangle with length : " + getLength() + " width : " + getWidth() + super.toString();
	}
	@Override
	public void resize(int percent)
	{
		this.width += this.width * percent / 100.0;
		this.length += this.length * percent / 100.0;
	}
}
