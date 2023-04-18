import java.util.ArrayList;

public class ShipDemo {
    public static void main(String[] args) {
        Ship [] ships = new Ship[4];

        ships[0] = new CruiseShip("Wonder of the seas","2022", 6900);
        ships[1] = new CruiseShip("Ariva","2022", 6500);
        ships[2] = new CargoShip("Pioneering Spirit","2000",403342);
        ships[3] = new CargoShip("Bellamya","2005",275276);

        for (Ship ship : ships){
            ship.display();
        }
        ArrayList shipList = new ArrayList<>();

        shipList.add(new CruiseShip("Iona","2020", 6500));
        shipList.add(new CruiseShip("Mardi Gras","2021", 5200));
        shipList.add(new CargoShip("Oceania","2018", 234006));
        shipList.add(new CargoShip("MSC Leni","2022", 232311));
        System.out.println();
        System.out.println(shipList.toString());
        System.out.println();

        // Testing copy constructor
        CruiseShip cruise1 = new CruiseShip("Norwegian Bliss","2018",4000);
        System.out.println(cruise1);
        CruiseShip cruise1_copy = new CruiseShip(cruise1);
        System.out.println("This is a copy \n" +cruise1_copy);

        CargoShip cargo1 = new CargoShip("Ever Greet","2015",219688);
        System.out.println(cargo1);
        CargoShip cargo1_copy = new CargoShip(cargo1);
        System.out.println("This is a copy \n" +cargo1_copy);


    }
}
