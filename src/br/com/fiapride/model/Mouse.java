package br.com.fiapride.model;

public class Mouse {
    private int dpi;
    private double size;
    private boolean isWired;
    private boolean isConnected;

    public Mouse(int dpi, double size, boolean isWired, boolean isConnected) {
        this.setDpi(dpi);
        this.size = size;
        this.setWired(isWired);
        this.setConnected(isConnected);
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

        setConnected(true);
        System.out.println("Mouse conectado!");
    }

    public void changeDpi(int newDpi) {
        if(newDpi <= 0) {
            System.out.println("Erro: DPI tem que ser maior que zero.");
            return;
        }

        setDpi(newDpi);
        System.out.println("Nova DPI do mouse: " + this.dpi);
    }

    public int getDpi() {
        return dpi;
    }

    private void setDpi(int dpi) {
        if(dpi <= 0) {
            System.out.println("Erro: DPI não pode ser menor que zero.");
            return;
        }

        this.dpi = dpi;
    }

    public double getSize() {
        return size;
    }

    public boolean isWired() {
        return isWired;
    }

    private void setWired(boolean wired) {
        isWired = wired;
    }

    public boolean isConnected() {
        return isConnected;
    }

    private void setConnected(boolean connected) {
        isConnected = connected;
    }
}
