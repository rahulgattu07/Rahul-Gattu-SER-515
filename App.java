public class App {
    public static void main(String[] args) throws Exception {
        Facade f = new Facade();
        Person p = new Person();
        ProduceProductMenu p1 = new ProduceProductMenu();
        MeatProductMenu m1=new MeatProductMenu();
        if(f.login()){
        p.showMenu();
        System.out.println("\n");
        p1.showMenu();
        m1.showMenu();
        }
    }
}
