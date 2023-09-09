package candidatura;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
            
        }
    static void imprimirSelecionados(){
        String [] candidatos = {"João", "Maria", "Elisa"}; 
        System.out.println("lista de candidatos informando o indice do elemento");
        
        for(int ind = 0; ind < candidatos.length; ind++){
            System.out.println("Candidato: " + candidatos[ind] + " indice: " + (ind+1));
        }
        System.out.println("forma abreviada de interação for each");
        for(String candidato : candidatos){
            System.out.println("Candidato selecionado: " + candidato);
        }
    }

    static void selecaoCandidatos(){
        String [] candidatos = {"João", "Maria", "José", "Ana", "Pedro", "Elisa"};
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 3 && candidatosAtual < candidatos.length){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " pretende ganhar " + salarioPretendido);
        if(salarioBase >= salarioPretendido){
            System.out.println("A pessoa " + candidato + " foi aprovado(a)");
            candidatosSelecionados++;
        
            //System.out.println("Analisando candidato: " + candidatos[candidatosAtual]);
           // double salarioPretendido = salarioBase - (salarioBase * (candidatosAtual * 0.1));
           // analisarCandidato(salarioPretendido);
           // candidatosAtual++;
        }
        candidatosAtual++;
     }

    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1000.0, 5000.0);
        
    }
    static void analisarCandidato(double salarioPretendido){
        
         double salarioBase = 1500.00;

        if(salarioPretendido < salarioBase){
            System.out.println("Candidato aprovado");

        }else if (salarioBase == salarioPretendido)
            System.out.println("Enviando contraproposta para o candidato");
        else {
            System.out.println("Candidato reprovado e encaminhado para o banco de talentos");
        }
    }
}