class a1{
public void display()
{
System.out.println("This is a1");
}
}
class a2 extends a1{
public void display1()
{
System.out.println("This is a2");
}
}
class a3 extends a1{
public void display2()
{
System.out.println("This is a3");
}
}
class heiraichal_inherit{
public static void main(String args[]){
a3 h= new a3();
h.display();
h.display();
h.display2();
}
}