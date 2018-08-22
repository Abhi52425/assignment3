import java.util.*;
import java.lang.*;

class arr
{
  Scanner s1=new Scanner(System.in);
  int a[]=new int[10];
  int i,j;
  arr()
  {
    for(i=0;i<10;i++)
    {
      a[i]=s1.nextInt();
    }
  }
  void waveform1()
  {
    i=0;
    while(i<9)
    {
      j=a[i];
      a[i]=a[i+1];
      a[i+1]=j;
      i=i+2;
    }
    for(i=0;i<10;i++)
    {
      System.out.print(a[i] + " ");
    }
  }
}

class waveform
{
  public static void main(String[] args) 
  {
    System.out.println("Enter the Elements of array");
    arr x=new arr();
    x.waveform1();
    
  }
}