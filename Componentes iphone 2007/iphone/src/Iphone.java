public class Iphone {
    public static void main(String[] args) {

      
    }
    class iPhone implements ReprodutorM, ApTel, NavegInt {


    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    @Override
    public void atender(String numero) {
        System.out.println("Atendender?");
    }

    @Override
    public void iniciarCorreioVoz(String mensagem, String destinatario) {
        System.out.println("Iniciando correio de voz para " + destinatario);
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página " + url);
    }

    @Override
    public void adicionarNovaAba(String url) {
       System.out.println("Adicionando nova aba com página " + url);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música");
    }
}
}
