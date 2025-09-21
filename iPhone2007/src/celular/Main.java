package celular;

interface ReprodutorMusical {
 void tocar();
 void pausar();
 void selecionarMusica(String musica);
}

interface AparelhoTelefonico {
 void ligar(String numero);
 void atender();
 void iniciarCorreioVoz();
}

interface NavegadorInternet {
 void exibirPagina(String url);
 void adicionarNovaAba();
 void atualizarPagina();
}

//Classe iPhone implementando as interfaces
class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

 @Override
 public void tocar() {
     System.out.println("Reproduzindo música...");
 }

 @Override
 public void pausar() {
     System.out.println("Música pausada.");
 }

 @Override
 public void selecionarMusica(String musica) {
     System.out.println("Selecionando a música: " + musica);
 }

 @Override
 public void ligar(String numero) {
     System.out.println("Ligando para: " + numero);
 }

 @Override
 public void atender() {
     System.out.println("Atendendo chamada...");
 }

 @Override
 public void iniciarCorreioVoz() {
     System.out.println("Iniciando correio de voz...");
 }

 @Override
 public void exibirPagina(String url) {
     System.out.println("Exibindo página: " + url);
 }

 @Override
 public void adicionarNovaAba() {
     System.out.println("Abrindo uma nova aba no navegador.");
 }

 @Override
 public void atualizarPagina() {
     System.out.println("Atualizando a página.");
 }
}

public class Main {
 public static void main(String[] args) {
     iPhone meuIphone = new iPhone();

     meuIphone.tocar();
     meuIphone.selecionarMusica("Lugar Secreto - Gabriela Rocha");
     meuIphone.pausar();

     meuIphone.ligar("+55 11 98765-4321");
     meuIphone.atender();
     meuIphone.iniciarCorreioVoz();

     meuIphone.exibirPagina("https://www.apple.com");
     meuIphone.adicionarNovaAba();
     meuIphone.atualizarPagina();
 }
}