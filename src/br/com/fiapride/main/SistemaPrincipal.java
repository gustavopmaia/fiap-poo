package br.com.fiapride.main;

import br.com.fiapride.model.Passageiro;
import br.com.fiapride.model.Mouse;

public class SistemaPrincipal {
    public static void main(String[] args) {
        // INSTANCIAÇÃO
        // O comando 'new' aloca memória para um novo objeto.
        // Criando o primeiro passageiro (Objeto 1)
        Passageiro passageiro1 = new Passageiro("Ana Silva", "222");
        System.out.println("Recarga passageiro 1");
        passageiro1.adicionarSaldo(100);

        // Criando o segundo passageiro (Objeto 2)
        Passageiro passageiro2 = new Passageiro("Carlos Souza", "333");
        System.out.println("Recarga passageiro 2");
        passageiro2.adicionarSaldo(50);
        passageiro2.adicionarSaldo(0);

        passageiro1.pagarViagem(50);
        passageiro2.pagarViagem(60);

        // Exibindo os dados no Console
//        System.out.println("--- Sistema FiapRide ---");
//        System.out.println("Passageiro: " + passageiro1.nome + " | Saldo: R$" + passageiro1.saldo);
//        System.out.println("Passageiro: " + passageiro2.nome + " | Saldo: R$" + passageiro2.saldo);

        // Teste mental: Se eu mudar o nome do passageiro1, o passageiro2 muda?

        System.out.println("----------------------------------------------------");

        Mouse mouse1 = new Mouse(500, 20.0, true, true);
        System.out.println("Mouse 1 | Tamanho: " + mouse1.size + " | Está conectado?: " + mouse1.isConnected + " | É com fio?: " + mouse1.isWired);

        Mouse mouse2 = new Mouse(5000, 50.0, true, false);
        System.out.println("Mouse 2 | Tamanho: " + mouse2.size + " | Está conectado?: " + mouse2.isConnected + " | É com fio?: " + mouse2.isWired);

        System.out.println("Clicando mouse 1");
        mouse1.click(); // SUCESSO
        System.out.println("Clicando mouse 2");
        mouse2.click(); // ERRO

        System.out.println("Scroll mouse 1");
        mouse1.scroll(true); // SUCESSO
        System.out.println("Scroll mouse 2");
        mouse2.scroll(false); // ERRO

        System.out.println("DPI mouse 1");
        mouse1.changeDpi(500);
        System.out.println("DPI mouse 2");
        mouse2.changeDpi(0);

        System.out.println("Conectar mouse 1");
        mouse1.connect();
        System.out.println("Conectar mouse 2");
        mouse2.connect();

        System.out.println("Testando mouse 2 depois de conectar");
        mouse2.scroll(true);
        mouse2.click();
    }
}