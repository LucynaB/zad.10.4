package data;

public class Processor extends Item implements Increaseable {
    private static final int MAX_TEMP = 100;
    private int temp;
    private int clock;

    public Processor(String model, String producer, String serialNumber, int clock, int temp) {
        super(model, producer, serialNumber);
        this.temp = temp;
        this.clock = clock;
    }

    public static int getMaxTemp() {
        return MAX_TEMP;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public int getClock() {
        return clock;
    }

    public void setClock(int clock) {
        this.clock = clock;
    }

    @Override
    public void increaseClock(int number) {
        if (temp + 10 * (number / 100) > MAX_TEMP) {
            throw new TempOverLimitException("Przekroczysz max. temperaturę procesora.");
        }
        clock += number;
        temp += 10 * (number / 100);
    }

    @Override
    public String toString() {
        return super.toString() + "taktowanie: " + clock + " temp: " + temp;
    }
}
