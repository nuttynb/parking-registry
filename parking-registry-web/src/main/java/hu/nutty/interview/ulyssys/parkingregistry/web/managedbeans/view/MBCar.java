package hu.nutty.interview.ulyssys.parkingregistry.web.managedbeans.view;

import hu.nutty.interview.ulyssys.parkingregistry.service.CarService;
import hu.nutty.interview.ulyssys.parkingregistry.vo.CarVo;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import java.util.List;

@ManagedBean(name = "carBean")
@ViewScoped
public class MBCar implements Serializable {

    private static final long serialVersionUID = 2247835822909442706L;
    private List<CarVo> cars;
    private CarVo selectedCar;
    private CarVo newCar;
    @EJB
    CarService carService;

    @PostConstruct
    public void init() {
        cars = carService.findAllCars();
        newCar = new CarVo();
    }

    public CarVo findCarByLicensePlateNumber(String licenseNumber) {
        return carService.findCarByLicensePlateNumber(licenseNumber);
    }

    public List<CarVo> getCars() {
        return cars;
    }

    public void setCars(List<CarVo> cars) {
        this.cars = cars;
    }

    public CarVo getSelectedCar() {
        return selectedCar;
    }

    public void setSelectedCar(CarVo selectedCar) {
        this.selectedCar = selectedCar;
    }

    public CarVo getNewCar() {
        return newCar;
    }

    public void setNewCar(CarVo newCar) {
        this.newCar = newCar;
    }
}
