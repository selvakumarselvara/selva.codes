public class Calculator{
double add(double a,double b){
double c=a+b;
System.out.println("add value is"+c);
return c;
}
double sub(double a,double b)
{double c=a-b;
System.out.println("sub value is"+c);
return c;
}
double multi(double a,double b)
{double c=a*b;
System.out.println("multi value is"+c);
return c;
}
double divq(double a,double b)
{double c=a/b;
System.out.println("divq value is"+c);
return c;
}
double mod(double a,double b)
{double c=a%b;
System.out.println("multi value is"+c);
return c;
}
public static void main(String args[])
{
Calculator cal=new Calculator();
cal.add(5.0,7.0);
cal.sub(5.0,7.0);
cal.multi(5.0,7.0);
cal.divq(5.0,7.0);
cal.mod(5.0,7.0);
}
}

