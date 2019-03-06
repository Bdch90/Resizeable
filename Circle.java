
public class Circle extends Shape implements Resizeable 
{
	private double percent;
	private double radius = 1;
	public Circle () {}
	public Circle (double radius)
	{
		this.radius = radius;
	}
	public Circle (double radius, String color, boolean filled)
	{
		super (color,filled);
		this.radius = radius;
	}
	public double getRadius ()
	{
		return this.radius;
	}
	public void setRadius (double radius)
	{
		this.radius = radius;
	}
	public double getArea ()
	{
		return this.radius * this.radius * Math.PI;
	}
	public double getPerimeter ()
	{
		return this.radius * 2 * Math.PI;
	}

	@Override
	public String toString () {
		return "A Circle with radius : " + getRadius () + " ,  " + super.toString ();
	}
	@Override
	public void resize(int percent)
	{
		this.radius += this.radius * percent / 100.0;
	}

}
