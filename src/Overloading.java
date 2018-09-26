public class Overloading
{
    public static void main(String[] args)
    {

        Overloading s=new Overloading();
        System.out.println("Sum of int values = " + s.sum(10,20));
        System.out.println("Sum of double values = " + s.sum(10.5,20.5));
        System.out.println();

        System.out.println("product of int values = " + s.Multiply(10,20));
        System.out.println("product of double values = " + s.Multiply(10.5f,20.5f));
        System.out.println();

        System.out.println("Concatenation of two String values = " + s.String_over("Hello ","World"));
        System.out.println("Concatenation of three String values = " + s.String_over("To","The","New"));
    }

    public int sum(int x,int y)
    {
        return x+y;
    }
    public double sum(double x,double y)
    {
        return x+y;
    }

    public int Multiply(int x,int y)
    {
        return x*y;
    }
    public float Multiply(float x,float y)
    {
        return x*y;
    }

    public String String_over(String x,String y)
    {
        return x+y;
    }
    public String String_over(String x,String y,String z)
    {
        return x+y+z;
    }
}