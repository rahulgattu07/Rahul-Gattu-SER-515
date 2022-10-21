import java.io.*;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Facade {

	private int userType;

	private Product theSelectedProduct;

	private int nProductCategory;

	private ClassProductList theProductList;

	private Person thePerson;

	public boolean login() throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Facade Pattern implemented");
		System.out.println("1. Buyer login 2. seller login");
		System.out.println("select option to login");
		int n = sc.nextInt();
		boolean b1= false;
		//System.out.println("1. Buyer login 2. seller login");
		boolean b = false;
		if(n==1){

			BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Rahul Gattu\\Desktop\\DP-zip\\BuyerInfo.txt"));
			String str = reader.readLine();
			System.out.println("Enter Username");
			String Uname=sc.next();
			System.out.println(Uname);
			HashMap<String, String> map = new HashMap<>();
			while(str!=null){
				StringTokenizer st = new StringTokenizer(str,":");
				while(st.hasMoreTokens())
				{
                    map.put(st.nextToken(),st.nextToken()); 
				}
				str=reader.readLine();
			}
			//System.out.println(map);
			if(map.containsKey(Uname))
				{
					System.out.println("Enter Password");
					String Password=sc.next();
					if(map.get(Uname).equals(Password))
					{
						b=true;
						System.out.println("Login Success");
					}
					else{
						System.out.println("Login Failed");

					}
				}
				else 
				{

					System.out.println("Username Invalid");
				}

	
		

		return b;
			}
			else if (n==2){

				BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Rahul Gattu\\Desktop\\DP-zip\\SellerInfo.txt"));
			String str = reader.readLine();
			System.out.println("Enter Username");
			String Uname=sc.next();
			System.out.println(Uname);
			HashMap<String, String> map = new HashMap<>();
			while(str!=null){
				StringTokenizer st = new StringTokenizer(str,":");
				while(st.hasMoreTokens())
				{
                    map.put(st.nextToken(),st.nextToken()); 
				}
				str=reader.readLine();
			}
			//System.out.println(map);
			if(map.containsKey(Uname))
				{
					System.out.println("Enter Password");
					String Password=sc.next();
					if(map.get(Uname).equals(Password))
					{
						b=true;
						System.out.println("Login Success");
					}
					else{
						System.out.println("Login Failed");

					}
				}
				else 
				{

					System.out.println("Username Invalid");
				}

	
		

		return b;
			}
			else{
				System.out.println("Invalid option");

			}
			return b1;

	}

	public void addTrading() {

	}

	public void viewTrading() {

	}

	public void decideBidding() {

	}

	public void discussBidding() {

	}

	public void submitBidding() {

	}

	public void remind() {

	}

	public void createUser(UserInfoItem userinfoitem) {

	}

	public void createProductList() {

	}

	public void AttachProductToUser() {

	}

	public void SelectProduct() {

	}

	public void productOperation() {

	}

}
