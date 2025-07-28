public abstract class iPhone {
    private String modelo;
    private String numeroSerie;
    
    public iPhone(String modelo, String numeroSerie) {
        this.modelo = modelo;
        this.numeroSerie = numeroSerie;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public String getNumeroSerie() {
        return numeroSerie;
    }
}