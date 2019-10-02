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
            switch (theView.ChooseOptionMes()){
                case 0:
                theView.EnterNextStudentMes();
                EnteredSurname = theView.getEnteredSurname();
                EnteredName = theView.getEnteredName();


                temp = theView.getEnteredBirthDate();
                Matcher matcher = theView.BirthDatePattern.matcher(temp);
                while(!(matcher.matches())){
                    theView.WrongInputMes();
                    temp = theView.getEnteredBirthDate();
                    matcher = theView.BirthDatePattern.matcher(temp);
                }
                EnteredBirthDate = temp;

                temp = theView.getEnteredPhoneNumber();
                Matcher matcher1 = theView.NumberPattern.matcher(temp);
                while(!(matcher1.matches())){
                    theView.WrongInputMes();
                    temp = theView.getEnteredPhoneNumber();
                    matcher1 = theView.NumberPattern.matcher(temp);
                }
                EnteredPhoneNumber = temp;

                EnteredAddress = theView.getEnteredAddress();

                theModel.Students.add(new JournalModel.Student(EnteredSurname, EnteredName, EnteredBirthDate, EnteredPhoneNumber, EnteredAddress));
                break;

                case 1:
                    theModel.ShowStudents();
                    break;

                case 2:
                    flag = true;
                    break;
                case -1:
                    break;
            }

        }
    }
}
