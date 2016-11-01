package hu.nutty.interview.ulyssys.parkingregistry.persistence.dao.impl;

import hu.nutty.interview.ulyssys.parkingregistry.persistence.dao.CarDao;
import hu.nutty.interview.ulyssys.parkingregistry.vo.CarVo;
import hu.nutty.interview.ulyssys.parkingregistry.vo.enums.Brand;

import javax.enterprise.inject.Model;
import java.util.ArrayList;
import java.util.List;

@Model
public class CarDaoImpl implements CarDao {
    private List<CarVo> cars;

    public CarDaoImpl() {
        cars = new ArrayList<>();
        cars.add(new CarVo("AAA-111", Brand.OPEL, "Vectra", 2000, "black"));
        cars.add(new CarVo("ASD-123", Brand.BMW, "M5", 2010, "white"));
    }

    @Override
    public boolean saveCar(CarVo car) {
        return cars.add(car);
    }

    @Override
    public boolean deleteCar(CarVo car) {
        return cars.remove(car);
    }

    @Override
    public List<CarVo> findAllCars() {
        return new ArrayList<>(cars);
    }

    @Override
    public CarVo findCarByLicensePlateNumber(String licenseNumber) {
        return cars.stream()
                .filter(c -> c.getLicensePlateNumber().equals(licenseNumber))
                .findFirst()
                .get();
    }
}
