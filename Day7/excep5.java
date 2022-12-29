class excep5
{
static void val(int age)
{
if (age<=18)
{
throw new ArithmeticException("Not valid !!!!!!!!!!!!");
}
else
{
System.out.println("Welcome to voting");
}
}
public static void main(String args[])
{
excep5 a = new excep5();

a.val(20);
a.val(12);
}
}