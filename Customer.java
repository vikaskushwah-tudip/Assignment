public class Customer {
    private int ID;
    private String lastName;
    private String firstName;
    private String password;

    public Customer()
    {
        ID = 0;
        lastName="";
        firstName="";
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

  

    public Customer(int ID, String lastName, String firstName, String password) {
        this.ID = ID;
        this.lastName = lastName;
        this.firstName = firstName;
        this.password = password;
    }
}
