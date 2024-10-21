class ToStringZooKeeper{
    private String firstname;
    private String lastname;

    // Constructor
    public ToStringZooKeeper(String firstname, String lastname) {
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
        ToStringZooKeeper tostringZooKeeper = new ToStringZooKeeper("The zookeeper named has no degree", "name, title, pay");
        System.out.print(tostringZooKeeper); 
    }
}