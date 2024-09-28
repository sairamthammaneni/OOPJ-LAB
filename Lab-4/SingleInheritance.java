//JAVA program to implement single inheritance
class Vehicle{
	void start(){
		System.out.println("Vehicle started");
	}
}
class car extends Vehicle{
	void start(){
		System.out.println("Car started");
	}
}
public class SingleInheritance{
	public static void main(String[] args){
		Vehicle v=new Vehicle();
		v.start();
		car c= new car();
		c.start();
	}
}
