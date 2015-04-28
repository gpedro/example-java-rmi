package net.gpedro.faculdade.javarmi.server;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.util.Date;

import net.gpedro.faculdade.javarmi.shared.PingPacket;

/**
 * PingPacket com valores Defaults
 * 
 * @author gpedro
 *
 */
public class DefaultPingPacket implements PingPacket, Serializable {

    private static final long serialVersionUID = 1L;

    @Override
    public String origin() {
        return "localhost";
    }

    @Override
    public int packetSize() {
        return 64;
    }

    @Override
    public Date packetData() {
        return new Date();
    }

    @Override
    public String ping(int locate) throws RemoteException {

        String pong;

        switch (locate) {

        // Inglês
            case 0:
                pong = "pong";
            break;

            // Russo
            case 1:
                pong = "понг";
            break;

            // Tailandês
            case 2:
                pong = "สาบ";
            break;

            // Arabe
            case 3:
                pong = "بونغ";
            break;

            default:
                pong = "ping";
            break;
        }

        System.out.println("receiving ping :: " + pong);

        return pong;
    }
}
