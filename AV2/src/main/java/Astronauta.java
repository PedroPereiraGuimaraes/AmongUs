public class Astronauta {

    public static int cont=0;
    private String cor;
    private String nome;
    public Skin skin;
    public Pet pet;

    public Astronauta(String cor, String nome, Skin skin, Pet pet) {
        this.cor = cor;
        this.nome = nome;
        this.skin = skin;
        this.pet = pet;
        cont ++;
    }

    public void mostraInfo(){
        System.out.println("Cor: " + this.cor);
        System.out.println("Nome: " + this.nome);
        System.out.println("Skin: " + this.skin.getTipo());
        System.out.println("Pet: " + this.pet.getNome());
    }

    public void verCameras(){
        System.out.println(this.nome + " está vendo as cameras.");
    }
    public void reportar(){
        System.out.println(this.nome + " está reportando.");
    }
    public void reparar(){
        System.out.println(this.nome + " está reparando.");
    }
}
