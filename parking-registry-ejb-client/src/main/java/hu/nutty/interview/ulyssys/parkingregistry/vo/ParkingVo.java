package hu.nutty.interview.ulyssys.parkingregistry.vo;

import java.io.Serializable;
import java.util.Date;

public class ParkingVo implements Serializable {

    private static final long serialVersionUID = -6233625115533433250L;
    private String parkingName;
    private Date start;
    private Date end;

    public ParkingVo() {
        start = new Date();
        end = new Date();
    }

    public ParkingVo(String parkingName, Date start, Date end) {
        this.parkingName = parkingName;
        this.start = start;
        this.end = end;
    }

    public String getParkingName() {
        return parkingName;
    }

    public void setParkingName(String parkingName) {
        this.parkingName = parkingName;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "ParkingVo{" +
                "parkingName='" + parkingName + '\'' +
                ", start=" + start +
                ", end=" + end +
                '}';
    }
}
