package baran;
import baran.UDPService.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.StandardSocketOptions;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
public class App
{
    private static final int SERVER_PORT = 63636;
    private static final int CLIENT_PORT = 63637;
    private static final List<ClientInfo> clients = new CopyOnWriteArrayList<>();
    private StreamerInfo streamerInfo; // <--- this is the guy that sends the UDP data. For it we are a client, for others we are a server

    public static void main( String[] args )
    {
        System.out.println( "Server Starting at port"+ SERVER_PORT );




    }

}
