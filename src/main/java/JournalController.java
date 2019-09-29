public class JournalController {

    private JournalView theView;
    private JournalModel theModel;

    public JournalController(JournalView theView, JournalModel theModel) {
        this.theView = theView;
        this.theModel = theModel;

        this.Entering();

    }

    public void Show(JournalModel model){
        System.out.println("There is your student: \n");
        System.out.println("Surname: \n" + model.getSurname());
        System.out.println("Name: \n" + model.getName());
        System.out.println("Birth Date: \n" + model.getBirthDate());
        System.out.println("Phone number: \n" + model.getPhoneNumber());
        System.out.println("Address: \n" + model.getAddress());

    }

    public void Entering() {

        JournalModel first = new JournalModel();
        first.setSurname("");
        first.setName("");
        first.setBirthDate("");
        first.setPhoneNumber("");
        first.setAddress("");

        if(theView.Start() == false){ Show(first); }
        else {
            first.setSurname(theView.getEnteredSurname());
            first.setName(theView.getEnteredName());
            first.setBirthDate(theView.getEnteredBirthDate());
            first.setPhoneNumber(theView.getEnteredPhoneNumber());
            first.setAddress(theView.getEnteredAddress());
        }

        Show(first);
    }
}
