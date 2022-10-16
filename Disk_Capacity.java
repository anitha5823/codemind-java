import java.util.*;
class Sam
{
    public static void main(String args[])
    {
        int t,s,b,cap;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        s=sc.nextInt();
        b=sc.nextInt();
        cap=(2*512)*t*s*b;
        System.out.print(cap);
    }
}