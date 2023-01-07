package edu.estudos.tvSmart;

public class TvSmart {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        ligada = true;
    }
    public void desligar() {
        ligada = false;
    }

    public void aumentarCanal() {
        canal++;
    }
    public void deminuirCanal() {
        canal--;
    }
    public void escolherCanal(int novoCanal) {
        canal = novoCanal;
    }

    public void aumentarVolume() {
        volume++;
    }
    public void diminuirVolume() {
        volume--;
    }
}

//ligar/desligar
//aumentar volume/diminuir volume
//aumentar canal/diminuir canal
//escolher canal