import java.util.Scanner;
public class switchcase {
    public static void main(String[] args) {
        System.out.println("Enter your Marks :");
        Scanner sc= new Scanner(System.in);
        int Marks=sc.nextInt();
        switch (Marks) {
            case 90:
                System.out.println("Excellent");
                break;
        
            default:
            System.out.println("Fail");
                break;
        }
    } 
}
