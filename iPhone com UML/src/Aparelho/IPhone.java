package Aparelho;
import java.util.Scanner;

import Interfaces.AparelhoTelefonico;
import Interfaces.NavegadorInternet;
import Interfaces.ReprodutorMusical;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String[] playlist = {"Titico no Fubaco", "Musica2", "Musica3", "Baleia Azul"};
    private String musicaAtual = "Nenhuma música selecionada";

    private void atualizandoMusicaAtual(){
        System.out.println("Músicas disponíveis:");

        // Lista de músicas
        for (int x=0; x<playlist.length; x++) {
            System.out.println(x+1 + " - " + playlist[x]);
        }

        // Pegando o input
        Scanner read = new Scanner(System.in);
        System.out.printf("Digite o número da música pretendida: ");
        int musicaEscolhida = read.nextInt();

        // Setando música atual
        musicaAtual = playlist[musicaEscolhida-1];
    }

    // Reprodutor Musical
    public void tocar(){
        System.out.println("Tocando musica \"" + musicaAtual + "\"");
    }
    public void pausar(){
        System.out.println("Pausando música \"" + musicaAtual + "\"");
    }
    public void selecionarMusica(){
        atualizandoMusicaAtual();
    }

    // Aparelho Telefônico
    public void ligar(String numero){
        System.out.println("Ligando para \"" + numero + "\"");
    }
    public void atender(){
        System.out.println("Atendendo ligação...");
    }
    public void iniciarCorreioVoz(){
        System.out.println("Ouvindo Correio de voz...");
    }

    // Navegador de internet
    public void exibirPagina(String url){
        System.out.println("Acessando o endereço \"" + url + "\"");
    }
    public void adicionarNovaAba(){
        System.out.println("Abrindo nova aba...");
    }
    public void atualizarPagina(){
        System.out.println("Atualizando página atual...");
    }
}
