package hu.nutty.interview.ulyssys.parkingregistry.service;


import hu.nutty.interview.ulyssys.parkingregistry.persistence.dao.CarDao;
import hu.nutty.interview.ulyssys.parkingregistry.vo.CarVo;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Stateless(name = "CarService", mappedName = "CarService")
@Local(CarService.class)
public class CarServiceImpl implements CarService {
    @Inject
    private CarDao carDao;

    @Override
    public boolean saveCar(CarVo car) {
        return carDao.saveCar(car);
    }

    @Override
    public boolean deleteCar(CarVo car) {
        return carDao.deleteCar(car);
    }

    @Override
    public List<CarVo> findAllCars() {
        return carDao.findAllCars();
    }

    @Override
    public CarVo findCarByLicensePlateNumber(String licenseNumber) {
        return carDao.findCarByLicensePlateNumber(licenseNumber);
    }
}
