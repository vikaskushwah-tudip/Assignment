public class Table {
    private int ID;
    private String NumberOfSeat;
    private String Status;


    public Table()
    {
        ID = 0;
        NumberOfSeat="";
        Status="";
    }

    public Table(int ID, String numberOfSeat, String status) {
        this.ID = ID;
        NumberOfSeat = numberOfSeat;
        Status = status;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNumberOfSeat() {
        return NumberOfSeat;
    }

    public void setNumberOfSeat(String numberOfSeat) {
        NumberOfSeat = numberOfSeat;
    }
    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }


}
