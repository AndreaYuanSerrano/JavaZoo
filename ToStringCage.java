class ToStringCage{
    private String firstname;
    private String lastname;

    // Constructor
    public ToStringCage(String firstname, String lastname) {
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
        ToStringCage tostringcage = new ToStringCage("The cage is cleaned, the cage is covered", "lenght, width, height, clean, covered");
        System.out.print(tostringcage); 
    }
}