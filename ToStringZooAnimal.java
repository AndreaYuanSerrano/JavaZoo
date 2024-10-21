class ToStringZooAnimal{
    private String firstname;
    private String lastname;

    // Constructor
    public ToStringZooAnimal(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    // Overriding 
    @Override
    public String toString() {
        return "Cage [Method: " + firstname + "\n" + " Properties: " + "\n" + lastname + "]";
    }
}
//toString
public class Main {
    public static void main(String[] args) {
        ToStringZooAnimal tostringzooanimal = new ToStringZooAnimal("The animal named zee is hungry", "name, type, age, ishungry");
        System.out.print(tostringzooanimal); 
    }
}