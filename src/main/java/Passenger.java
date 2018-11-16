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
        return numOfBags * flightManager.averageWeight(); // weight of a single bag is 5kg
    }
}
