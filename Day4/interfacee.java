interface my
{
void show();
}
interface my1 extends my
{
void show1();
}
class intex implements my,my1
{
public void show()
{
System.out.println("Show");
}
public void show1()
{
System.out.println("Show1");
}
}
class interfacee
{
public static void main(String args[])
{
intex a=new intex(); 
a.show();
a.show1();
}}