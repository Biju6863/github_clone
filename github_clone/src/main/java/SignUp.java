import java.util.Scanner;

public class SignUp {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter your Name");
        String  userName= scn.nextLine();

        System.out.println("Enter your Email Id");
        String emailId = scn.nextLine();

         System.out.println("Enter your 10 digit phone number");
        String phoneNumber = scn.nextLine();

        //User details storage

        User usrDetails = new User(userName, emailId, phoneNumber);

        usrDetails.displayUserDetails();

    }

}
