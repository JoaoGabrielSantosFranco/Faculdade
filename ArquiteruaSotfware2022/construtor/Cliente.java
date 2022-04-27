package builder;

public class Cliente {
    public static void main(String[] args) {
        //CarBuilder builder = new CarBuilder();
        CarManualBuilder builder = new CarManualBuilder();
        builder.reset();
        builder.setEngine(2);
        builder.setGPS(true);
        builder.setSeats(7);
        builder.setTripComputer(true);
        System.out.println(builder.getResult());
    }
}
