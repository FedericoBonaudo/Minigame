public class Personaggio {

    public String nome;
    public String arma;
    public int vita;

    public Personaggio(String nome, String arma, int vita){
        this.nome = nome;
        this.arma = arma;
        this.vita = vita;
    }

    int contatore = 0;
    int curaSpeciale = 1;

    public void cura(){
        if(curaSpeciale <= 0){
            System.out.println("Non hai più cure!");
        } else {
            this.vita += 80;
            System.out.println("Ti curi e la tua vita sale a " + this.vita);
        }
    }

    public void arma1(){
        contatore++;
        this.vita -= 20;
        if(this.vita <= 0){
            System.out.println(getNome() + " è morto!");
        } else {
            System.out.println("il bruiser infliggei 30 danni. Ora la vita rimanente è: " + this.vita);
        }
    }

    public void arma2(){
        if(contatore >= 3){
            this.vita -= 50;
            System.out.println(contatore);
        } else {
            System.out.println("Non puoi attaccare con quest'arma");
        }
        
        if(this.vita <= 0){
            System.out.println(getNome() + " è morto!");
        } else {
            System.out.println("il bruiser infligge 50 danni. Ora la vita rimanente è: " + this.vita);
        }
    }

    public void parata() {
        double scanso = Math.random()*10;
        if(scanso >= 0 && scanso <= 3){
            this.vita -= 10;
            System.out.println("Hai schivato ma un colpo ti raggiuge, perdi 10 punti vita" + "Ora la tua vita è " + this.vita);
        } else {
            System.out.println("Schivi con agilità il colpo e non perdi vita");
        }
    }

    public void critical() {
        double crit = Math.random()*10;
        if(crit >= 7){
            this.vita -= 10;
            System.out.println("Il colpo critico infigge 10 danni in più. La vita rimanente è " + this.vita);
        } else {
            System.out.println("niente critico");
        }
    }

    public String getNome() {
        return nome;
    }

    public String getArma() {
        return arma;
    }

    public int getVita() {
        return vita;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public void setVita(int vita) {
        this.vita = vita;
    }

}


