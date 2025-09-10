public class CJC
{
String instituteName;
public CJC()
{
instituteName="Welcome to CJC";
}

public void cjcInfo()
{
System.out.println(instituteName);
}
public static void main(String[]args)
{

CJC c1= new CJC();
   c1.cjcInfo();
}
}