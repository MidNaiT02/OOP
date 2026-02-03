import java.util.Scanner;
public class StarTriangle
{
    private int width;
    public StarTriangle(int width)
    {
        this.width=width;
    }

    public String toString()
    {
        StringBuilder triangle= new StringBuilder();
        for(int i=1;i<=width;i++)
        {    for(int j=0;j<i;j++)
                {triangle.append("[*]");}
        triangle.append('\n');}
            return triangle.toString();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter max width");
        int count=sc.nextInt();
        StarTriangle small=new StarTriangle(count);
        System.out.println(small.toString());
    }
}