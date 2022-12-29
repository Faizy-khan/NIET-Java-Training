class excep4
{
void show()
{
try{
String s=null;
System.out.println("Value is : "+s.length());
}
catch(Exception e)
{
e.printStackTrace();
System.out.println("Length is null");
}
}
public static void main(String args[])
{
excep4 a = new excep4();
a.show();
}
}