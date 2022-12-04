import java.util.Scanner;
public class Employee {
    int pan;
    String name;
    double taxincome;
    double tax;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the pan , name and taxincome");
        pan = sc.nextInt();
        name = sc.nextLine();
        taxincome = sc.nextDouble();
    }
    void cal(){

    }
    void display(){

    }
}
