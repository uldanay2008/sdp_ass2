package spacemission.abstractfactory.mars;

import spacemission.abstractfactory.LifeSupportModule;

public class MarsLifeSupportModule implements LifeSupportModule {
    @Override
    public void maintainLifeSupport(){
        System.out.println("Mars life support module is maintaining oxygen and temperature.");
    }
}
