public class Passenger {

    String name;
    int numOfBags;


    public Passenger(String name, int numOfBags) {
        this.name = name;
        this.numOfBags = numOfBags;
    }

    public String getName() {
        return name;
    }

    public int getNumOfBags() {
        return numOfBags;
    }

    public void setNumOfBags(int numOfBags) {
        this.numOfBags = numOfBags;
    }

    public int totalWeightOfBags(int numOfBags, FlightManager flightManager){
        return numOfBags * flightManager.baggageWeightAllowed();  // weight of a single bag in kg
    }
}
