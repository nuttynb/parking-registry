package hu.nutty.interview.ulyssys.parkingregistry.vo;

import java.io.Serializable;
import java.time.LocalDateTime;

public class ParkingVo implements Serializable {

    private static final long serialVersionUID = -6233625115533433250L;
    private String parkingName;
    private LocalDateTime start;
    private LocalDateTime end;

    public ParkingVo() {
    }

    public ParkingVo(String parkingName, LocalDateTime start, LocalDateTime end) {
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

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getEnd() {
        return end;
    }

    public void setEnd(LocalDateTime end) {
        this.end = end;
    }
}
