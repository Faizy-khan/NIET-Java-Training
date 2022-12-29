abstract class abst{
public abstract void display();
void show()
{
System.out.println("Show method");
}
}
class abstractTest extends abst
{
public void display()
{
System.out.println("Display method");
}
}
class Abstract
{
public static void main(String args[])
{
abst ac= new abstractTest();
ac.display();
ac.show();
}
}