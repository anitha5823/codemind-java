import java.util.*;
import java.lang.*;
class Temp
{
    public static void main(String args[])
    {
        double a,b,c,s,area;
        double res;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        s=(a+b+c)/2;
        area=(s*(s-a)*(s-b)*(s-c));
        res=Math.pow(area,0.5);
        System.out.printf("%.2f",res);
    }
}