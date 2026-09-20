package spacemission;

import spacemission.factorymethod.RoverFactory;
import spacemission.factorymethod.SatelliteFactory;
import spacemission.factorymethod.SpacecraftFactory;

import spacemission.abstractfactory.LunarMissionFactory;
import spacemission.abstractfactory.MarsMissionFactory;
import spacemission.abstractfactory.MissionControl;
import spacemission.abstractfactory.MissionEquipmentFactory;

public class Main {

    public static void main(String[] args) {

        // PART A - FACTORY METHOD

        System.out.println("PART A - FACTORY METHOD");

        SpacecraftFactory satelliteFactory =
                new SatelliteFactory();

        satelliteFactory.prepareMission();

        System.out.println();

        SpacecraftFactory roverFactory =
                new RoverFactory();

        roverFactory.prepareMission();


        // PART B - ABSTRACT FACTORY

        System.out.println();
        System.out.println("PART B - ABSTRACT FACTORY");

        System.out.println();
        System.out.println("--- MARS MISSION ---");

        MissionEquipmentFactory marsFactory =
                new MarsMissionFactory();

        MissionControl marsMission =
                new MissionControl(marsFactory);

        marsMission.prepareMission();


        System.out.println();
        System.out.println("--- LUNAR MISSION ---");

        MissionEquipmentFactory lunarFactory =
                new LunarMissionFactory();

        MissionControl lunarMission =
                new MissionControl(lunarFactory);

        lunarMission.prepareMission();
    }
}