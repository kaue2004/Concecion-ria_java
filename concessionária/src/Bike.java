public class Bike extends Veiculo{
    
    private int tamanho;

    public Bike(int tamanho, String cor, String marca, String modelo) {
        super(cor, marca, modelo);
        this.tamanho = tamanho;
    }
    
    

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    public void Mostra(){
        super.Mostra();
        System.out.println(tamanho);

        
    }
    
    
}
