package spacemission.abstractfactory.lunar;

import spacemission.abstractfactory.PropulsionSystem;

public class LunarPropulsionSystem implements PropulsionSystem {
    @Override
    public void activate(){
        System.out.println("Lunar propulsion system is activated. ");
    }
}
