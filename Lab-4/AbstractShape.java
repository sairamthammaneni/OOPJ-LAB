//Java program to find area of different shapes using absract class
abstract class shape{
	abstract double Area();
}
class circle extends shape{
	double r;
	circle(double r){
		this.r=r;
		System.out.println("Circle");
	}
	double Area(){
		return 3.14*r*r; 
	}
}
class rectangle extends shape{
	double l,w;
	rectangle(double l,double w){
		this.w=w;
		this.l=l;
		System.out.println("Rectangle");
	}
	double Area(){
		return l*w;
	}
}
public class AbstractShape{
	public static void main(String[] args){
		circle c=new circle(20);
		System.out.println("Area : "+c.Area());
		rectangle r=new rectangle(10,15);
		System.out.println("Area : "+r.Area());
	}
}
