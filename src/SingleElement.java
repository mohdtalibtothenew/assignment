import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class SingleElement {
    public static void main(String[] args) {


        int[] element ={1,1,2,5,5};
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<element.length;i++){
            if(!map.containsKey(element[i])){
                map.put(element[i],0);
            }
            if(map.containsKey(element[i])){
                map.put(element[i],map.get(element[i])+1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue()<2){
                System.out.println("Element = " + entry.getKey() );
            }
        }

    }
}
