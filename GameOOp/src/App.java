public class App {
    public static void main(String[] args) throws Exception {
        
        Personaggio bruiser = new Personaggio("bruiser", "spada", 100);
        Tank tank = new Tank("tank", "Scudo pesante", 100, true);

        bruiser.arma1();
        tank.arma1();
        }
}
