//Question 10


import java.util.LinkedList;
import java.util.Queue;
class Customer extends Coffee
{
    int token;
    String foodItem;
    int foodPrice;
    public void order(String item,int price)
    {
        foodItem=item;
        foodPrice=price;
    }
    public int orderPlace() {
        return token;
    }
}
class Cashier extends Customer
{
    int waitTime;
    public int confirmOrder()
    {
        return waitTime ;
    }
    public String orderQueue()
    {
        return foodItem;
    }
}
class Barista extends Customer
{
    int orderid;
    Queue q=new LinkedList();
    void nextCust()
    {
        q.peek();
    }
    public void prepare()
    {
        boolean orderReady=true;
        System.out.println("preparing coffee");
        if(orderReady==true)
        {
            System.out.println(token+"Specified token is ready");
        }
        else
        {
            System.out.println("Preparing your item");
        }
    }
}
public class Coffee
{
    public static void main(String[] args) {
        Coffee c=new Customer();
        ((Customer) c).orderPlace();
        Coffee d=new Cashier();
        ((Cashier) d).confirmOrder();
        ((Cashier) d).orderQueue();
        Coffee p=new Barista();
        ((Barista) p).prepare();
        System.out.println("Enjoy your coffee");
    }
}