import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Buyer extends Person {

	public void showMenu() {
		try {
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Rahul Gattu\\Desktop\\DP-zip\\UserProduct.txt"));
			String str = br.readLine();
			int i=0;
			while (str!=null){
				StringTokenizer s = new StringTokenizer(str,":");
				while(s.hasMoreTokens()){
					String item = s.nextToken();
					String value = s.nextToken();
					if(item.equals("nana"))
					{
						i=i+1;

						System.out.println(i+" "+item +":"+value);
					}
					
				}
				
				str=br.readLine();
			}			
		}			
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public ProductMenu CreateProductMenu() {
		return null;
	}

}
