package app;

import data.*;

public class Main {
    public static void main(String[] args) {

        Processor proc = new Processor("Core i7", "Intel", "1234567", 3000, 30);
        Memory mem = new Memory("Vengeance LPX", "Corsair", "345678", 4096, 1066, 20);
        HardDrive hd = new HardDrive("BarraCuda", "Seagate", "abcd", 4000);
        Computer comp = new Computer(proc, mem, hd);
        System.out.println(comp);

        try {
            mem.increaseClock(600);
            //proc.increaseClock(800);
            System.out.println("Po podkręceniu: " + comp);

        } catch (TempOverLimitException e) {
            System.out.println(e.getMessage());
        }
    }
}
