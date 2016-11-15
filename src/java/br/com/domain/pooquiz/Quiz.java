
package br.com.domain.pooquiz;

import java.util.ArrayList;


public class Quiz {
    private static int contador = 0;
    private static double soma = 0.0;
    private static double nota = 0.0;
    private static ArrayList<Questoes> teste;
    
    public static ArrayList<Questoes> getTeste() {
        if (teste == null) {
            teste = new ArrayList<>();
            Questoes q1 = new Questoes(
                    "Qual o nome dado aos monumentos de pedra encontrados na "
                            + "Ilha de Páscoa, representando rostos humanos?",
                    "Moais", new String[]{"Dólmens","Toltecas","Olmecas","Moais","Menires"});
            teste.add(q1);
            Questoes q2 = new Questoes(
                    "Qual o nome dado à estátua antiga, composta de um corpo de"
                            + " leão e uma cabeça humana, situada ao norte do "
                            + "Egito, no planalto de Gizé?", "Esfinge",
                    new String[]{"Fênix","Oráculo de Delfos","Sátiro","Esfinge","Pégasus"});
            teste.add(q2);
            Questoes q3 = new Questoes(
                    "Antiga construção, formada de círculos concêntricos de pedras"
                            + " que chegam a pesar 50 toneladas, onde acredita-se"
                            + "ser sido construída para rituais religiosos.", "Stonehenge",
                    new String[]{"Pedra de Ingá na Paraíba, Brasil",
                        "Pedras guia da Geórgia, EUA","Stonehead","Pedras de Callanish, "
                                + "Inglaterra", "Stonehenge"});
            teste.add(q3);
            Questoes q4 = new Questoes(
                    "Única construção feita pelo homem que restou das Sete Maravilhas "
                            + "do Mundo Antigo.", "Pirâmides de Gizé", new String[]{"Pirãmides de Gizé"
                            + "","Muralhas da China","Torre Eiffel","Jardins sus"
                                    + "pensos da Babilônia","Torre de Babel"});
            teste.add(q4);
            Questoes q5 = new Questoes(
                    "Bloco de granito encontrado no Egito, que contém a chave"
                            + " para a decodificação e compreensão dos hieróglifos "
                            + "egípcios.", "Pedra de Roseta", new String[]{"Ro"
                            + "chedo de Gibraltar","Pedra de Roseta","Pedra Negra de Caaba","Rocha"
                                    + " de Ayer ou Uluru","Menires de Carnac"});
            teste.add(q5);
            Questoes q6 = new Questoes(
                    "Esse templo foi originalmente construído com o intuito de "
                            + "prestar homenágens aos diversos deuses da Era Romana."
                            + "", "Pantheon", new String[]{"Templo de Delfos"
                            + "","Templo de Apolo","Pantheon","Parthenon","Acrópole de Aten"
                                    + "as"});
            teste.add(q6);
            Questoes q7 = new Questoes(
                    "Um dos itens está em desacordo com os demais do grupos", "Tem"
                            + "plo de Carnac ou Karnak", new String[]{"Templo de"
                            + " Carnac ou Karnak","Muralha de Berlim","Muralha d"
                                    + "a China","Arco do Triunfo","Monumento à W"
                                            + "ashignton"});
            teste.add(q7);
            Questoes q8 = new Questoes(
                    "Uma das maiores maravilhas do mundo antígo visível, o Zigurate de UR,"
                            + " uma torre piramidal, semelhante a Babel, se encontra em que"
                            + " país?", "Iraque", new String[]{"Turquia","Irã","Egit"
                            + "o","Jordânia", "Iraque"});
            teste.add(q8);
            Questoes q9 = new Questoes(
                    "Uma das opções abaico está em desacordo com as demais.", "Tor"
                            + "re de Pisa", new String[]{"Templ"
                            + "o de Ramsés","Torre de Pisa","Templo de Dandara","Abu Simbel","Te"
                                    + "mplo de Ábidos"});
            teste.add(q9);
            Questoes q10 = new Questoes(
                    "O deus grego Zeus está para Júpiter tal qual Atena está para:", 
                    "Minerva", new String[]{"Vênus","Saturno","Diana", "Minerva"});
            teste.add(q10);
            
        }
        return teste;
    }
    
    public static double validarTeste(String respostaDoUsuario[]){
        int contador = 0;
        
        for(int i = 0; i < teste.size(); i++){
            if (teste.get(i).getResposta().equals(respostaDoUsuario[i])) {
                contador++;
            }
        }
        
        double nota = (double)contador / (double)teste.size();
        Quiz.nota = nota;
        Quiz.soma += nota;
        Quiz.contador++;
        
        return nota;
    }
    
    public static double getNota(){
        return Quiz.nota;
    }
    
    public static double getMédia(){
        return Quiz.soma / (double)Quiz.contador;        
    }    
}
 