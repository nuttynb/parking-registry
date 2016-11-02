package hu.nutty.interview.ulyssys.parkingregistry.web.managedbeans.request;

import hu.nutty.interview.ulyssys.parkingregistry.service.CarService;
import hu.nutty.interview.ulyssys.parkingregistry.web.managedbeans.application.MBParkingCars;
import hu.nutty.interview.ulyssys.parkingregistry.web.managedbeans.view.MBParking;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "manageParkingBean")
@RequestScoped
public class MBManageParking {

    @ManagedProperty("#{parkingBean}")
    MBParking parking;
    @ManagedProperty("#{parkingCarsBean}")
    MBParkingCars parkingCars;

    @EJB
    CarService carService;

    public void onLoad() {
        parking.setParkingCar(carService.findCarByLicensePlateNumber(parking.getCarId()));
    }

    public void onPark() {
        parkingCars.addNewParking(parking.getParkingCar(), parking.getParking());
        parking.getParkingCar().setParking(Boolean.TRUE);
    }

    public MBParking getParking() {
        return parking;
    }

    public void setParking(MBParking parking) {
        this.parking = parking;
    }

    public MBParkingCars getParkingCars() {
        return parkingCars;
    }

    public void setParkingCars(MBParkingCars parkingCars) {
        this.parkingCars = parkingCars;
    }
}
