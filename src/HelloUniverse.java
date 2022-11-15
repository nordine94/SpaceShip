import java.util.Scanner;

public class HelloUniverse {

    public static void main(String... args) {

        PlaneteTellurique mercure = new PlaneteTellurique("Mercure");
        mercure.diametre = 4880;
        PlaneteTellurique venus = new PlaneteTellurique("Venus");
        venus.diametre = 12100;
        PlaneteTellurique terre = new PlaneteTellurique("Terre");
        terre.diametre = 12756;
        PlaneteTellurique mars = new PlaneteTellurique("Mars");
        mars.diametre = 6792;
        PlaneteGazeuse jupiter = new PlaneteGazeuse("Jupiter");
        jupiter.diametre = 142984;
        PlaneteGazeuse saturne = new PlaneteGazeuse("Saturne");
        saturne.diametre = 120536;
        PlaneteGazeuse uranus = new PlaneteGazeuse("Uranus");
        uranus.diametre = 51118;
        PlaneteGazeuse neptune = new PlaneteGazeuse("Neptune");
        neptune.diametre = 49532;



        Vaisseau chasseur = new VaisseauDeGuerre("CHASSEUR");


        Vaisseau fregate = new VaisseauDeGuerre("FREGATE");
        fregate.nbPassagers = 24;
        fregate.tonnageMax = 60;

        Vaisseau vaisseauMonde = new VaisseauCivil("VAISSEAU-MONDE");

        Scanner sc = new Scanner(System.in);
        System.out.println("Quel vaisseau souhaitez vous selectionner ?");
        String vaisseauSelectionne = sc.nextLine();
        System.out.println("Sur quelle planete souhaitez vous atterir ?");
        String planeteSelectionne = sc.nextLine();
        System.out.println("Quelle tonnage souhaitez vous embarquez ?");
        int tonnage = sc.nextInt();

        Vaisseau vaisseau = null;
        switch (vaisseauSelectionne){
            case "CHASSEUR" :
                vaisseau = chasseur;
                break;
            case "FREGATE" :
                vaisseau = fregate;
                break;
            case "VAISSEAU-MONDE" :
                vaisseau = vaisseauMonde;
                break;
        }

        PlaneteTellurique planete = null;
        switch (planeteSelectionne){
            case "Mercure" :
                planete = mercure;
                break;
            case "Venus" :
                planete = venus;
                break;
            case "Mars" :
                planete = mars;
                break;
        }
        planete.accueillirVaisseau(vaisseau);
        int rejet = vaisseau.emporterCargaison(tonnage);
        System.out.println("Le rejet est de " + rejet);


    }

}