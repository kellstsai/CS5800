package main.com.two;

public class CruiseShip extends Ship {
    private int maximumPassengers; 

    public CruiseShip(String shipName, String shipBuiltYear, int maximumPassengers){
        super(shipName, shipBuiltYear); 
        this.maximumPassengers = maximumPassengers; 
    }

    public void setmaximumPassengers(int maximumPassengers) {
        this.maximumPassengers = maximumPassengers; 
    }

    public int getmaximumPassengers() {
        return maximumPassengers; 
    }

    @Override
    public void printShip() {
        System.out.println("The name of the ship is: " + getshipName() + ". The maximum number of passengers that the ship allows is: " + getmaximumPassengers());
    }
}
