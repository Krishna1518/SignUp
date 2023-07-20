import java.util.Scanner;
class App1
{
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) throws Exception
	{
		System.out.println("\t\t\tWelcome To My Application");
		System.out.println("1.Student ID's\n2.Laptop Details\n3.Exit");
		int input_01=sc.nextInt();
		switch (input_01)
		{
		case 1 :{
			Thread.sleep(1000);
			System.out.println("Select The ID's");
			System.out.println("1.ID-36\n2.ID-268\n3.ID-456");
			int input_02=sc.nextInt();
			Thread.sleep(1000);
			switch (input_02)
			{
			case 1 :{
				System.out.println("Student name: Dinga\nStudent ID  : ID-36\nYOP         : 2001");
				break;}
			case 2 :{
				System.out.println("Student name: Manga\nStudent ID  : ID-268\nYOP         : 2002");
				break;}
			case 3 :{
				System.out.println("Student name: Dinga\nStudent ID  : ID-456\nYOP         : 2004");
				break;}
		    default:System.out.println("\t\t\tInput Mis-Match");
			
			}
			break;}
		case 2 :{
			Thread.sleep(1000);
			System.out.println("Select Your Fav Lap"); //start with this
            System.out.println("1.Dell\n2.Acer\n3.Hp");
			int input_03=sc.nextInt();
			switch (input_03)
			{
			case 1 :{
				System.out.println("Laptop name : Dell\nRam         : 8GB\nStorage     : 512GB SSD");
				break;}
			case 2 :{
				System.out.println("Laptop name : Acer\nRam         : 16GB\nStorage     : 256GB SSD");
				break;}
			case 3 :{
				System.out.println("Laptop name : Hp\nRam         : 4GB\nStorage     : 1024GB HDD");
				break;}
			default : System.out.println("\t\t\tInput Mis-Match");
			
			}
			break;}
		case 3 :{
			Thread.sleep(2000);
			System.out.println("\t\t\t Thank You For Your Visit");
			break;}
		default : 
		Thread.sleep(1000);	
		System.out.println("\t\t\tInput Mis-match");
		
		}
	}
}
