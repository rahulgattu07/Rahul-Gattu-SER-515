public class App {
    public static void main(String[] args) throws Exception {
        Facade f = new Facade();
        Person p = new Person();
        ProduceProductMenu p1 = new ProduceProductMenu();
        p.showMenu();
        System.out.println("\n");
        p1.showMenu();
    }
}
