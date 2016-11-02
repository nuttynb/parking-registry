package hu.nutty.interview.ulyssys.parkingregistry.web.managedbeans.view;

import hu.nutty.interview.ulyssys.parkingregistry.vo.CarVo;
import hu.nutty.interview.ulyssys.parkingregistry.vo.ParkingVo;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;

@ManagedBean(name = "parkingBean")
@ViewScoped
public class MBParking implements Serializable {

    private static final long serialVersionUID = -2709877690191381830L;
    private CarVo parkingCar;
    private ParkingVo parking = new ParkingVo();

    private String carId;

    public CarVo getParkingCar() {
        return parkingCar;
    }

    public void setParkingCar(CarVo parkingCar) {
        this.parkingCar = parkingCar;
    }

    public ParkingVo getParking() {
        return parking;
    }

    public void setParking(ParkingVo parking) {
        this.parking = parking;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }
}
