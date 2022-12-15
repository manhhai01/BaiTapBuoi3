import java.util.Scanner;

public class BaiTap5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Who is using this computer?");
        String user = scan.nextLine();
        switch (user) {
            case "B":
                System.out.println("Have a great day, dad!");
                break;
            case "H":
                System.out.println("Hope you enjoy your day, mom!");
                break;
            case "A":
                System.out.println("Have a good time, bro!");
                break;
            case "E":
                System.out.println("Hope you're doing well, little baby!");
                break;
            default:
                System.out.println("Please enter your name again");
        }
    }
}
