public class Cantina {

    String nome;
    Salgado[] salgados1 = new Salgado[3];
    
    void addSalgado(Salgado novoSalgado){

        for (int i = 0; i < salgados1.length; i++) {

            if(salgados1[i] == null)
            {
                salgados1[i] = novoSalgado;
                break;
            }

        }
    }

    void mostraInfo(){

        System.out.println("Nome da cantina " + nome);

        for (int i = 0; i < salgados1.length; i++) {
            System.out.println(salgados1[i].nome);
        }
    }
}
