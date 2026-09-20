package spacemission.abstractfactory;
import spacemission.abstractfactory.mars.MarsCommunicationArray;
import spacemission.abstractfactory.mars.MarsLifeSupportModule;
import spacemission.abstractfactory.mars.MarsPropulsionSystem;

public class MarsMissionFactory implements MissionEquipmentFactory {
    @Override
    public PropulsionSystem createPropulsionSystem() {
        return new MarsPropulsionSystem();
    }

    @Override
    public LifeSupportModule createLifeSupportModule() {
        return new MarsLifeSupportModule();
    }

    @Override
    public CommunicationArray createCommunicationArray() {
        return new MarsCommunicationArray();
    }
}
