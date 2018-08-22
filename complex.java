import java.util.Scanner;
class compl
{
	Scanner s1=new Scanner(System.in);
	int real,imag;
	compl()
	{
		real=s1.nextInt();
		imag=s1.nextInt();
	}

	void Display()
	{
		System.out.println(real + "+" + imag + "i");
	}
	
}
class complex
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Real and imaginary parts : ");
		compl c=new compl();
		c.Display();	
	}
}