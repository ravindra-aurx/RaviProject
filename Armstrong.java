import java.util.Scanner;
public class Armstrong {
    public static void main(String []args)
    {
        int sum=0,rem,temp;
     Scanner src =new Scanner(System.in);


        System.out.println("Enter Number :");
        int num =src.nextInt();

        temp =num;

        while(num!=0)
        {
            rem =num%10;
            sum =sum+rem*rem*rem;
            num =num/10;
        }
        System.out.println("sum ="+sum);
        if (temp==sum)
        {
            System.out.println("This is a Armstrong Number !!");
        }
        else
        {
            System.out.println("This is not a Armstrong Number !!");
        }


    }
}
