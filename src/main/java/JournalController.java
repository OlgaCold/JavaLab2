public class JournalController {

    private JournalView theView;
    private JournalModel theModel;
    private boolean flag = false;
    private String EnteredSurname;
    private String EnteredName;
    private String EnteredBirthDate;
    private String EnteredPhoneNumber;
    private String EnteredAddress;

    public JournalController(JournalView theView, JournalModel theModel) {
        this.theView = theView;
        this.theModel = theModel;

        this.Entering();
    }

    public void Entering() {

        theView.Start();

        while(flag == false){

            EnteredSurname = theView.getEnteredSurname();
            EnteredName = theView.getEnteredName();
            EnteredBirthDate = theView.getEnteredBirthDate();
            EnteredPhoneNumber = theView.getEnteredPhoneNumber();
            EnteredAddress = theView.getEnteredAddress();

            theModel.Students.add(new JournalModel.Student(EnteredSurname, EnteredName, EnteredBirthDate, EnteredPhoneNumber, EnteredAddress));
            if(theView.ChooseOption() == 0){
                theView.EnterNextStudent();
            }
            else{
                flag = true;
                theModel.ShowStudents();
            }
        }
    }


}
