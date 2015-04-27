package net.gpedro.faculdade.javarmi.server;

import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

import net.gpedro.faculdade.javarmi.shared.PingPacket;

@SuppressWarnings("deprecation")
public class PingServer {

    @SuppressWarnings("unused")
    public static void main(String[] args) {

        // Configurando seguranças para RMI
        System.setSecurityManager(new RMISecurityManager());
        
        try {
            // Criando serviço na porta 1099
            LocateRegistry.createRegistry(1099);
            
            // Criando objeto a ser enviado
            PingPacket packet = new DefaultPingPacket();
            
            // Exportando o objeto
            PingPacket stub = (PingPacket) UnicastRemoteObject.exportObject(
                    packet, 0);
            
            // Declarando o método na /ping
            Naming.rebind("ping", packet);
            System.out.println("Ping server ready");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
