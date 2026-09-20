package spacemission.factorymethod;

public abstract class SpacecraftFactory {
    public abstract Spacecraft createSpacecraft();

    public void prepareMission() {
        Spacecraft spacecraft = createSpacecraft();

        System.out.println("Preparing spacecrafft...");
        spacecraft.launch();
        spacecraft.explore();
    }
}
