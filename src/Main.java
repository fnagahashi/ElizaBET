//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Competicao competicao = new Competicao();
        competicao.AdicionarAposta(new Aposta("João", 12, 30, 10));
        competicao.AdicionarAposta(new Aposta("Maria", 10, 05, 15));
        competicao.AdicionarAposta(new Aposta("José", 17, 15, 5));
        competicao.AdicionarAposta(new Aposta("Ana", 8 ,45 , 10));
        competicao.AdicionarAposta(new Aposta("Pedro", 12, 30, 20));
        competicao.DefinirHorarioCerto(12, 30);
        competicao.ValorPremio(60);
        competicao.ApostaGanhadora(12, 30, 60);
        System.out.printf(competicao.QuemGanhou(2,60));

    }
}