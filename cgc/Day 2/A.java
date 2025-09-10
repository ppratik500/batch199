public class A
{
public void m1()
{
System.out.println("Hello");
}
public static void main (String[]args)
{
System.out.println("main");
new A().m1();
}
}