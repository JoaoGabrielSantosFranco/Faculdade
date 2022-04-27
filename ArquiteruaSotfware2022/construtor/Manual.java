package builder;

public class Manual {
    private boolean hasGPS;
    private int numberSeats;
    private int engine;
    private boolean hasTripComputer;

    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Manual  ");
        builder.append("GPS: " + (hasGPS?"YES":"NO"));
        builder.append("Seats: " + numberSeats);
        builder.append("Engine: " + engine);
        builder.append("Trip Computer: " + 
                (hasTripComputer?"YES":"NO"));
        return builder.toString();
    }

    public boolean isHasGPS() {
        return hasGPS;
    }
    public void setHasGPS(boolean hasGPS) {
        this.hasGPS = hasGPS;
    }
    public int getNumberSeats() {
        return numberSeats;
    }
    public void setNumberSeats(int numberSeats) {
        this.numberSeats = numberSeats;
    }
    public int getEngine() {
        return engine;
    }
    public void setEngine(int engine) {
        this.engine = engine;
    }
    public boolean isHasTripComputer() {
        return hasTripComputer;
    }
    public void setHasTripComputer(boolean hasTripComputer) {
        this.hasTripComputer = hasTripComputer;
    }

    

}
