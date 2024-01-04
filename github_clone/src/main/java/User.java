public class User {

    String name;
    String email;
    String phnNumber;

    public User(String name,String email,String phnNumber){
        this.name = name;
        this.email = email;
        this.phnNumber = phnNumber;
    }

    public void displayUserDetails(){
        System.out.println(name);
        System.out.println(email);
        System.out.println(phnNumber);

    }



}
