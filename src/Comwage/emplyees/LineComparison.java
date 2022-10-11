package Comwage.emplyees;

public class LineComparison {
    public void L1 (int x1,int x2,int y1,int y2)
    {
        double length1 = Math.sqrt((x2-x1)^2 + (y2-y1)^2);
        System.out.println("The length of the 1st coordinate is:" + length1);
    }
public void L2 (int a1,int a2,int b1,int b2)
{
     double length2 = Math.sqrt((a2-a1)^2 + (b2-b1)^2);
     System.out.println("The length of the 2nd coordinate is:" + length2 );
}
    public static void main(String args[])
    {
        System.out.println("Welcome to Line comparison computation");
    }
    LineComparison obj1=new LineComparison();
    obj1.Length1(2,4,3,4.5);
}
