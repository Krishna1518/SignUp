import java.util.Scanner;
class SignUp
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) throws Exception
    {
		System.out.println("Enter Your First Name");
		String user_first_name=sc.nextLine();
		System.out.println("Enter Your Last Name");
		String user_last_name=sc.nextLine();
		System.out.println("Enter Your Gender");
		String user_gender=sc.nextLine();
		System.out.println("Enter your Mobile Number");
		long user_mobile_number=sc.nextLong();
		System.out.println("Enter your Email ID");
		sc.nextLine();
		String user_email=sc.nextLine();
		System.out.println("Enter Password");
		String user_password=sc.nextLine();
        System.out.println("Enter OTP Sent To Register Mobile Number");
		double otp=Math.random()*9999+9999;
		int system_otp=(int)otp;
		System.out.println(system_otp);
		int user_otp=sc.nextInt();
		System.out.print("Validating");
		Thread.sleep(1000);
		System.out.print(".");
		Thread.sleep(1000);
		System.out.print(".");
		Thread.sleep(1000);
		System.out.println(".");
		Thread.sleep(1000);
		if (user_otp == system_otp)
		{
			System.out.println("Login Successfull");
		}
        else
        {
			System.out.println("Login Unsuccessfull"); 
        }


    }
}
