public class Kart {

    String nome;
    Motor motor;
    Piloto piloto;


    //para chamarmos o motor atravez do kart na main precisamos criar esse construtor
    public Kart(){
        motor = new Motor();
    }

    void pular(){
        System.out.println("iupi");
    }

    void soltaTurbo(){
        System.out.println("vruummmmm");

    }

    void fazerDrift(){
        System.out.println("RRRRRRRR");

    }

}
