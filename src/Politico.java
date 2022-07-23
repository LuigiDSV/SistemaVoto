
public class Politico {
    private String nomePolitico, dataEleicao, partido, estadoRe;
    private int nao, abstencao, nulo, sim;

    public String getNomePolitico() {
        return nomePolitico;
    }

    public void setNomePolitico(String nomePolitico) {
        this.nomePolitico = nomePolitico;
    }

    public String getDataEleicao() {
        return dataEleicao;
    }

    public void setDataEleicao(String dataEleicao) {
        this.dataEleicao = dataEleicao;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public String getEstadoRe() {
        return estadoRe;
    }

    public void setEstadoRe(String estadoRe) {
        this.estadoRe = estadoRe;
    }

    public int getNao() {
        return nao;
    }

    public void setNao(int nao) {
        this.nao = nao;
    }

    public int getAbstencao() {
        return abstencao;
    }

    public void setAbstencao(int abstencao) {
        this.abstencao = abstencao;
    }

    public int getNulo() {
        return nulo;
    }

    public void setNulo(int nulo) {
        this.nulo = nulo;
    }

    public int getSim() {
        return sim;
    }

    public void setSim(int sim) {
        this.sim = sim;
    }
    
}
//deixar no inico qual o projeto e depois ir solicitando'
//ao usuario o preenchimento do estado, congressista, da 
//votacao por e por fim o resultado da votacao

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

// O sistema registra cada Projeto de Lei, incluindo o nome
// do Projeto, a data de votação e se a lei passou
// ou falhou (cujo domínio é sim e não) e o propoente
// (congressista que propôs a lei).\
