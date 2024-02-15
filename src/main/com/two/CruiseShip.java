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
        System.out.println("The name of the ship is: " + getshipName());
        System.out.println("The maximum number of passnegers allowed on the ship is: " + getmaximumPassengers());
    }
}
