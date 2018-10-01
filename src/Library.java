//Question 1
import java.util.ArrayList;
import java.util.List;
interface Issue
{
    void issueBooks();
    void issuedBooks();
}
interface Return
{
    void returnBooks();
    void returnedBooks();
    void fineOnReturn();
}
class Login
{
    private int id;
    private String password;
    public Login(int id, String password) {
        this.id = id;
        this.password = password;
    }
    public int getId() {
        return id;
    }
    public String getPassword() {
        return password;
    }
}
class LibraryDept implements Issue,Return
{
    @Override
    public void issueBooks() {
    }
    @Override
    public void issuedBooks() {
    }
    @Override
    public void returnBooks() {
    }
    @Override
    public void returnedBooks() {
    }
    @Override
    public void fineOnReturn() {
    }
    void displayAllbooks()
    {
        List<String> Books=new ArrayList<String>();
        for(String b:Books)
        {
            System.out.println(b);
        }
    }
}

public class Library extends LibraryDept
{
    public static void main(String[] args)
    {
        Login L=new Login(111,"****"){
        };
        LibraryDept l=new LibraryDept();
        l.issueBooks();
        l.displayAllbooks();
    }
}