
import javax.swing.SpringLayout;

public abstract class Veiculo {
    private String cor;
    private String marca;
    private String modelo;

    public Veiculo(String cor, String marca, String modelo) {
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
    }
    

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public void Mostra(){
        System.out.println(marca);
        System.out.println(modelo);
        System.out.println(cor);
    }
    
    
}
