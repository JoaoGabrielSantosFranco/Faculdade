package builder;

public class CarManualBuilder 
    implements Builder{
        private Manual manual = new Manual();

        @Override
        public void reset() {
            manual = new Manual();
        }
        public Manual getResult(){
            return manual;
        }
        @Override
        public void setSeats(int number) {
            manual.setNumberSeats(number);
        }
        @Override
        public void setEngine(int number) {
            manual.setEngine(number);
        }
    
        @Override
        public void setTripComputer(boolean has) {
            manual.setHasTripComputer(has);
        }
    
        @Override
        public void setGPS(boolean has) {
            manual.setHasGPS(has);
        }
}
