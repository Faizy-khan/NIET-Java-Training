abstract class poly
{
public abstract void areaa();
void show()
{
System.out.println("Fun1");
}
}
class trian extends poly
{
public void areaa()
{
int b=10;
int h=5;
double result=0.5*b*h;
System.out.println("The Area of triangle is = ");
System.out.println(result);
}
}
class rect extends poly
{
public void areaa()
{
int l=10;
int b=5;
double result=b*l;
System.out.println("The Area of Rectangle is = ");
System.out.println(result);
}
}
class area{
public static void main(String args[])
{
poly a=new trian();
a.areaa();
poly b=new rect();
b.areaa();
}
}