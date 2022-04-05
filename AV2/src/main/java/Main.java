public class Main {

    public static void main(String[] args) {

        Skin skin = new Skin("Chapeu");
        Skin skin1 = new Skin("Boné");

        Pet pet = new Pet("Cachorro");
        Pet pet1 = new Pet("Gato");

        Tripulante tripulante = new  Tripulante("Preto","Um", skin, pet, 10);
        Impostor impostor = new Impostor("Azul", "Dois", skin1, pet1,2);

        Astronauta[] astronautas = new Astronauta[10];

        astronautas[0] = tripulante;
        astronautas[1] = impostor;

        for (Astronauta astronauta: astronautas) {
            if (astronauta != null){
                astronauta.mostraInfo();
                astronauta.verCameras();
                astronauta.reparar();
                astronauta.reportar();
                System.out.println("\n");
            }
        }
    }
}
