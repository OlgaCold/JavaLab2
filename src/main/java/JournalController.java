import java.util.regex.Matcher;

public class JournalController {

    private JournalView theView;
    private JournalModel theModel;
    private boolean flag = false;
    private String EnteredSurname;
    private String EnteredName;
    private String EnteredBirthDate;
    private String EnteredPhoneNumber;
    private String EnteredAddress;
    String temp;

    public JournalController(JournalView theView, JournalModel theModel) {
        this.theView = theView;
        this.theModel = theModel;

        this.Entering();
    }

    public void Entering() {

        theView.StartMes();

        while(flag == false){

            EnteredSurname = theView.getEnteredSurname();
            EnteredName = theView.getEnteredName();


            temp = theView.getEnteredBirthDate();
            Matcher matcher = theView.BirthDatePattern.matcher(temp);
            if (matcher.matches()) {
                EnteredBirthDate = temp;
            } else {
                theView.WrongInputMes();
                theView.getEnteredBirthDate();
            }

            temp = theView.getEnteredPhoneNumber();
            Matcher matcher1 = theView.NumberPattern.matcher(temp);
            if (matcher1.matches()) {
                EnteredPhoneNumber = temp;
            } else {
                theView.WrongInputMes();
                theView.getEnteredPhoneNumber();
            }


            EnteredAddress = theView.getEnteredAddress();

            theModel.Students.add(new JournalModel.Student(EnteredSurname, EnteredName, EnteredBirthDate, EnteredPhoneNumber, EnteredAddress));
            if(theView.ChooseOptionMes() == 0){
                theView.EnterNextStudentMes();
            }
            else{
                flag = true;
                theModel.ShowStudents();
            }
        }
    }
}
