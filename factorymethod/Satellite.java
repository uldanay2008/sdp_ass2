package spacemission.factorymethod;

public class Satellite implements Spacecraft {
    @Override
    public void launch() {
        System.out.println("Satellite has been launched into orbit.");
    }

    @Override
    public void explore() {
        System.out.println("Satellite is collocting data from space.");
    }
}

