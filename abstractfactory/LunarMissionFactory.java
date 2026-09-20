package spacemission.abstractfactory;

import spacemission.abstractfactory.lunar.LunarCommunicationArray;
import spacemission.abstractfactory.lunar.LunarLifeSupportModule;
import spacemission.abstractfactory.lunar.LunarPropulsionSystem;

public class LunarMissionFactory implements MissionEquipmentFactory {

    @Override
    public PropulsionSystem createPropulsionSystem() {
        return new LunarPropulsionSystem();
    }

    @Override
    public LifeSupportModule createLifeSupportModule() {
        return new LunarLifeSupportModule();
    }

    @Override
    public CommunicationArray createCommunicationArray() {
        return new LunarCommunicationArray();
    }
}