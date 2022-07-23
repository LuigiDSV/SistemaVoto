import java.util.ArrayList;
import java.util.Scanner;

public class Gestora {
    Scanner read = new Scanner(System.in);

    //colocar try catch e tentar amenizar os erros

    int esc, esc1, contadorSim = 0, contadorNao = 0, contadorNulo = 0, contadorAbstencao = 0, controle1;

    Executora E = new Executora();
    Politico P = new Politico();
    

    ArrayList<Politico> CriaPolitico = new ArrayList<Politico>();
    ArrayList<String> EstadosRegiao = new ArrayList<String>();

    public void ProjetoLei() {
        // O PROJETO DE LEI NAO E APENAS 1, HEHE. MELHORAR ISSO

        // O sistema registra cada Projeto de Lei, incluindo o nome
        // do Projeto, a data de votação e se a lei passou
        // ou falhou (cujo domínio é sim e não) e o propoente
        // (congressista que propôs a lei).\
        System.out.println();
        System.out.println(" - - - - - PROJETO DE LEI A SER VOTADO - - - - -");
        System.out.println();
        System.out.println(
                "'Reajuste de preços de remédios e planos de saúde'\nO Congresso vai analisar a proposta que suspende o reajuste anual\nde 15,5% sobre os preços de medicamentos e dos planos e seguros privados\nde assistência à saúde");
        System.out.println();
    }

    public void PoliticoEstado() {
        Politico P = new Politico();
        EstadosRegiao.add("Parana (PR) - SUL");
        EstadosRegiao.add("Rio Grande do Sul (RS) - SUL");
        EstadosRegiao.add("Santa Catarina (SC) - SUL");
        EstadosRegiao.add("Amazonas (AM) - NORTE");
        EstadosRegiao.add("Roraima (RR) - NORTE");
        EstadosRegiao.add("Amapá (AP) - NORTE");
        EstadosRegiao.add("Pará (PA) - NORTE");
        EstadosRegiao.add("Tocantins (TO) - NORTE");
        EstadosRegiao.add("Rondônia (RO) - NORTE");
        EstadosRegiao.add("Acre (AC) - NORTE");
        EstadosRegiao.add("Mato Grosso (MT) - CENTRO OESTE");
        EstadosRegiao.add("Mato Grosso do Sul (MS) - CENTRO OESTE");
        EstadosRegiao.add("Goias (GO) - CENTRO OESTE");
        EstadosRegiao.add("Distrito Federal (DF) - CENTRO OESTE");
        EstadosRegiao.add("São Paulo (SP) - SUDESTE");
        EstadosRegiao.add("Rio de Janeiro (RJ) - SUDESTE");
        EstadosRegiao.add("Espírito Santo (ES) - SUDESTE");
        EstadosRegiao.add("Minas Gerais (MG) - SUDESTE");
        EstadosRegiao.add("Maranhão (MA) - NORDESTE");
        EstadosRegiao.add("Piauí (PI) - NORDESTE");
        EstadosRegiao.add("Ceará (CE) - NORDESTE");
        EstadosRegiao.add("Rio Grande do Norte (RN) - NORDESTE");
        EstadosRegiao.add("Pernambuco (PE) - NORDESTE");
        EstadosRegiao.add("Paraíba (PB) - NORDESTE");
        EstadosRegiao.add("Sergipe (SE) - NORDESTE");
        EstadosRegiao.add("Alagoas (AL) - NORDESTE");
        EstadosRegiao.add("Bahia (BA) - NORDESTE");

        System.out.println("Qual e o seu nome, sr. congressista? ");
        P.setNomePolitico(read.next());
        // definindo nome
        for (int i = 0; i < EstadosRegiao.size(); i++) {
            System.out.println("(" + (i + 1) + ")" + EstadosRegiao.get(i));
        }
        System.out.println("Qual o estado que voce representa? ");
        P.setEstadoRe(read.next());
        // definindo estado e regiao
        System.out.println("Em que data voce foi eleito? ");
        P.setDataEleicao(read.next());
        // definindo data de eleicao
        System.out.println("Qual o seu partido? ");
        P.setPartido(read.next());
        // definindo partido
        System.out.println("Para o Projeto de Lei apresentado acima, qual sera o seu voto? ");
        System.out.println("1 - SIM\n2 - NAO\n3 - NULO\n4 - ABSTER-SE");
        esc = read.nextInt();
        if (esc == 1) {
            System.out.println("Ok. Voto guardado com sucesso.");
            P.setSim(contadorSim + 1);
        } else if (esc == 2) {
            System.out.println("Ok. Voto guardado com sucesso.");
            P.setNao(contadorNao + 1);
        } else if (esc == 3) {
            System.out.println("Ok. Voto guardado com sucesso.");
            P.setNulo(contadorNulo + 1);
        } else if (esc == 4) {
            System.out.println("Ok. Opcao guardada com sucesso.");
            P.setAbstencao(contadorAbstencao + 1);
        } else {
            System.out.println("*ERROR*");
        }
        CriaPolitico.add(P);
    }

    public void MostraPolitico() {
        for (int i = 0; i < CriaPolitico.size(); i++) {
            System.out.println("------------------------------------------------------");
            System.out.println(
                    "Nome: " + CriaPolitico.get(i).getNomePolitico()
                            + "   \nEstado: " + CriaPolitico.get(i).getEstadoRe()
                            + "   \nData: " + CriaPolitico.get(i).getDataEleicao()
                            + "   \nPartido: " + CriaPolitico.get(i).getPartido()
                            + "   \nSim: " + CriaPolitico.get(i).getSim()
                            + "   \nNao: " + CriaPolitico.get(i).getNao()
                            + "   \nNulo: " + CriaPolitico.get(i).getNulo()
                            + "   \nAbstencao:" + CriaPolitico.get(i).getAbstencao());
            System.out.println("------------------------------------------------------");
        }
    }

// posso usar arraylist para guardar esses dados
// solicitar o nome do politico, a regiao dele e solicitar e o voto para
// determinado PL
}
// deixar no inico qual o projeto e depois ir solicitando'
// ao usuario o preenchimento do estado, congressista,
// votacao e por fim o resultado da votacao

// O sistema também
// registra como cada congressista votou em cada lei
// (cujo domínio é sim, não, abstenção e nulo).

// Criar um sistema para registrar informações sobre
// votos realizados no Congresso nacional durante as
// sessões.

// O sistema precisa registrar cada nome de
// estado do Brasil e incluir a região do estado
// (cujo domínio é Norte, Nordeste, Centro-Oeste,
// Sudeste e Sul).

// Cada congressista é descrito
// por seu nome, mais o estado representado, a
// data de início em que foi eleito e o partido
// político ao qual ele ou ela pertence.

// O PROJETO DE LEI NAO E APENAS 1, HEHE. MELHORAR ISSO

// O sistema registra cada Projeto de Lei, incluindo o nome
// do Projeto, a data de votação e se a lei passou
// ou falhou (cujo domínio é sim e não) e o propoente
// (congressista que propôs a lei).\
