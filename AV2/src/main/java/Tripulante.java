public class Tripulante extends Astronauta implements Missao{

    private int qtdMissoes;

    public Tripulante(String cor, String nome, Skin skin, Pet pet, int qtdMissoes) {
        super(cor, nome, skin, pet);
        this.qtdMissoes = qtdMissoes;
    }

    public void fazerMissao(){
        System.out.println("O tripulante faz missão.");
    }
}
