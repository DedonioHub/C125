public class Main {


    public static void main(String[] args) {

        Kart kart1 = new Kart();
        Kart kart2 = new Kart();

        // instanciando kart do mario
        kart1.nome = "Kart do Mario";
        kart1.motor.velocidadeMaxima = 100.70f;
        kart1.motor.cilindradas = "Trinta Cilindradas";

        //instanciando kart do bowser
        kart2.nome = "Kart do Bowser";
        kart2.motor.velocidadeMaxima = 150.80f;
        kart2.motor.cilindradas = "Quarenta Cilindradas";

        //piloto tem que ser criado na main pois ele existe sem o kart
        //piloto é uma agregação do kart

        Piloto piloto1 = new Piloto();
        Piloto piloto2 = new Piloto();

        //instanciando piloto mario
        piloto1.nome = "Mario";
        piloto1.vilao = false;

        //instaciando piloto bowser

        piloto2.nome = "Bowser";
        piloto2.vilao = true;



        //mostrando informações do motor do kart
        //como o motor é uma composição(kart nao existe sem motor) não precisamos
        //declarar ele na main. podemos simplemente puxar ele da classe kart
        kart1.motor.mostraInfo();
        kart2.motor.mostraInfo();

        kart1.soltaTurbo();
        kart2.soltaTurbo();

        piloto1.soltaSuperPoder();
        piloto2.soltaSuperPoder();

        kart1.pular();
        kart2.fazerDrift();


        kart1.fazerDrift();
        kart2.fazerDrift();



    }



}
