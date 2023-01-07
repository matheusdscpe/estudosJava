package edu.estudos.tvSmart;

public class Usuario {
    public static void main(String[] args) {
        
        TvSmart tvSmart = new TvSmart();

        System.out.println("");
        System.out.println("Tv ligada ? " + tvSmart.ligada);
        System.out.println("Canal atual : " + tvSmart.canal);
        System.out.println("Volume atual : " + tvSmart.volume);
        System.out.println("");
        System.out.println("");

        tvSmart.ligar();
        System.out.println("Tv ligada ? " + tvSmart.ligada);

        tvSmart.escolherCanal(9);
        System.out.println("Canal atual : " + tvSmart.canal);
        
        tvSmart.aumentarVolume();
        System.out.println("Volume atual : " + tvSmart.volume);

    }
}
