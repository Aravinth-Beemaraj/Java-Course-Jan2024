import java.util.Scanner;

public class port_pattern_13 {
    public static void main(String args[])
{

    int num;
    Scanner s = new Scanner(System.in);
    num = s.nextInt();
    for(int i=num; i>=1;i--)
    {
        for(int k=1;k<i;k++)
        {System.out.print(" ");}
        
        for(int j=num; j>=i;j--)
        {System.out.print(j);}
        
        System.out.println();
    }
}
}
