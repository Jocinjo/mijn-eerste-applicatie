import java.util.Scanner;

/*
opdracht beschrijving:
x meerdere comments gebruiken voor duidelijkheid.
x minimaal 1 class gebruiken

classenvereisten:
x meerdere accessmodifiers voor class dus public private protected of default
x ook voor methodes bovenstaande gebriken
x gebruik inheritance
x maak gebruik van static variabelen en methodes
x gebruik een enum. --> voor wielen

ik ga er een met voertuigen maken
 */
public class Toetsopdracht extends Vehicle{
    private String modelNaam;
    Scanner input = new Scanner(System.in);


    public Toetsopdracht() {}
    public void configuratie() {
        System.out.println("hoeveel wielen heb ik? 2/3/4? ");
        int aantalWielen = input.nextInt();
        switch (aantalWielen) {
            case 2:
                System.out.println("Volgens jou heb ik 2 wielen en ben ik dus een " + Wielen.TWEEWIELER);
                break;
            case 3:
                System.out.println("Volgens jou heb ik 3 wielen en ben ik dus een " + Wielen.DRIEWIELER);
                break;
            case 4:
                System.out.println("Volgens jou heb ik 4 wielen en ben ik dus een " + Wielen.VIERWIELER);
                break;
            default:
                System.out.println("Heb ik wel wielen of ben ik een "+ Wielen.EENWIELER+"?");
        }

    }
    public String getModelNaam() {
        return modelNaam;
    }

    public void setModelNaam(String modelNaam) {
        this.modelNaam = modelNaam;
    }



}
