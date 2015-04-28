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
     * @throws RemoteException
     */
    String origin() throws RemoteException;

    /**
     * Tamanho do pacote
     * 
     * @return
     * @throws RemoteException
     */
    int packetSize() throws RemoteException;

    /**
     * Data do pacote
     * 
     * @return
     * @throws RemoteException
     */
    Date packetData() throws RemoteException;

    /**
     * Responder pong de acordo com o LocateId
     * 
     * @return
     * @throws RemoteException
     */
    String ping(int locate) throws RemoteException;
}
