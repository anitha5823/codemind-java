import java.util.*;
class Sam
{
    public static void main(String args[])
    {
        float a,b;
        float avg;
        Scanner sc=new Scanner(System.in);
        a=sc.nextFloat();
        b=sc.nextFloat();
        avg=(a+b)/2;
        System.out.printf("%.4f",avg);
    }
}