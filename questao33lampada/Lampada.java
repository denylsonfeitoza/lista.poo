package questao33lampada;

public class Lampada {
    private boolean estadoDaLampada;
    private Contador contadorDeAcionamentos;
    
    public Lampada() {
        this.estadoDaLampada = false;
        this.contadorDeAcionamentos = new Contador();
    }
    
    public void acende() {
        if (!this.estadoDaLampada) {
            this.estadoDaLampada = true;
            this.contadorDeAcionamentos.incrementar();
        }
    }
    
    public void apaga() {
        if (this.estadoDaLampada) {
            this.estadoDaLampada = false;
        }
    }
    
    public void mostraEstado() {
        if (this.estadoDaLampada) {
            System.out.println("A lâmpada está acesa.");
        } else {
            System.out.println("A lâmpada está apagada.");
        }
    }
    
    public boolean estaLigada() {
        return this.estadoDaLampada;
    }
    
    public int getContadorDeAcionamentos() {
        return this.contadorDeAcionamentos.getValor();
    }
}

