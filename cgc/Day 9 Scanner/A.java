
import java.util.Scanner;
public class A
{
public static void main(String[]args)
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter Number");
byte x= sc.nextByte();



System.out.println("Enter Number");
short s=sc.nextShort();

System.out.println("Enter Number");
long l=sc.nextLong();

System.out.println("Enter Number");
float f=sc.nextFloat();

System.out.println("Enter Number");
double d=sc.nextDouble();

System.out.println("Enter Name");
char ch = sc.next().charAt(0);

System.out.println("Enter Boolean");
boolean b=sc.nextBoolean();

System.out.println(x);
System.out.println(s);
System.out.println(l);
System.out.println(f);
System.out.println(d);
System.out.println(ch);
System.out.println(b);
}
}
