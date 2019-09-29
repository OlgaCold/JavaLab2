//import javax.swing.*;
//import java.awt.event.ActionListener;

import java.util.Scanner;

public class JournalView{

    /*private String EnteredSurname;
    private String EnteredName;
    private String EnteredBirthDate;
    private String EnteredPhoneNumber;
    private String EnteredAddress;*/

    public boolean Start(){
        Scanner in = new Scanner(System.in);
        System.out.println("Choose please option: 0 - input data, 1 - see data");
        boolean input = in.hasNext();
        return input;
    }

    public String getEnteredSurname() {
        System.out.println("Enter Surname: ");
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    public String getEnteredName() {
        System.out.println("Enter Name: ");
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    public String getEnteredBirthDate() {
        System.out.println("Enter BirthDate: ");
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    public String getEnteredPhoneNumber() {
        System.out.println("Enter Phone Number: ");
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    public String getEnteredAddress() {
        System.out.println("Enter Address: ");
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

}



/*public class JournalView extends JFrame {

    private JTextField firstNumber  = new JTextField(10);
    private JLabel additionLabel = new JLabel("+");
    private JTextField secondNumber = new JTextField(10);
    private JButton calculateButton = new JButton("Calculate");
    private JTextField calcSolution = new JTextField(10);

    JournalView(){

        // Sets up the view and adds the components

        JPanel calcPanel = new JPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 200);

        calcPanel.add(firstNumber);
        calcPanel.add(additionLabel);
        calcPanel.add(secondNumber);
        calcPanel.add(calculateButton);
        calcPanel.add(calcSolution);

        this.add(calcPanel);

        // End of setting up the components --------

    }

    public int getFirstNumber(){

        return Integer.parseInt(firstNumber.getText());

    }

    public int getSecondNumber(){

        return Integer.parseInt(secondNumber.getText());

    }

    public int getCalcSolution(){

        return Integer.parseInt(calcSolution.getText());

    }

    public void setCalcSolution(int solution){

        calcSolution.setText(Integer.toString(solution));

    }

    // If the calculateButton is clicked execute a method
    // in the Controller named actionPerformed

    void addCalculateListener(ActionListener listenForCalcButton){

        calculateButton.addActionListener(listenForCalcButton);

    }

    // Open a popup that contains the error message passed

    void displayErrorMessage(String errorMessage){

        JOptionPane.showMessageDialog(this, errorMessage);

    }

}
*/