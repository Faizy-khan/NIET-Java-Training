class Returncons
{
Returncons Returncons()
{
System.out.println("Contructor Working Fine");
return new Returncons();
}
public static void main(String args[])
{
new Returncons();
}
}