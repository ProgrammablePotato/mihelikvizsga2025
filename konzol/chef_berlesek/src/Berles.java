import java.sql.Date;
import java.time.Period;

public class Berles {
    private int uid;
    private int chefid;
    private Date startdate;
    private Date enddate;
    private int daily_rate;
    private String name;
    private String cuisine;
    private int total_time;
    private int TotalPrice;
    
    public Berles(String line) {
        String[] line_split = line.split(",");
        this.uid = Integer.parseInt(line_split[0]);
        this.chefid = Integer.parseInt(line_split[1]);
        this.startdate = Date.valueOf(line_split[2]);
        this.enddate = Date.valueOf(line_split[3]);
        this.daily_rate = Integer.parseInt(line_split[4]);
        this.name = line_split[5];
        this.cuisine = line_split[6];
        this.total_time = Period.between(this.startdate.toLocalDate(), this.enddate.toLocalDate()).getDays(); 
        this.TotalPrice = daily_rate*total_time;
    }
    public Berles(int uid, int chefid, Date startdate, Date enddate, int daily_rate, String name, String cuisine) {
        this.uid = uid;
        this.chefid = chefid;
        this.startdate = startdate;
        this.enddate = enddate;
        this.daily_rate = daily_rate;
        this.name = name;
        this.cuisine = cuisine;
    }
    public Berles() {
    }
    public boolean isInMonth(int month) {
        int startmonth = this.startdate.toLocalDate().getMonth().getValue();
        int endmonth = this.enddate.toLocalDate().getMonth().getValue();
        if (startmonth == month || endmonth == month) {
            return true;
        }
        return false;
    }
    public int getUid() {
        return uid;
    }
    public void setUid(int uid) {
        this.uid = uid;
    }
    public int getChefid() {
        return chefid;
    }
    public void setChefid(int chefid) {
        this.chefid = chefid;
    }
    public Date getStartdate() {
        return startdate;
    }
    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }
    public Date getEnddate() {
        return enddate;
    }
    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }
    public int getDaily_rate() {
        return daily_rate;
    }
    public void setDaily_rate(int daily_rate) {
        this.daily_rate = daily_rate;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCuisine() {
        return cuisine;
    }
    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }
    public int getTotalPrice() {
        return TotalPrice;
    }
    public void setTotalPrice(int totalPrice) {
        TotalPrice = totalPrice;
    }
    public int getTotal_time() {
        return total_time;
    }
    public void setTotal_time(int total_time) {
        this.total_time = total_time;
    }
    
}
