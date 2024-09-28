//JAVA program to find roots of a quadratic roots
import java.util.Scanner;
public class qroots {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.print("Enter a:");
		a=sc.nextInt();
		System.out.print("Enter b:");
		b=sc.nextInt();
		System.out.print("Enter c:");
		c=sc.nextInt();
		System.out.println("THe quadratic equation is :"+a+"X^2+"+b+"X+"+c);
		float d;
		d=(b*b)-(4*a*c);
		double m1,m2;
		if(d==0){
			m1=(-b)/(2*a);
			m2=m1;
			System.out.println("Roots are Real and Equal , Roots are :"+ m1 +"and"+ m1);
		}
		else if(d>0){
			m1=(-b+Math.sqrt(d))/(2*a);
			m2=(-b-Math.sqrt(d))/(2*a);
			System.out.println("Roots are Real and Distinct , Roots are :"+ m1 +"and"+ m2);						
		}
		else {
			System.out.println("Roots are Imaginary and have Complex values");
		}	
	}
}
