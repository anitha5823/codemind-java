import java.util.*;
class Sam
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int h,m;
        double a,b,c,s,ar;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        s=(a+b+c)/2;
        ar=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.printf("%.2f",ar);
    }
    
}