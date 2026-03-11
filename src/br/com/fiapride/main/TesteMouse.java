package br.com.fiapride.main;

import br.com.fiapride.model.Mouse;

public class TesteMouse {
    public static void main(String[] args) {
        Mouse mouse1 = new Mouse(500, 20.0, true, true);
        System.out.println("Mouse 1 | Tamanho: " + mouse1.getSize() + " | Está conectado?: " + mouse1.isConnected() + " | É com fio?: " + mouse1.isWired());

        Mouse mouse2 = new Mouse(5000, 50.0, true, false);
        System.out.println("Mouse 2 | Tamanho: " + mouse2.getSize() + " | Está conectado?: " + mouse2.isConnected() + " | É com fio?: " + mouse2.isWired());

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

        // TESTE DA REGRA
        // Vou utilizar o método changeDPI para testar a validação do setter (que é privado)
        mouse1.changeDpi(-100);
    }
}
