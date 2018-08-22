class t1
{
  static int i;
  static
  {
    System.out.println("hello");
  }
  t1()
  {
    System.out.println("how are you"); 
  }
}
class static1
{
  public static void main(String[] args) {
    t1 x=new t1();
    
  }
}