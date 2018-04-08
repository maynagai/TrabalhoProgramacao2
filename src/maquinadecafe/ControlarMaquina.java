package maquinadecafe;

public class ControlarMaquina {
    private boolean ligada;
    private int saldo;
  
    
    public ControlarMaquina(){
        this.ligada = false;
        this.saldo = 0;
    }
    public ControlarMaquina(boolean liga, float valor){
        this.ligada = liga;
        this.saldo = 0;
    }
    public void ligar(){
        this.setLigada(true);
    }
    
    public void desligar(){
        this.setLigada(false); 
    }
    public void desligar (float saldo){
        this.setLigada(false);
        this.saldo = 0;
    }
    public boolean isLigada() {
        return ligada;
    }

    
    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldo() {
        return saldo;
    }
    
}