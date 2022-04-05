public class Impostor extends Astronauta implements Missao,Sabotar,Executar{

    private int qtdMortes;

    public Impostor(String cor, String nome, Skin skin, Pet pet, int qtdMortes) {
        super(cor, nome, skin, pet);
        this.qtdMortes = qtdMortes;
    }

    @Override
    public void mostraInfo(){
        System.out.println("Tipo astronauta: Impostor");
        System.out.println("Quantidade de mortes: " + qtdMortes);
        super.mostraInfo();
    }
    @Override
    public void verCameras(){
        System.out.println("O impostor está vendo as cameras.");
    }
    @Override
    public void reportar(){
        System.out.println("O impostor está reportando.");
    }
    @Override
    public void reparar(){
        System.out.println("O impostor está reparando.");
    }

    public void usarVentoinhas(){
        System.out.println("O impostor está usando as ventoinhas.");
    }
    public void trancarPortas(String local){
        System.out.println("O impostor trancou as portas do " + local);
    }

    public void fazerMissao(){
        System.out.println("O impostor faz missão.");
    }
    public void sabotarLuz(){
        System.out.println("O impostor faz missão.");
    }
    public void sabotarOxigenio(){
        System.out.println("O impostor sabota o oxigenio.");
    }
    public void sabotarReator(){
        System.out.println("O impostor sabota o reator.");
    }
    public void sabotarComunicacao(){
        System.out.println("O impostor sabota a comunicação.");
    }
    public void executar(){
        System.out.println("O impostor executou uma morte.");
    }
}
