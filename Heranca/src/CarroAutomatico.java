public class CarroAutomatico extends Carro {
    private boolean freioPressionado;

    public  CarroAutomatico(int velmax){
        super(velmax);
        this.freioPressionado = false;
    }
    public void pressionarFreio(){
        freioPressionado = true;
        System.out.println("Freio Pressionado.");
    }

    @Override

    public void ligar(){
        if (freioPressionado){
            super.ligar();
            System.out.println("Carro Automatico Ligado");
        } else {
            System.out.println("Não é possivel ligar o carro. Pressione o freio");
        }
    }

}
