//Question 11

public class ConvertedCode
{
    public static void main(String[] args)
    {
        int s = 0,i=0,j=0;
        int t = 1;
        while(i<10)
        {
            s = s + i;
            j=i;
            while(j>0)
            {
                t = t * (j - i);
                j--;
            }
            s = s * t;
            System.out.println("T is " + t);
            i++;
        }
        System.out.println("S is " + s);
    }
}