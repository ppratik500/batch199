public class Calculator
{
int a;
int b;

public Calculator()
{
a=10;
b=20;
}

public void add()
{
int result= a+b;
System.out.println("Addition:"+result);
}

public void subtract()
{
int result= a-b;
System.out.println("Subtraction:"+result);
}


public void multiply()
{
int result= a*b;
System.out.println("Multiplication:"+result);
}

public void divide()
{
int result= a/b;
System.out.println("Division:"+result);
}
}
