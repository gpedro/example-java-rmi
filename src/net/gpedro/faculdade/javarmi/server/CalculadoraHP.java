package net.gpedro.faculdade.javarmi.server;

import java.io.Serializable;
import java.rmi.RemoteException;

import net.gpedro.faculdade.javarmi.shared.Calculadora;

/**
 * Um legítima calculador HP de dois reais
 *
 */
public abstract class CalculadoraHP implements Calculadora, Serializable {

    private static final long serialVersionUID = 1L;

    @Override
    public int somar(int n1, int n2) throws RemoteException {
        listener("somar");
        return (n1 + n2);
    }

    @Override
    public int substrair(int n1, int n2) throws RemoteException {
        listener("substrair");
        return (n1 - n2);
    }

    @Override
    public int multiplicar(int n1, int n2) throws RemoteException {
        listener("multiplicar");
        return (n1 * n2);
    }

    @Override
    public float dividir(int n1, int n2) throws RemoteException {
        listener("dividir");
        return (n1 / n2);
    }
    
    /**
     * Método apenas para mostrar de qual lado a operação está sendo realizado
     */
    public abstract void listener(String method);

}
