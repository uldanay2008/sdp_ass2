package spacemission.factorymethod;

public class SatelliteFactory extends SpacecraftFactory {
    @Override
    public Spacecraft createSpacecraft() {
        return new Satellite();
    }
}
