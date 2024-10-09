public class Jogador {
    public int vitorias;
    public int derrotas;
    public String rank;

    public Jogador(int vitorias, int derrotas) {
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        calculadoraRank();
    }

    public void calculadoraRank(){

        int saldo = vitorias - derrotas;

        if (saldo < 10) {
            rank = "Ferro";
        } else if (vitorias >= 11 && vitorias <= 20) {
            rank = "Bronze";
        } else if (vitorias >= 21 && vitorias <= 50) {
            rank = "Prata";
        } else if (vitorias >= 51 && vitorias <= 80) {
            rank = "Ouro";
        } else if (vitorias >= 81 && vitorias <= 90) {
            rank = "Diamante";
        } else if (vitorias >= 91 && vitorias <= 100) {
            rank = "Lendário";
        } else {
            rank = "Imortal";
        }



        System.out.println("O Herói tem de saldo de " + saldo + " vitórias e está no nível de " + rank + ".");
    };
}
