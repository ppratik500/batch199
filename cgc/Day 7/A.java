public class A
{
public void m1()
{
System.out.println("m1 method");
}
public void m2()
{
System.out.println("m2 method");
A a=new A();
  a.m1();
}
public static void main(String[]args)
{
A a=new A();
  a.m2();
}
}
