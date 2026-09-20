package spacemission.abstractfactory;

public class MissionControl {
    private final MissionEquipmentFactory factory;

    public MissionControl(MissionEquipmentFactory factory) {
        this.factory = factory;
    }

    public void prepareMission() {
        PropulsionSystem propulsion = factory.createPropulsionSystem();
        LifeSupportModule lifeSupport = factory.createLifeSupportModule();
        CommunicationArray communication = factory.createCommunicationArray();

        System.out.println("=== Preparing mission equipment ===");

        propulsion.activate();
        lifeSupport.maintainLifeSupport();
        communication.communicate();
    }
}
