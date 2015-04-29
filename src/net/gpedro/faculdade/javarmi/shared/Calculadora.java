package net.gpedro.faculdade.javarmi.shared;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Interface de uma calculadora e suas operações básicas
 * @author gpedro
 *
 */
public interface Calculadora extends Remote {

    /**
     * Método para somar dois valores
     * @param n1 Numero 01
     * @param n2 Numero 02
     * @return
     * @throws RemoteException
     */
    int somar(int n1, int n2) throws RemoteException;

    /**
     * Método para substrair dois valores
     * @param n1 Numero 01
     * @param n2 Numero 02
     * @return
     * @throws RemoteException
     */
    int substrair(int n1, int n2) throws RemoteException;

    /**
     * Método para multiplicar dois valores
     * @param n1 Numero 01
     * @param n2 Numero 02
     * @return
     * @throws RemoteException
     */
    int multiplicar(int n1, int n2) throws RemoteException;

    /**
     * Método para dividir dois valores
     * 
     * @param n1 Numero 01
     * @param n2 Numero 02
     * @return
     * @throws RemoteException
     */
    float dividir(int n1, int n2) throws RemoteException;

}
