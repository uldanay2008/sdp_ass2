package spacemission.abstractfactory.lunar;
import spacemission.abstractfactory.LifeSupportModule;

public class LunarLifeSupportModule implements LifeSupportModule {
    @Override
    public void maintainLifeSupport() {
        System.out.print("Lunar life support module is maintainung oxygen and temperature.");
    }
}
