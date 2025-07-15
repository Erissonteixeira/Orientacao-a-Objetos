public class MotoPartidaPedal extends Moto {

    private boolean aceleradorPuxado;

    public MotoPartidaPedal(int velmax){
        super(velmax);
        this.aceleradorPuxado = false;
    }

    public void puxarAcelerador(){
        aceleradorPuxado = true;
        System.out.println("Acelerador Puxado");
    }



    public void ligar(){
        if (aceleradorPuxado){
            super.Ligar();
            System.out.println("Moto com partida no pedal ligada.");
        }else{
            System.out.println("Puxe o acelerador para ligar a moto");
        }
    }
}
