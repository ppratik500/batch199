import java.util.Scanner;

public class Calculator
{
Scanner sc= new Scanner(System.in);

public void Addition()
{
int a=sc.nextInt();
int b=sc.nextInt();
System.out.println("Addition:"+(a+b));
}

public void Subtraction()
{
int x=sc.nextInt();
int y=sc.nextInt();
System.out.println("Subtraction:"+(x-y));
}

public void Multiplication()
{
int c=sc.nextInt();
int d=sc.nextInt();
System.out.println("Multiplication:"+(c*d));
}

public void Division()
{
int g=sc.nextInt();
int h=sc.nextInt();
System.out.println("Division:"+(g/h));
}
}