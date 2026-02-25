package br.com.fiapride.main;

import br.com.fiapride.model.Passageiro;
import br.com.fiapride.model.Mouse;

public class SistemaPrincipal {
    public static void main(String[] args) {
        // INSTANCIAÇÃO
        // O comando 'new' aloca memória para um novo objeto.
        // Criando o primeiro passageiro (Objeto 1)
        Passageiro passageiro1 = new Passageiro();
        passageiro1.nome = "Ana Silva";
        passageiro1.saldo = 50.0;

        // Criando o segundo passageiro (Objeto 2)
        Passageiro passageiro2 = new Passageiro();
        passageiro2.nome = "Carlos Souza";
        passageiro2.saldo = 12.50;

        // Exibindo os dados no Console
//        System.out.println("--- Sistema FiapRide ---");
//        System.out.println("Passageiro: " + passageiro1.nome + " | Saldo: R$" + passageiro1.saldo);
//        System.out.println("Passageiro: " + passageiro2.nome + " | Saldo: R$" + passageiro2.saldo);

        // Teste mental: Se eu mudar o nome do passageiro1, o passageiro2 muda?

        Mouse mouse1 = new Mouse();
        mouse1.dpi = 500;
        mouse1.isConnected = true;
        mouse1.isWired = true;
        mouse1.size = 20;

        System.out.println("Mouse 1 | Tamanho: " + mouse1.size + " | Está conectado?: " + mouse1.isConnected + " | É com fio?: " + mouse1.isWired + " | DPI: " + mouse1.dpi);

        Mouse mouse2 = new Mouse();
        mouse2.dpi = 5000;
        mouse2.isConnected = false;
        mouse2.isWired = true;
        mouse2.size = 50;

        System.out.println("Mouse 2 | Tamanho: " + mouse2.size + " | Está conectado?: " + mouse2.isConnected + " | É com fio?: " + mouse2.isWired + " | DPI: " + mouse2.dpi);
    }
}