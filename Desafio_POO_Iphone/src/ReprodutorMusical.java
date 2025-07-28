public class ReprodutorMusical extends iPhone {
    public ReprodutorMusical(String modelo, String numeroSerie) {
        super(modelo, numeroSerie);
    }
    
    public void tocar() {
        System.out.println("Tocando música no " + getModelo());
    }
    
    public void pausar() {
        System.out.println("Música pausada no " + getModelo());
    }
    
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica + " no " + getModelo());
    }
}