package net.gpedro.faculdade.javarmi.client;

import java.rmi.Naming;
import java.rmi.RMISecurityManager;

import net.gpedro.faculdade.javarmi.shared.Calculadora;

/**
 * Classe que representa o cliente querendo usar um servidor de cálculo
 *
 */
@SuppressWarnings("deprecation")
public class ClienteCalculadora {

    // Endereço de IP do servidor remoto.
    static String endpoint_addr = "127.0.0.1";
    
    public static void main(String[] args) {

        // Assegurando as configurações de segurança do RMI
        if (System.getSecurityManager() == null) {
            System.setSecurityManager(new RMISecurityManager());
        }

        try {
            // Obtendo referencia do objeto remoto
            Calculadora calculadora = (Calculadora) Naming.lookup("//" + endpoint_addr + "/calculadora");

            // Executando métodos do remoto
            System.out.println("> Enviando execução do método Calculadora#multiplicar");
            int resultadoMultiplicacao = calculadora.multiplicar(21, 2);
            System.out.println("< Resposta do método Calculadora#multiplicar: " + resultadoMultiplicacao);
            
            // Executando métodos do remoto
            System.out.println("> Enviando execução do método Calculadora#dividir");
            float resultadoDivisao = calculadora.dividir(29, 7);
            System.out.println("< Resposta do método Calculadora#dividir: " + resultadoDivisao);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
