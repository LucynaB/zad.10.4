package data;

public class HardDrive extends Item {
    private int size;

    public HardDrive(String model, String producer, String serialNumber, int size) {
        super(model, producer, serialNumber);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return super.toString()+size;
    }
}
