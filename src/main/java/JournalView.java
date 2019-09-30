import java.util.Scanner;

public class JournalView{

    public void Start(){
        System.out.println("Hi, enter first student: ");
    }

    public void EnterNextStudent(){
        System.out.println("Enter next student: ");
    }

    public int ChooseOption(){
        int input;
        Scanner in = new Scanner(System.in);
        System.out.println("Choose please option: 0 - input data, 1 - see data");
        try{
            input = in.nextInt();
        }
        catch(Exception e){
            System.out.println("You entered wrong command! So you can just look at list of students.");
            input = 1;
        }
        return input;
    }


    public String getEnteredSurname() {
        System.out.print("Enter Surname: ");
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    public String getEnteredName() {
        System.out.print("Enter Name: ");
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    public String getEnteredBirthDate() {
        System.out.print("Enter BirthDate: ");
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    public String getEnteredPhoneNumber() {
        System.out.print("Enter Phone Number: ");
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    public String getEnteredAddress() {
        System.out.print("Enter Address: ");
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

}
