import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Person {

	private ProductMenu productMenu;

	public void showMenu() {
		try {		
		    FileReader fr = new FileReader(
            "C:\\Users\\Rahul Gattu\\Desktop\\DP-zip\\UserProduct.txt");
            int i;
        
            while ((i = fr.read()) != -1){
		
             System.out.print((char)i);
			}
		}

			catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

	public void showAddButton() {

	}

	public void showViewButton() {

	}

	public void showRadioButton() {

	}

	public void showLabels() {

	}

	public ProductMenu CreateProductMenu() {
		return null;
	}

}
