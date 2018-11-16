public enum PlaneType {

    BOEING747(10, 20),
    BOEING707(3, 10),
    BOIENG727(5, 15);

    private final int capacity;
    private final int planeWeight;

    PlaneType(int capacity, int planeWeight){
        this.capacity = capacity;
        this.planeWeight = planeWeight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPlaneWeight() {
        return planeWeight;
    }



}
