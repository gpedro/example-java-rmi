package net.gpedro.faculdade.javarmi.server;

import java.util.Date;

import net.gpedro.faculdade.javarmi.shared.PingPacket;

/**
 * PingPacket com valores Defaults
 * @author gpedro
 *
 */
public class DefaultPingPacket implements PingPacket {

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

}
