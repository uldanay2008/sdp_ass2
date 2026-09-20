package spacemission.factorymethod;

public class RoverFactory extends SpacecraftFactory{
    @Override
    public Spacecraft createSpacecraft() {
        return new Rover();
    }
}
