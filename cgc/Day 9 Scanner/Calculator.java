
import java.util.Scanner;
public class Calculator
{
Scanner sc= new Scanner(System.in);

public void addition()
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

public static void main(String[]args)
{
Scanner sc= new Scanner(System.in);
Calculator ca= new Calculator();

System.out.println("Enter the choice no upto4");
int ch=sc.nextInt();

if(ch==1){
cal.addition();
}
eals if(ch==2);
cal.Subtraction();
}
eals if(ch==3);
cal.Multiplication();
}
eals if(ch==4);
cal.Division();
}
eals{
System.out.println("Invalide Inpute");
}
}
}