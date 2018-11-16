public class Plane {

    PlaneType planeType;

    public Plane(PlaneType planeType) {
        this.planeType = planeType;
    }

    public PlaneType getPlaneType() {
        return planeType;
    }

    public void setPlaneType(PlaneType planeType) {
        this.planeType = planeType;
    }

    public int getPlaneCapacity(){
        return this.planeType.getCapacity();
    }

    public int getPlaneWeight(){
        return this.planeType.getPlaneWeight();
    }


}