package the_car;

import the_car.exception.CarException;
import the_car.exception.CarNotStartedException;
import the_car.exception.CarOutOfFuelException;

public class Car {

    private boolean started =  false;
    private int fuelLevel = 0;

    public void start() {
        started = true;
    }

    public void stop() {
        started = false;
    }

    public void enterFuel() {
        fuelLevel += 20;
    }

    public boolean drive() throws CarException {
        if (!started) {
            throw new CarNotStartedException();
//            return false;
        }

        if (fuelLevel <= 0) {
            started = false;
            fuelLevel = 0;
//            return  false;
            throw new CarOutOfFuelException();
        }

        fuelLevel -= 5;

        return true;

    }


}
