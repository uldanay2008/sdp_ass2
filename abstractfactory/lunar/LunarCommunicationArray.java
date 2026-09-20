package spacemission.abstractfactory.lunar;

import spacemission.abstractfactory.CommunicationArray;

public class LunarCommunicationArray implements CommunicationArray {
    @Override
    public void communicate() {
        System.out.println("Lunar communication array is sending data to Earth.");
    }
}
