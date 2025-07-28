public class App {
    public class Main {
    public static void main(String[] args) {
        ReprodutorMusical reprodutor = new ReprodutorMusical("iPhone 15", "MUS123");
        AparelhoTelefonico telefone = new AparelhoTelefonico("iPhone 15", "TEL456");
        NavegadorInternet navegador = new NavegadorInternet("iPhone 15", "NAV789");
        
        // Testando funcionalidades
        reprodutor.tocar();
        reprodutor.pausar();
        reprodutor.selecionarMusica("Bohemian Rhapsody");
        
        telefone.ligar("11987654321");
        telefone.atender();
        telefone.iniciarCorreioVoz();
        
        navegador.exibirPagina("https://www.google.com");
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();
    }
}
}
