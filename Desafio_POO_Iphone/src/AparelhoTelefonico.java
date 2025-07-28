public class AparelhoTelefonico extends iPhone {
    public AparelhoTelefonico(String modelo, String numeroSerie) {
        super(modelo, numeroSerie);
    }
    
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero + " do " + getModelo());
    }
    
    public void atender() {
        System.out.println("Atendendo chamada no " + getModelo());
    }
    
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz no " + getModelo());
    }
}