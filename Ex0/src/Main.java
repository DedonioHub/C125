public class Main {

    public static void main(String[] args) {

        Cantina cantininha = new Cantina();

        cantininha.nome = "Cantininha";


        Salgado salgadinho1 = new Salgado();
        Salgado salgadinho2 = new Salgado();
        Salgado salgadinho3 = new Salgado();


        salgadinho1.nome = "bolinha de queijo";
        salgadinho2.nome = "coxinha";
        salgadinho3.nome = "kibe";



        cantininha.addSalgado(salgadinho1);
        cantininha.addSalgado(salgadinho2);
        cantininha.addSalgado(salgadinho3);

        cantininha.mostraInfo();


    }
}
