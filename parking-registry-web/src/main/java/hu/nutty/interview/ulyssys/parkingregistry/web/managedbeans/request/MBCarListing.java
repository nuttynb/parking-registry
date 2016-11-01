package hu.nutty.interview.ulyssys.parkingregistry.web.managedbeans.request;

import hu.nutty.interview.ulyssys.parkingregistry.service.CarService;
import hu.nutty.interview.ulyssys.parkingregistry.web.managedbeans.view.MBCar;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "carListingBean")
@RequestScoped
public class MBCarListing {
    @ManagedProperty("#{carBean}")
    MBCar car;
    @EJB
    CarService carService;

    public void onDeleteCar() {
        carService.deleteCar(car.getSelectedCar());
        car.getCars().remove(car.getSelectedCar());
        car.setSelectedCar(null);
    }

    public MBCar getCar() {
        return car;
    }

    public void setCar(MBCar car) {
        this.car = car;
    }
}
