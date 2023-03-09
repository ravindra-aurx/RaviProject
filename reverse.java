import java.util.Scanner;
class ReverseDemo{
public static void main(String []args){

	Scanner s=new Scanner (System.in);
	System.out.println("Enter your name");
	int num,rev=0,rem;
	num=s.nextInt();
	while(num>0){

        rem=num%10;
	rev=rev*10+rem;
	num=num/10;

	}
	System.out.println("reverse number is : "+rev);

}
}
