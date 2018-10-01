//Question 4

class Singleton{

    private static Singleton singleInstance = null;

    public String s;

    private Singleton()
    {
        s = "Hello I am a string part of Singleton class";
    }


    public static Singleton getInstance()
    {
        if (singleInstance == null)
            singleInstance = new Singleton();

        return singleInstance;
    }
}


class Test {
    public static void main(String args[])
    {

        Singleton object1 = Singleton.getInstance();

        Singleton object2 = Singleton.getInstance();

        Singleton object3 = Singleton.getInstance();

        object1.s = (object1.s).toUpperCase();

        System.out.println("String from object1 is " + object1.s);
        System.out.println("String from object2 is " + object2.s);
        System.out.println("String from object3 is " + object3.s);
        System.out.println();

        object3.s = (object3.s).toLowerCase();

        System.out.println("String from object1 is " + object1.s);
        System.out.println("String from object2 is " + object2.s);
        System.out.println("String from object3 is " + object3.s);
    }
}