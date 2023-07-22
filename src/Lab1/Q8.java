package Lab1;

public class Q8 {

    public static void main(String[] args){
        NewPerson2 person = new NewPerson2("Deven","Banoth", Gender.M, "7893643630");
        person.printDetails();
    }

}

// Define enum gender to accept F or M only
enum Gender {
    M,F
}

class NewPerson2 {
    private String firstName;
    private String lastName;
    private Gender gender;
    private String Phone;

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
    public String getPhone() {
        return Phone;
    }
    public void setPhone(String phone) {
        Phone = phone;
    }

    public NewPerson2(String firstName, String lastName, Gender gender, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        Phone = phone;
    }

    public void printDetails() {
        System.out.println("\nPerson Details");
        System.out.println("_________________");
        System.out.println("First Name: " + this.firstName);
        System.out.println("Last Name: " + this.lastName);
        System.out.println("Gender: " + this.gender);
        System.out.println("Phone: " + this.Phone);
    }
}