package builder;

public class CarBuilder 
        implements Builder {
    
    private Car car = new Car();

    @Override
    public void reset() {
        car = new Car();
    }
    public Car getResult(){
        return car;
    }
    @Override
    public void setSeats(int number) {
        car.setNumberSeats(number);
    }
    @Override
    public void setEngine(int number) {
        car.setEngine(number);
    }

    @Override
    public void setTripComputer(boolean has) {
        car.setHasTripComputer(has);
    }

    @Override
    public void setGPS(boolean has) {
        car.setHasGPS(has);
    }
    
}
