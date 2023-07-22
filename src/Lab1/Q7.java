package Lab1;

public class Q7 {

    public static void main(String[] args){
        NewPerson person1 = new NewPerson("Devendar","Banoth", 'M',"7893643630");

        person1.printDetails();
    }
}


class NewPerson {
    private String firstName;
    private String lastName;
    private Character gender;
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
    public Character getGender() {
        return gender;
    }
    public void setGender(Character gender) {
        this.gender = gender;
    }
    public String getPhone() {
        return Phone;
    }
    public void setPhone(String phone) {
        Phone = phone;
    }

    public NewPerson(String firstName, String lastName, Character gender, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        Phone = phone;
    }

    public void printDetails() {
        System.out.println("Person Details");
        System.out.println("_________________");
        System.out.println("First Name: " + this.firstName);
        System.out.println("Last Name: " + this.lastName);
        System.out.println("Gender: " + this.gender);
        System.out.println("Phone: " + this.Phone);
    }
}

