package spacemission.abstractfactory.mars;

import spacemission.abstractfactory.CommunicationArray;

public class MarsCommunicationArray implements CommunicationArray {
    @Override
    public void communicate() {
        System.out.println("Mars communication array is sending data to Earth.");
    }
}
