package hu.nutty.interview.ulyssys.parkingregistry.web.managedbeans.application;

import hu.nutty.interview.ulyssys.parkingregistry.vo.CarVo;
import hu.nutty.interview.ulyssys.parkingregistry.vo.ParkingVo;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import java.util.HashMap;
import java.util.Map;

@ManagedBean(name = "parkingCarsBean")
@ApplicationScoped
public class MBParkingCars {
    private Map<CarVo, ParkingVo> parkingCars;

    @PostConstruct
    public void init() {
        parkingCars = new HashMap<>();
    }

    public void addNewParking(CarVo car, ParkingVo parking) {
        parkingCars.put(car, parking);
        System.out.println(parkingCars);
    }

    public Map<CarVo, ParkingVo> getParkingCars() {
        return parkingCars;
    }

    public void setParkingCars(Map<CarVo, ParkingVo> parkingCars) {
        this.parkingCars = parkingCars;
    }
}
