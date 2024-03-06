public class Aposta {
    private String nomeApostador;
    private int palpiteHora;
    private int palpiteMinuto;
    private double valorAposta;

    int getPalpiteHora(){
        return palpiteHora;
    }

    int getPalpiteMinuto(){
        return palpiteMinuto;
    }

    String getNomeApostador(){
        return nomeApostador;
    }

    double getValorAposta(){
        return valorAposta;
    }

    Aposta(String nomeApostador, int palpiteHora, int palpiteMinuto, double valorAposta){
        this.nomeApostador = nomeApostador;
        this.palpiteHora = palpiteHora;
        this.palpiteMinuto = palpiteMinuto;
        this.valorAposta = valorAposta;
    }


}
