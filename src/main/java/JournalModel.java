public class JournalModel {

    private String Surname;
    private String Name;
    private String BirthDate;
    private String PhoneNumber;
    private String Address;

    public String getBirthDate() { return BirthDate; }
    public void setBirthDate(String birthDate) { BirthDate = birthDate; }

    public String getPhoneNumber() { return PhoneNumber; }
    public void setPhoneNumber(String phoneNumber) { PhoneNumber = phoneNumber; }

    public String getAddress() { return Address; }
    public void setAddress(String address) { Address = address; }

    public String getSurname() { return Surname; }
    public void setSurname(String surname) { this.Surname = surname; }

    public String getName() { return Name; }
    public void setName(String name) { this.Name = name; }

}
