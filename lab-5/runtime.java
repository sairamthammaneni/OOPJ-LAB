//Java program to demonstrate runtime polymorphism
abstract class vehicle{
	void display(){
		System.out.println("This is a Vehicle");
	}
	abstract void color();
}
class Car extends vehicle{	
	void display(){
		System.out.println("This is Car");
	}
	void color(){
		System.out.println("Color : Red");
	}
}
public class runtime{
	public static void main(String[] args){
		vehicle c=new Car();
		c.display();
		c.color();
	}
}
