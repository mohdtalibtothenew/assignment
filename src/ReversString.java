public class ReversString {

    public String reversString(String s){
        StringBuffer sb = new StringBuffer(s);
        String str2 = sb.reverse().toString();
        return str2;
    }
    public String removeChar(String s){
        StringBuffer sb = new StringBuffer(s);

        String removedString = sb.delete(4,9).toString();

        return  removedString;
    }

    public static void main(String[] args) {
        String string = "Hello World yes";
        ReversString rs = new ReversString();
        String result = rs.reversString(string);
        System.out.println("Reversed string :"+result);
        System.out.println("String after character removed :"+rs.removeChar(result));
    }


}
