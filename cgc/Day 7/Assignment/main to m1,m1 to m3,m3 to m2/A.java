public class A
{
public void m1()
{
System.out.println("m1 method");
{
A a=new A();
  a.m3();
}
}
public void m2()
{
System.out.println("m2 method");
}
public void m3()
{
System.out.println("m3 method");
{
A a=new A();
  a.m2();
}
}
public static void main(String[]args)
{
A a=new A();
  a.m1();
}
}