import java.util.Scanner;

public class Executora {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Gestora G = new Gestora(); // porque ele me pediu o STATIC
        Politico P = new Politico();

        while (G.controle1 == 0) {
            G.ProjetoLei();
            G.PoliticoEstado();
            System.out.println("Há mais um congressista para votar (1) - SIM (2) - NAO ? ");
            G.controle1 = read.nextInt();
            System.out.println(G.controle1);
            if (G.controle1 == 2) {
                G.MostraPolitico();
            }
        }
    }
}
