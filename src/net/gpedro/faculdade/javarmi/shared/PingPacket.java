package net.gpedro.faculdade.javarmi.shared;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;

/**
 * Pacote do Ping
 * 
 * @author gpedro
 *
 */
public interface PingPacket extends Remote {
    /**
     * Origem do pacote
     * 
     * @return
     */
    String origin() throws RemoteException;

    /**
     * Tamanho do pacote
     * 
     * @return
     */
    int packetSize() throws RemoteException;

    /**
     * Data do pacote
     * 
     * @return
     */
    Date packetData() throws RemoteException;

}
