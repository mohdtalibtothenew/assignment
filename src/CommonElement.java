public class CommonElement {
    public static void main(String[] args) {
        int[] array1 = {1,2,6,2,3};
        int[] array2 ={0,9,8,7,3,4};
        for(int i =0;i<array1.length;i++){
            for(int j=0;j<array2.length;j++){
                if(array1[i]==array2[j]){
                    System.out.println(array1[i]);
                }
            }
        }
    }
}
