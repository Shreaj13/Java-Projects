public class CargoShip extends Ship{
    private int tonnage;
    public CargoShip( String n , String y, int t){
        super(n,y);
        tonnage = t;
    }
    public CargoShip(CargoShip cargo){
        super(cargo.getName(), cargo.getYearBuilt());
        tonnage = cargo.tonnage;

    }

    public int getTonnage() {
        return
                tonnage;
    }

    public void setTonnage(int t) {

        tonnage = t;
    }

    @Override
    public String toString() {
        return "Ship name: " +getName() +
                " tonnage= " + tonnage;
    }

    @Override
    public void display() {
        System.out.println("Cargo Ship: " + getName() + " Year Built: " +getYearBuilt() + " Tonnage: " + getTonnage());

    }
}
