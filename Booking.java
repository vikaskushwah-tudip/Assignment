import java.time.LocalDateTime;
import java.util.Date;


public class Booking {
    private int ID;
    private int TableId;
    private String CustomerName;
    private int Duration;
    protected Date startWorkTime;
    protected Date  finishWorkTime;

    public int getDuration() {
        return Duration;
    }

    public void setDuration(int duration) {
        Duration = duration;
    }

    public Date getStartWorkTime() {
        return startWorkTime;
    }

    public void setStartWorkTime(Date startWorkTime) {
        this.startWorkTime = startWorkTime;
    }

    public Date getFinishWorkTime() {
        return finishWorkTime;
    }

    public void setFinishWorkTime(Date finishWorkTime) {
        this.finishWorkTime = finishWorkTime;
    }

    public Booking()
    {
        ID = 0;
        TableId=0;
        CustomerName="";
        startWorkTime = null;
        finishWorkTime = null;
        Duration=0;
    }
    public Booking(int ID,int TableId, String CustomerName,int duration) {
        this.ID = ID;
        this.TableId = TableId;
        this.CustomerName = CustomerName;
        this.Duration = duration;
        startWorkTime = null;
        finishWorkTime = null;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getTableId() {
        return TableId;
    }

    public void setTableId(int tableId) {
        TableId = tableId;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }
    public String getStartTime()
    {
    String dt = String.valueOf(LocalDateTime.now());

      return dt;
    }
    public String getFinishTime()
    {
       String dt= String.valueOf(LocalDateTime.now().plusHours(getDuration()));
       return dt;
    }

}
