package baran.UDPService;

import java.net.InetAddress;

public class StreamerInfo {
    private final InetAddress address;
    private final int port;
    public StreamerInfo(InetAddress address, int port) {
        this.address = address;
        this.port = port;
    }
    public InetAddress getAddress() {
        return address;

    }
    public int getPort() {
        return port;
    }

}
