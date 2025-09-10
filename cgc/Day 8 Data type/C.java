public class C
{
byte b=42;
short s=52;
int i=350;
long l=520;
float f=45.23f;
double d=65.60;
char c='P';
boolean flag=true;
String s1;
C b1;
public void m1()
{
System.out.println(b);
System.out.println(s);
System.out.println(i);
System.out.println(l);
System.out.println(f);
System.out.println(d);
System.out.println(c);
System.out.println(flag);
System.out.println(s1);
System.out.println(b1);
}
public static void main(String[]args)
{
C a=new C();
  a.m1();
}
}