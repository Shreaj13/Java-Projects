public class CruiseShip extends Ship {
    int passengers;

    public CruiseShip(String n,String y, int p){
        super(n,y);
        passengers = p;
    }

    public CruiseShip(CruiseShip cruise){
        super(cruise.getName(), cruise.getYearBuilt());
        passengers = cruise.getPassengers();
    }
    public int getPassengers(){
        return passengers;
    }

    public void setPassengers(int p) {

        passengers = p;
    }
    @Override
    public String toString(){
        return "Ship Name: " +getName() + " Max Passengers: " +passengers;
    }

    @Override
    public void display() {
        System.out.println("Cruise Ship: " + getName() + " Year Build: "+getYearBuilt()+" Max Passenger: " + getPassengers());

    }
}
