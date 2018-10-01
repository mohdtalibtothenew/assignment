//Question 2

public class StringSorting {
    public void sort(char[] charArray){
        int j;
        char temp=0;

        int arrayLength =charArray.length;

        for (int i = 0; i <arrayLength; i++) {

            for ( j = 0; j < arrayLength-1; j++) {

                if(charArray[j]>charArray[j+1]){
                    temp=charArray[j];
                    charArray[j]=charArray[j+1];
                    charArray[j+1]=temp;
                }

            }

        }

        for(int k=0;k<charArray.length;k++){
            System.out.println(charArray[k]);
        }

    }
    public static void main(String[] args) {

        String inputString = "hjsgftrf";
        char[] stringChars = inputString.toCharArray();
        StringSorting so = new StringSorting();
        so.sort(stringChars);


    }

}

