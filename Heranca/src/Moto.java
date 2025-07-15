public abstract class Moto extends Automovel {

    public Moto(int velmax){
        super(2,velmax);
    }
    @Override

    public void Ligar(){
        super.Ligar();
        System.out.println("Moto Ligada.");
    }

    public abstract void ligar();
}
