public class car {

    private String make = "iron";
    private int doors =2;
    private boolean convertible = true;

    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }



    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void describecar(){

        System.out.println(doors+make);
    }
}
