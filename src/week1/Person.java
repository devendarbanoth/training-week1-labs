package week1;

public class Person {
    private String firstName;
    private String lastName;
    private Character gender;

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


    public static void main(String[] args){

        Person person1 = new Person();
        person1.setFirstName("Devendar");
        person1.setLastName("Banoth");
        person1.setGender('M');

        System.out.println("Person Details");
        System.out.println("_________________");
        System.out.println("First Name: " + person1.getFirstName());
        System.out.println("Last Name: " + person1.getLastName());
        System.out.println("Gender: " + person1.getGender());

    }
}
