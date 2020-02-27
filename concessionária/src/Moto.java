public class Moto extends Veiculo{
    
    private int cilindradas;   

    public Moto(int cilindradas, String cor, String marca, String modelo) {
        super(cor, marca, modelo);
        this.cilindradas = cilindradas;
    }
    

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
    public void Mostra(){
        super.Mostra();
        System.out.println(cilindradas);

        
    }
    
}
