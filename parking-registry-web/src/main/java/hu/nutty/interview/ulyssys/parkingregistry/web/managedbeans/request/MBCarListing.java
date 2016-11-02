package hu.nutty.interview.ulyssys.parkingregistry.web.managedbeans.request;

import hu.nutty.interview.ulyssys.parkingregistry.service.CarService;
import hu.nutty.interview.ulyssys.parkingregistry.vo.CarVo;
import hu.nutty.interview.ulyssys.parkingregistry.web.managedbeans.view.MBCar;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name = "carListingBean")
@RequestScoped
public class MBCarListing {
    @ManagedProperty("#{carBean}")
    MBCar car;
    @EJB
    CarService carService;

    public void onDeleteCar() {
        if (!car.getSelectedCar().isParking()) {
            carService.deleteCar(car.getSelectedCar());
            car.getCars().remove(car.getSelectedCar());
            car.setSelectedCar(null);
        } else {
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!", "Cannot delete a parking car.");
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }
    }

    public void onCreate() {
        carService.findCarByLicensePlateNumber(car.getNewCar().getLicensePlateNumber());
        carService.saveCar(car.getNewCar());
        car.getCars().add(car.getNewCar());
        car.setNewCar(new CarVo());
    }

    public String doPark() {
      /*  ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
        try {
            context.redirect(context.getRequestContextPath() + "/parking.xhtml?id=" + car.getSelectedCar().getLicensePlateNumber());
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        return "/parking.xhtml?faces-redirect=true&id=" + car.getSelectedCar().getLicensePlateNumber();
    }

    public MBCar getCar() {
        return car;
    }

    public void setCar(MBCar car) {
        this.car = car;
    }
}
