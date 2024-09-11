public class PhoneBuilder {
    private String os;
    private int size;
    private int cameraSize;
    private double battery;
    private  int ram;

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public PhoneBuilder setSize(int size) {
        this.size = size;
        return this;
    }

    public PhoneBuilder setCameraSize(int cameraSize) {
        this.cameraSize = cameraSize;
        return this;
    }

    public PhoneBuilder setBattery(double battery) {
        this.battery = battery;
        return this;
    }

    public PhoneBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public Phone getPhone(){
        return new Phone(os, ram, cameraSize, battery, size);
    }

}
