public class Test3
{
public static void main(String[]args)
{
Calculator cal=new Calculator();
           int ch=2;
switch(ch)
{
case 1:
cal.addition();
break;
case 2:
cal.subtraction();
break;
case 3:
cal.multiplication();
break;
case 4:
cal.division();
break;
default:
System.out.println("Invalid Inpute");
}
}
}