//Java program to implement interfaces
interface shape{
	double Area();
}
interface color{
	void color();
}
class circle implements shape,color{
	double r;
	String color;
	circle(double r,String color){
		this.r=r;
		this.color=color;
		System.out.println("Circle");
	}
	public double Area(){
		return 3.14*r*r;
	}
	public void color(){
		System.out.println("Color : "+color);
	}
}
public class Interfaces{
	public static void main(String[] args){
		circle c=new circle(20,"Red");
		System.out.println("Area : "+c.Area());
		c.color();
	}
}
