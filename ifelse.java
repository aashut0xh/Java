import java.util.Scanner;
public class ifelse {
    public static void main(String[] args) {
        System.out.print("Enter your Password: ");
        Scanner sc=new Scanner(System.in);
        int password=sc.nextInt();
        if (password==123) {
            System.out.println("YOU CAN GO FURTHER");
        }
        else{
            System.out.println("Try again");
        }
    }
}
