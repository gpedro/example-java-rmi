package net.gpedro.faculdade.javarmi.client;

import java.rmi.Naming;
import java.rmi.RMISecurityManager;

import net.gpedro.faculdade.javarmi.shared.PingPacket;

@SuppressWarnings("deprecation")
public class PingClient {

    public static void main(String[] args) {

        // Assegurando as configurações de segurança do RMI
        if (System.getSecurityManager() == null) {
            System.setSecurityManager(new RMISecurityManager());
        }

        try {
            // Invocando método remoto
            PingPacket packet = (PingPacket) Naming.lookup("//127.0.0.1/ping");
            System.out.println("requesting ping :: " + packet.ping(2));

            // Dados do objeto retornado pelo método remoto
            System.out.println("Packet Size: " + packet.packetSize());
            System.out.println("Packet Date: " + packet.packetData());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
