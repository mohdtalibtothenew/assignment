public class StaticTest {

    static  String firstName = "Mohd";
    static String lastName ="Talib";
    static int age;
    static{
        System.out.println("Inside static block");
        System.out.println("First Name :"+firstName+" Last Name :"+lastName);
    }
    static void info(){
        System.out.println("Inside static method");

        System.out.println("First Name :"+firstName+" Last Name :"+lastName);
    }
    public static void main(String args[])
    {
        info();


        System.out.println("By static variable");
        System.out.println("First Name :"+firstName+" Last Name :"+lastName);
    }


}
