public class Table {
    private int ID;
    private String NumberOfSeat;

    public Table()
    {
        ID = 0;
        NumberOfSeat="";
    }
    public Table(int ID, String numberOfSeat) {
        this.ID = ID;
        NumberOfSeat = numberOfSeat;
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


}
