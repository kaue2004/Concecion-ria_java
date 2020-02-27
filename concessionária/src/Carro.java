public class Carro extends Veiculo{
    
    private int portas;
    private String cambio;

    public Carro(int portas, String cambio, String cor, String marca, String modelo) {
        super(cor, marca, modelo);
        this.portas = portas;
        this.cambio = cambio;
    }
    
    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public String getCambio() {
        return cambio;
    }

    public void setCambio(String cambio) {
        this.cambio = cambio;
    }
    public void Mostra(){
        super.Mostra();
        System.out.println(cambio);
        System.out.println(portas);
        
    }
    
    
}
