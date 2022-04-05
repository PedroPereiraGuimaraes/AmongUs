public class Tripulante extends Astronauta implements Missao{

    private int qtdMissoes;

    public Tripulante(String cor, String nome, Skin skin, Pet pet, int qtdMissoes) {
        super(cor, nome, skin, pet);
        this.qtdMissoes = qtdMissoes;
    }
    @Override
    public void mostraInfo(){
        System.out.println("Tipo astronauta: Tripulante");
        System.out.println("Quantidade de missões: " + qtdMissoes);
        super.mostraInfo();
    }
    @Override
    public void verCameras(){
        System.out.println("O tripulante está vendo as cameras.");
    }
    @Override
    public void reportar(){
        System.out.println("O tripulante está reportando.");
    }
    @Override
    public void reparar(){
        System.out.println("O tripulante está reparando.");
    }
    public void fazerMissao(){
        System.out.println("O tripulante faz missão.");
    }
}
