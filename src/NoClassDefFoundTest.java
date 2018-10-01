//Question 3
//WAP to produce NoClassDefFoundError exception.
public class NoClassDefFoundTest
{
    public static void main(String[] args)
    {
        try {
            // The following line would throw ExceptionInInitializerError
            Testing t1 = new Testing();
        }
        catch (Throwable t) {
            System.out.println(t);
        }
        //The following line would cause NoClassDefFoundError
        Testing t2 = new Testing();
    }
}
class Testing
{
    static int undefined=1/0;
}