package the_car;

import the_car.exception.CarException;
import the_car.exception.CarNotStartedException;
import the_car.exception.CarOutOfFuelException;

public class DriveTheCar {

    public static void main(String[] args) {
        Car theCar = new Car();
        try {

            System.out.println("Trying the to  drive the Car without fuel");
            theCar.start();
            System.out.println(theCar.drive());
        } catch(CarException ed){
            System.out.println(ed.getMessage());
        }

        try{
            System.out.println("Put fuel in the Car");
            theCar.enterFuel();

            System.out.println("Trying the to  drive the Car without starting");
            theCar.stop();
            boolean result = theCar.drive();
            System.out.println(result);
        }  catch(CarException ed){
            System.out.println(ed.getMessage());
        }

        try {
            System.out.println("Trying the to  drive the Car with fuel");
            theCar.start();
            System.out.println(theCar.drive());
            System.out.println(theCar.drive());
            System.out.println(theCar.drive());
            System.out.println(theCar.drive());
            System.out.println("Drive until all the fuel is up...");
            System.out.println(theCar.drive());
        } catch(CarException ev) {
            System.out.println(ev.getMessage());
        }

        try{
            System.out.println("If we refuel");
            theCar.enterFuel();

            System.out.println("We can start and drive the car again...");
            theCar.start();
            System.out.println(theCar.drive());
        } catch (CarException es){
            System.out.println(es.getMessage());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("---- D1 ----");
        }







    }


}
