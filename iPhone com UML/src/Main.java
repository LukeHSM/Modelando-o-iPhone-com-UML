import Aparelho.IPhone;

public class Main {
    public static void main(String[] args) throws Exception {
        IPhone smart = new IPhone();
        smart.selecionarMusica();
        smart.tocar();
        smart.pausar();
        smart.ligar("+5532666");
        smart.exibirPagina("https://translate.google.com.br/");
    }
}
