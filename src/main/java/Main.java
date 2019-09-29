public class Main {
    public  static void main(String[] args){
        JournalView theView = new JournalView();
        JournalModel theModel = new JournalModel();
        JournalController theController = new JournalController(theView, theModel);

    }
}
