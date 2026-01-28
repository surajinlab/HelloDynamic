import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        String  name = sc.nextLine();
        System.out.println("Hello  " + name);

        for (int i=1; i<=10; i++) {
            System.out.println(i);
        }
    }
}
