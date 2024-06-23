package baran.UDPService;
import java.net.*;
public class ClientInfo {
    private final InetAddress address;
    private final int port;

    public ClientInfo(InetAddress address, int port) {
        this.address = address;
        this.port = port;
    }
    public InetAddress getAddress() {
        return address;

    }
    public int getPort() {
        return port;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ClientInfo) {
            ClientInfo other = (ClientInfo) obj;
            return address.equals(other.address) && port == other.port;
        }
        return false;
    }
    @Override
    public int hashCode() {
        return address.hashCode() + port;
    }
}
