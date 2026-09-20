package spacemission.factorymethod;

public class Rover implements Spacecraft {
    @Override
    public void launch() {
        System.out.println("Rover has been launched toward the planet");
    }

    @Override
    public void explore() {
        System.out.println("Rover is exploring the planetary surface");
    }
}
