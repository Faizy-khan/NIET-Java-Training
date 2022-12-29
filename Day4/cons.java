class A
{
A(int x)
{
System.out.println("A's Class Const");
}
A()
{
System.out.println("Parents's Class Const");
}
void display()
{
System.out.println("Parents's Class display");
}
}
class B extends A
{
B()
{
System.out.println("B's Class Const");
}
}
class C extends B
{
C()
{

System.out.println("C's Class Const");

}
void show()
{
System.out.println("Child class Show");
}
}
class cons
{
public static void main(String args[])
{
new C();
//new A(5);
}
}                                                          