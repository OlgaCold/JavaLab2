import java.util.Scanner;
import java.util.regex.Pattern;

public class JournalView{


    Pattern NumberPattern = Pattern.compile("(\\+380|380|0)\\d{9}");
    Pattern BirthDatePattern = Pattern.compile("\\d{2}\\.\\d{2}\\.\\d{4}");

    public void StartMes(){
        System.out.println("Hi, enter first student: ");
    }

    public void EnterNextStudentMes(){
        System.out.println("Enter next student: ");
    }

    public int ChooseOptionMes(){
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

    public void WrongInputMes() {
        System.out.println("Input wrong!!!");
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
        System.out.print("Enter BirthDate(in format 01.01.2000): ");
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    public String getEnteredPhoneNumber() {
        System.out.print("Enter Phone Number(in format +380666666666 or 0666666666): ");
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    public String getEnteredAddress() {
        System.out.print("Enter Address: ");
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

}
