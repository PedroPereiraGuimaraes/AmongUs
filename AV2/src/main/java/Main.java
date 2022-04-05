public class Main {

    public static void main(String[] args) {

        Skin skin = new Skin("Chapeu");
        Skin skin1 = new Skin("Boné");

        Pet pet = new Pet("Cachorro");
        Pet pet1 = new Pet("Gato");

        Tripulante tripulante = new Tripulante("Preto", "Um", skin, pet, 10);
        Impostor impostor = new Impostor("Azul", "Dois", skin1, pet1, 2);

        Astronauta[] astronautas = new Astronauta[10];

        astronautas[0] = tripulante;
        astronautas[1] = impostor;

        for (Astronauta astronauta : astronautas) {
            if (astronauta != null) {
                if (astronauta instanceof Impostor) {
                    impostor.mostraInfo();
                    impostor.verCameras();
                    impostor.reparar();
                    impostor.reportar();
                    impostor.usarVentoinhas();
                    impostor.trancarPortas("Refeitorio");
                    impostor.fazerMissao();
                    impostor.sabotarLuz();
                    impostor.sabotarOxigenio();
                    impostor.sabotarReator();
                    impostor.sabotarComunicacao();
                    impostor.executar();
                    System.out.println(" ");
                } else {
                    tripulante.mostraInfo();
                    tripulante.verCameras();
                    tripulante.reparar();
                    tripulante.reportar();
                    tripulante.fazerMissao();
                    System.out.println(" ");
                }
            }
        }
        System.out.println("Astronautas criados: " + Astronauta.cont);
    }
}
