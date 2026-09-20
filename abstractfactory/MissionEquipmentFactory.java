package spacemission.abstractfactory;

public interface MissionEquipmentFactory {
    PropulsionSystem createPropulsionSystem();
    LifeSupportModule createLifeSupportModule();
    CommunicationArray createCommunicationArray();
}
