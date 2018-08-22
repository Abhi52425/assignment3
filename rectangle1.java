import java.util.Scanner;
class rectangle
{
	Scanner sc=new Scanner(System.in);
	double area,length,breadth;
	rectangle()
	{
		length=sc.nextDouble();
		breadth=sc.nextDouble();
	}

	void CalculateArea()
	{
		area=(length*breadth);
		System.out.println("The Area of rectangle Is: " + area);
	}
	
}
class rectangle1
{
	public static void main(String[] args) 
	{
		System.out.println("Enter length and breadth ");
		rectangle x=new rectangle();
		x.CalculateArea();	
	}
}