//JAVA program to implement multi level inheritance
class Animal{
	void makesSound(){
		System.out.println("Animals make sound");
	}
}
class Dog extends Animal{
	void makesSound(){
		System.out.println("Dog : Woof!");
	}	
}
class Puppy extends Animal{
	void makesSound(){
		System.out.println("Puppy : Yap!");
	}	
}
public class MultiLevel{
	public static void main(String[] args){
		Animal a=new Animal();
		Dog d=new Dog();
		Puppy p=new Puppy();
		a.makesSound();
		d.makesSound();
		p.makesSound();
	}
}
