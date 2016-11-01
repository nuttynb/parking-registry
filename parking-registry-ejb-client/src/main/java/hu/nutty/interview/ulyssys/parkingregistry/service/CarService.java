package hu.nutty.interview.ulyssys.parkingregistry.service;

import hu.nutty.interview.ulyssys.parkingregistry.vo.CarVo;

import java.util.List;

public interface CarService {
    boolean saveCar(CarVo car);

    boolean deleteCar(CarVo car);

    List<CarVo> findAllCars();

    CarVo findCarByLicensePlateNumber(String licenseNumber);
}
