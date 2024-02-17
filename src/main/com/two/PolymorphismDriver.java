package main.com.two;

public class PolymorphismDriver {
    public static void main(String[] args) {
        Ship[] shipArray = new Ship[3]; 
        shipArray[0] = new Ship("Nina", "1492"); 
        shipArray[1] = new CargoShip("Pinta", "1495", 550000); 
        shipArray[2] = new CruiseShip("Santa Maria", "1455", 20000); 

        for(int ship = 0; ship < shipArray.length; ship++) {
            shipArray[ship].printShip();
        }

    }
}
