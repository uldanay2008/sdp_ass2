package spacemission.abstractfactory.mars;

import spacemission.abstractfactory.PropulsionSystem;

public class MarsPropulsionSystem implements PropulsionSystem {
    @Override
    public void activate() {
        System.out.println("Mars propulsion system is activated.");
    }
}
