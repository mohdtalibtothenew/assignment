import java.util.*;

public class PrintDuplicate {

    public static void main(String...args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter String");
    String str1 = sc.nextLine();
    String[] element =str1.split(" ");
    Map<String,Integer> map = new HashMap<>();
        ArrayList<String> al = new ArrayList<>();
    for(int i=0;i<element.length;i++){
        int count=1;
        for (int j=i+1;j<element.length;j++){
            if(element[i].equals(element[j])){
                count++;
                 al.add(element[i]);
                 map.put(element[i],count);
            }

        }
    }
        System.out.println(map);
       }
    }



