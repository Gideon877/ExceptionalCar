package the_car.exception;

public class CarException extends Exception {
    private  String message;
    public CarException() {
        this.message = "Car not started and no fuel.";
    }

    @Override
    public String getMessage() {
        return message;
    }

}
