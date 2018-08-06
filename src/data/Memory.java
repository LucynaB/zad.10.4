package data;

public class Memory extends Item implements Increaseable {
    private static final int MAX_TEMP = 100;
    private int size;
    private int clock;
    private int temp;

    public Memory(String model, String producer, String serialNumber, int size, int clock, int temp) {
        super(model, producer, serialNumber);
        this.size = size;
        this.clock = clock;
        this.temp = temp;
    }

    public static int getMaxTemp() {
        return MAX_TEMP;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getClock() {
        return clock;
    }

    public void setClock(int clock) {
        this.clock = clock;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    @Override
    public void increaseClock(int number) {
        if (temp + 15 * (number / 100) > MAX_TEMP) {
            throw new TempOverLimitException("Przekroczysz max. temperaturę pamięci.");
        }
        clock += number;
        temp += 15 * (number / 100);
    }

    @Override
    public String toString() {
        return super.toString() + "taktowanie: " + clock + " temp: " + temp;
    }
}
