public class NavegadorInternet extends iPhone {
    public NavegadorInternet(String modelo, String numeroSerie) {
        super(modelo, numeroSerie);
    }
    
    public void exibirPagina(String url) {
        System.out.println("Exibindo página " + url + " no " + getModelo());
    }
    
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada no " + getModelo());
    }
    
    public void atualizarPagina() {
        System.out.println("Página atualizada no " + getModelo());
    }
}