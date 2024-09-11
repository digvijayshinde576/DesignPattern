public class Phone {

    private String os;
    private int size;
    private int cameraSize;
    private double battery;
    private  int ram;


    public Phone(String os, int size, int cameraSize, double battery, int ram) {
        this.os = os;
        this.size = size;
        this.cameraSize = cameraSize;
        this.battery = battery;
        this.ram = ram;
    }

//    public String getOs() {
//        return os;
//    }
//
//    public void setOs(String os) {
//        this.os = os;
//    }
//
//    public int getSize() {
//        return size;
//    }
//
//    public void setSize(int size) {
//        this.size = size;
//    }
//
//    public int getCameraSize() {
//        return cameraSize;
//    }
//
//    public void setCameraSize(int cameraSize) {
//        this.cameraSize = cameraSize;
//    }
//
//    public void setRam(int ram) {
//        this.ram = ram;
//    }
//
//    public double getBattery() {
//        return battery;
//    }
//
//    public void setBattery(double battery) {
//        this.battery = battery;
//    }
//
//    public int getRam() {
//        return ram;
//    }

    @Override
    public String toString() {
        return "Phone{" +
                "os='" + os + '\'' +
                ", size=" + size +
                ", cameraSize=" + cameraSize +
                ", battery=" + battery +
                ", ram=" + ram +
                '}';
    }
}
