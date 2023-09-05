package com.api_spring.demo.repository;

import com.api_spring.demo.model.CarModel;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarRepository {

    private List<CarModel> cars;

    public CarRepository() {
        cars = listCars();
    }

    public List<CarModel> listCars() {
        List<CarModel> tempCars = new ArrayList<>();
        tempCars.add(new CarModel(1, "A1", "Audi", "noir"));
        tempCars.add(new CarModel(2, "A3", "Audi", "blanc"));
        tempCars.add(new CarModel(3, "206", "peugeot", "vert"));
        tempCars.add(new CarModel(4, "C3", "citroen", "bleu"));
        tempCars.add(new CarModel(5, "megane", "renault", "vert"));
        return tempCars;
    }

    public List<CarModel> findAll() {
        return cars;
    }

    public CarModel findById(int id){
        for (int i = 0; i < cars.size(); i++) {
            CarModel car = cars.get(i);
            if (car.getId() == id) {
                return car;
            }
        }
        return null;
    }


    public CarModel save(CarModel car) {

        int nextId = cars.size() + 1; // vu que les ID commencent à 1
        car.setId(nextId);
        cars.add(car);
        return car;
    }
    public CarModel updateById(int id, CarModel updatedCar) {
        for (int i = 0; i < cars.size(); i++) {
            CarModel car = cars.get(i);
            if (car.getId() == id) {
                car.setModele(updatedCar.getModele());
                car.setMarque(updatedCar.getMarque());
                car.setCouleur(updatedCar.getCouleur());
                return car;
            }
        }
        return null;
    }

    public CarModel deleteById(int id) {
        for (int i = 0; i < cars.size(); i++) {
            CarModel car = cars.get(i);
            if (car.getId() == id) {
                cars.remove(i);
                return car;
            }
        }
        return null;
    }

}

