// Question 9
//Design classes having attributes for furniture where there are wooden chairs and tables, metal chairs and tables.
// There are stress and fire tests for each products

interface Wooden
{
    void fireWood();
    void stressWood();
}
interface Metal
{
    void fireMetal();
    void stressMetal();
}
class Chair extends Furniture implements Wooden,Metal
{
    @Override
    public void fireWood() {
        System.out.println("WARNING! WODDEN chair catches fire ");
    }
    @Override
    public void stressWood() {
        System.out.println("WARNING! WODDEN chair cannot handle stress ");
    }
    @Override
    public void fireMetal() {
        System.out.println("Metal chair does not catch fire easily");
    }
    @Override
    public void stressMetal() {
        System.out.println("Metal chair handle pressure");
    }
}
class Table extends Furniture implements Wooden,Metal
{
    @Override
    public void fireWood() {
        System.out.println("WARNING! WODDEN table catches fire ");
    }
    @Override
    public void stressWood() {
        System.out.println("WARNING! WODDEN table can handle stress upto certain limit. ");
    }
    @Override
    public void fireMetal() {
        System.out.println("Metal table does not catch fire easily");
    }
    @Override
    public void stressMetal() {
        System.out.println("Metal table can handle pressure");
    }
}
public class Furniture
{
    public static void main(String[] args)
    {
        Furniture C=new Chair();
        ((Chair) C).fireMetal();
        ((Chair) C).fireWood();
        ((Chair) C).stressMetal();
        ((Chair) C).stressWood();
        Furniture T=new Table();
        ((Table) T).fireMetal();
        ((Table) T).fireWood();
        ((Table) T).stressMetal();
        ((Table) T).stressWood();
    }
}