import java.util.*;
class Sam
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x,y;
        x=sc.nextInt();
        y=sc.nextInt();
        if(x==0 && y%2==0)
        {
            System.out.print("YES");
        }
        else if(x==0 && y%2!=0)
        {
            System.out.print("NO");
        }
        else if((x+(y*2))%2==0)
        {
            System.out.print("YES");
        }
        else
        {
            System.out.print("NO");
        }
    }
}