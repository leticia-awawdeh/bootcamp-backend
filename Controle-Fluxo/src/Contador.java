import java.util.Scanner;

class ParametrosInvalidosException extends Exception{

    public ParametrosInvalidosException(String string) {
    }

}


    public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numeroUm = terminal.nextInt();

        System.out.print("Digite outro número: ");
        int numeroDois = terminal.nextInt();

        try{
            contar(numeroUm, numeroDois);

        }catch( ParametrosInvalidosException e ){
            System.out.println("Erro, O segundo parâmetro deve ser maior que o primeiro: " + e.getMessage());
        } finally {
            terminal.close();
        }

    }
    static void contar (int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException("O primeiro número deve ser menor que o segundo");
        }
        int contagem = parametroDois - parametroUm;
        for(int i = 0; i <= contagem; i++){
            System.out.println(parametroUm + i);
        }
    }
}

