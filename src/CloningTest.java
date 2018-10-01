//Question 5

class Employee implements Cloneable {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
public class CloningTest {


    public static void main(String args[]) {
        try {
            Employee s1 = new Employee(301, "Talib");

            Employee s2 = (Employee) s1.clone();

            System.out.println(s1.id + " " + s1.name);
            System.out.println(s2.id + " " + s2.name);

        } catch (CloneNotSupportedException c) {
        }

    }
}