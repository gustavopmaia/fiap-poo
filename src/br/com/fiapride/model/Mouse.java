package br.com.fiapride.model;

public class Mouse {
    private int dpi;
    public double size;
    public boolean isWired;
    public boolean isConnected;

    public Mouse(int dpi, double size, boolean isWired, boolean isConnected) {
        this.dpi = dpi;
        this.size = size;
        this.isWired = isWired;
        this.isConnected = isConnected;
    }

    public void click() {
        if(!this.isConnected) {
            System.out.println("Erro: Mouse não está conectado");
            return;
        }

        System.out.println("Clicou!");
    }

    public void scroll(boolean isUp) {
        if(!this.isConnected) {
            System.out.println("Erro: Mouse não está conectado");
            return;
        }

        System.out.println("Mouse scrollou para " + (isUp ? "Cima" : "Baixo"));
    }

    public void connect() {
        if(this.isConnected) {
            System.out.println("Erro: Mouse já está conectado");
            return;
        }

        this.isConnected = true;
        System.out.println("Mouse conectado!");
    }

    public void changeDpi(int newDpi) {
        if(newDpi <= 0) {
            System.out.println("Erro: DPI tem que ser maior que zero.");
            return;
        }

        this.dpi = newDpi;
        System.out.println("Nova DPI do mouse: " + this.dpi);
    }
}
