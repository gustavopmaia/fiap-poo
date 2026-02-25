package br.com.fiapride.model;

public class Mouse {
    public int dpi;
    public double size;
    public boolean isWired;
    public boolean isConnected;

    public void click() {
        if(!this.isConnected) {
            System.out.println("Mouse não está conectado");
            return;
        }

        System.out.println("Clicou!");
    }

    public void scroll(boolean isUp) {
        if(!this.isConnected) {
            System.out.println("Mouse não está conectado");
            return;
        }

        System.out.println("Mouse scrollou para" + (isUp ? "Cima" : "Baixo"));
    }
}
