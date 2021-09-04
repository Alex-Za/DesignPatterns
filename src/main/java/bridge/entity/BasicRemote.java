package bridge.entity;

import bridge.interfaces.Device;
import bridge.interfaces.Remote;

public class BasicRemote implements Remote {
    protected Device device;

    public BasicRemote() {}

    public BasicRemote(Device device) {
        this.device = device;
    }
    @Override
    public void power() {

    }

    @Override
    public void volumeDown() {

    }

    @Override
    public void volumeUp() {

    }

    @Override
    public void channelDown() {

    }

    @Override
    public void channelUp() {

    }
}
