//Question 6

public class MultiCatchAndFinally {
    public static void main(String args[]) {
        try {
            int a[] = new int[5];
            a[5] = 9 / 0;


        } catch (ArithmeticException ex) {
            System.out.println(ex);
        }
         catch(ArrayIndexOutOfBoundsException e){System.out.println(e);}
         catch(Exception e){System.out.println(e);}
        finally {
            System.out.println("Finally block executed");
        }
    }
}


