
import java.util.Scanner;
public class Test
{
public static void main(String[]args)
{
Scanner sc= new Scanner(System.in);
Calculator cal= new Calculator();

System.out.println("Enter 1 for addition\n Enter 2 for subtraction\n Enter 3 for multiplication\n Enter 4 for division\n Enter 0 for terminate");

int ch= sc.nextInt();
System.out.println("Enter 1 number");
int num1= sc.nextInt();

System.out.println("Enter 2 number");
int num2= sc.nextInt();


if(ch==1)
{
cal.addition(num1,num2);
}
else if(ch==2)
{
cal.subtaction(num1,num2);
}
else if(ch==3)
{
cal.multiplication(num1,num2);
}
else if(ch==4)
{
cal.division(num1,num2);
}
else
{
System.out.println("Invalid Input");
}
while(true);
}
}
