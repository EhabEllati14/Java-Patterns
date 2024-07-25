//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    System.out.println("Hello");
    Singleton s1 = Singleton.getInstance();
    Singleton s2 =  Singleton.getInstance();
        System.out.println(s1.hashCode());
        s1.printstr();
        System.out.println(s2.hashCode());
        s2.printstr();


    }

}