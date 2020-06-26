package the_car.exception;

public class CarNotStartedException extends CarException {
    private final String message;

    public  CarNotStartedException() {
        this.message = "Car not started";
    }

    @Override
    public String getMessage() {
        return message;
    }
}
