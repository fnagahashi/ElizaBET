import java.util.ArrayList;

public class Competicao {
    ArrayList<Aposta> apostas;
    public Competicao() {
        apostas = new ArrayList<>();
    }
    private int hora;
    private int minuto;

    int getHora() {
        return hora;
    }

    int getMinuto() {
        return minuto;
    }

    void AdicionarAposta(Aposta aposta) {
        apostas.add(aposta);
    }

    double ValorPremio(double valor) {
        double premio = 0.0;
        for (int i = 0; i < apostas.size(); i++) {
            premio = premio + apostas.get(i).getValorAposta();
        }
        return premio;
    }

    boolean ApostaGanhadora(int hora, int minuto, double ValorPremio) {
        int ganhadores;
        ganhadores = 0;
        for (int i = 0; i < apostas.size(); i++) {
            ganhadores++;

        }
        if (ganhadores > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static String QuemGanhou(int ganhadores, double ValorPremio) {
        if (ganhadores == 1) {
            String Umganhador = "Apenas um participante acertou o horário.";
            return Umganhador;
        } else if (ganhadores > 1) {
            ValorPremio = ValorPremio / ganhadores;
            String Maisganhadores = "Houve mais de um ganhador e o valor do prêmio é: " + ValorPremio + " reais para cada";
            return Maisganhadores;
        }
        String NaoHouveGanhadores = "Não houve ganhadores";
        return NaoHouveGanhadores;
    }

    void DefinirHorarioCerto(int hora, int minuto) {
        this.hora = hora;
        this.minuto = minuto;
    }
}