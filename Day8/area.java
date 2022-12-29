abstract class poly
{

public abstract void show();

}
class trian extends poly
{
public void show()
{

System.out.println("This is first subclass");
}
}
class rect extends poly
{
public void show()
{

System.out.println("This is second subclass");

}
}
class area{
public static void main(String args[])
{

rect b=new rect();
b.show();
trian c=new trian();
c.show();
}
}