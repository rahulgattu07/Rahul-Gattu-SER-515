import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ProduceProductMenu implements ProductMenu {

	public void showMenu() {
		try {
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Rahul Gattu\\Desktop\\DP-zip\\ProductInfo.txt"));
			String str = br.readLine();
			int i=0;
			while (str!=null){
				StringTokenizer s = new StringTokenizer(str,":");
				while(s.hasMoreTokens()){
					String item = s.nextToken();
					String value = s.nextToken();
					if(item.equals("Produce"))
					{
						i=i+1;

						System.out.println(item +":"+value);
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

	public void showAddButton() {

	}

	public void showRadioButton() {

	}

	public void showLabels() {

	}

	public void showViewButton() {

	}

	public void showComboxes() {

	}

}
