package net.gpedro.faculdade.javarmi.server;

import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

import net.gpedro.faculdade.javarmi.shared.Calculadora;

/**
 * Esta clase, Servidor de Cálculo, é responsável por receber métodos,
 * executa-los e enviar o retorno para a origem
 *
 */

@SuppressWarnings("deprecation")
public class ServidorCalculo {

    @SuppressWarnings("unused")
    public static void main(String[] args) {

        // Configurando seguranças para RMI
        System.setSecurityManager(new RMISecurityManager());

        try {
            // Criando serviço na porta 1099
            LocateRegistry.createRegistry(1099);
            // Criando objeto a ser enviado
            Calculadora packet = new CalculadoraHP(){

                private static final long serialVersionUID = 1L;

                @Override
                public void listener(String method) {
                    System.out.println("Executando Calculadora#" + method + " no lado do servidor");
                }
                
            };

            // Exportando o objeto para enviar
            Calculadora stub = (Calculadora) UnicastRemoteObject.exportObject(packet, 0);

            // Declarando o método na /calculadora
            Naming.rebind("calculadora", packet);
            
            System.out.println("Servidor de Cálculo está pronto para ser utilizado.");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
