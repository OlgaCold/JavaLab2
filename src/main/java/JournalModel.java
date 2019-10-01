import java.util.ArrayList;
import java.util.regex.Pattern;

public class JournalModel {

    ArrayList<Student> Students = new ArrayList();

    public static class Student{
        private String Surname;
        private String Name;
        private String BirthDate;
        private String PhoneNumber;
        private String Address;

        public Student (String surname, String name, String birthDate, String phoneNumber, String address) {
        Surname = surname;
        Name = name;
        BirthDate = birthDate;
        PhoneNumber = phoneNumber;
        Address = address; }

        public String getBirthDate() { return BirthDate; }
        //public void setBirthDate(String birthDate) { BirthDate = birthDate; }

        public String getPhoneNumber() { return PhoneNumber; }
        //public void setPhoneNumber(String phoneNumber) { PhoneNumber = phoneNumber; }

        public String getAddress() { return Address; }
        //public void setAddress(String address) { Address = address; }

        public String getSurname() { return Surname; }
        //public void setSurname(String surname) { this.Surname = surname; }

        public String getName() { return Name; }
        //public void setName(String name) { this.Name = name; }

        public void ShowStudent(){

            System.out.println("There is your student(s): \n");
            System.out.println("Surname: " + this.getSurname());
            System.out.println("Name: " + this.getName());
            System.out.println("Birth Date: " + this.getBirthDate());
            System.out.println("Phone number: " + this.getPhoneNumber());
            System.out.println("Address: " + this.getAddress());
        }

    }

    public void ShowStudents(){

        for(Student student : Students){
            student.ShowStudent();
        }
    }

}
