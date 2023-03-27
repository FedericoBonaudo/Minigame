public class Tank extends Personaggio{
    public boolean armatura;
    public int vita;

    public Tank(String nome, String arma, int vita, boolean armatura) {
        super(nome, arma, vita);
        this.armatura = armatura;
        this.vita = vita;
    }

    int contatore = 0;
    int cure = 2;

    public void pozione(){
        if(cure == 0){
            System.out.println("Non hai più pozioni!");
        } else {
            this.vita += 50;
            System.out.println("La tua vita sale a " + this.vita);
            cure --;
        }
    }


    public void masso(){
        if(contatore >= 4){
            this.vita -= 60;
            this.armatura = false;
            System.out.println("Dopo aver raccolte tutte le energie scagli un masso addosso al nemico e gli togli 60 pt" + " Ora la sua vita è " + this.vita);
        }
    }

    @Override
    public void arma1() {
        if(armatura){
            this.vita -= 20;
            contatore++;
            if(this.vita <= 0){
                this.vita = 0;
            } else {
                System.out.println("L'armatura ha attutito il colpo dell'arma. La vita restante è " + this.vita);
            }
        }
        if(!armatura){
            this.vita -= 30;
            contatore++;
            if(this.vita <= 0){
                this.vita = 0;
            } else {
                System.out.println("L'armatura non ha attutito il colpo dell'arma. La vita restante è " + this.vita);
            }
        }
        if(this.vita == 0){
            System.out.println(getNome() + " è morto!");
        }
    }



    

    
}
