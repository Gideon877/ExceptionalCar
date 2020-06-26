package the_car.exception;

public class CarOutOfFuelException extends CarException{
    private final String message;
    public CarOutOfFuelException(){
        this.message = "No petrol left!";
//        System.out.println("No petrol left!");
    }

    @Override
    public String getMessage() {
        return message;
    }
}
