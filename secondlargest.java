import java.lang.*;
import java.util.*;
class secondgreatest
{
    Scanner x1=new Scanner (System.in);
    int i=0,j,temp;
    int arr[]=new int [10];
    secondgreatest()
    {
      for(i=0;i<10;i++)
        {
          arr[i]=x1.nextInt();
        }  
    }
    void sort()
    {
      for(i=0;i<10;i++)
    {
      for(j=0;j<10;j++)
      {
        if(arr[i]<arr[j])
        {
          temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
        }
      }
    }
    }
    void largest()
    {
      System.out.println("Second Largest No. in the array is: " + arr[8]);
    }

}
class secondlargest
{
  public static void main(String [] args)
  {
    
    System.out.println("Enter Ten Elements: ");
    secondgreatest x=new secondgreatest();
    x.sort();
    x.largest();

  }
}