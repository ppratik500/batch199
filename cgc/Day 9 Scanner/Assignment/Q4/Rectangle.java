import java.util.Scanner;

public class Rectangle
{
public void area()
{
Scanner sc=new Scanner(System.in);
double length= sc.nextDouble();
double width= sc.nextDouble();

double area=length*width;

System.out.println("area of rectangle:"+area);
}
}