import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Facade f = new Facade();
        Person p = new Person();
        ProduceProductMenu p1 = new ProduceProductMenu();
        MeatProductMenu m1=new MeatProductMenu();
        if(f.login()){
            System.out.println("Bridge pattern implemented");
            System.out.println("1. meat menu  2. produce menu");
            System.out.println("enter the menu option");
            int opt = sc.nextInt();
            if(opt==1){
                m1.showMenu();

            }
            else if (opt==2){
                p1.showMenu();
            }
            else{
                System.out.println("invalid option");
            }




        }
    }
}
