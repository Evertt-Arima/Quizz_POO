
package br.com.domain.pooquiz;


public class Questoes {
    private String questao;
    private String resposta;
    private String[] alternativas;

    public Questoes(String questao, String resposta, String[] alternativas) {
        this.questao = questao;
        this.resposta = resposta;
        this.alternativas = alternativas;
    }

    public String[] getAlternativas() {
        return alternativas;
    }

    public void setAlternativas(String[] alternativas) {
        this.alternativas = alternativas;
    }

    public String getQuestao() {
        return questao;
    }

    public void setQuestao(String questao) {
        this.questao = questao;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }
    
    
}
