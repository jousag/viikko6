package soittimet;


import java.util.Scanner;
import java.util.ArrayList;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Instrument> instruments = new ArrayList<>();
        boolean exit = false;
        while (!exit) {
            System.out.println("1) Lisää soitin");
            System.out.println("2) Listaa soittimet");
            System.out.println("3) Viritä kielisoittimet");
            System.out.println("4) Soita rumpuja");
            System.out.println("0) Lopeta ohjelma");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Minkä soittimen haluat lisätä? 1) Kitara, 2) Viulu, 3) Rummut");
                    int instrumentChoice = sc.nextInt();
                    System.out.println("Anna valmistajan nimi: ");
                    String manufacturer = sc.next();
                    System.out.println("Anna hinta euroina: ");
                    int price = sc.nextInt();
                    switch (instrumentChoice) {
                        case 1:
                            Guitar guitar = new Guitar(manufacturer, price);
                            instruments.add(guitar);
                            System.out.println("Soitin lisätty listaan!");
                            break;
                        case 2:
                            Violin violin = new Violin(manufacturer, price);
                            instruments.add(violin);
                            System.out.println("Soitin lisätty listaan!");
                            break;
                        case 3:
                            Drum drum = new Drum(manufacturer, price);
                            instruments.add(drum);
                            System.out.println("Soitin lisätty listaan!");
                            break;
                        default:
                            System.out.println("Virheellinen soitinvalinta.");
                            break;
                        }
                    break;
                case 2:
                    if (instruments.isEmpty()) {
                        System.out.println("Ei lisättyjä soittimia.");
                        break;
                    }else {
                        for (Instrument instrument : instruments) {
                            System.out.println(instrument.getDetails());
                        }
                    }
                    break;
                case 3:
                    for (Instrument instrument : instruments) {
                        if (instrument instanceof StringInstrument) {
                            ((StringInstrument) instrument).tune();
                        }
                    }
                    break;
                case 4:
                    for (Instrument instrument : instruments) {
                        if (instrument instanceof Drum) {
                            ((Drum) instrument).playBeat();
                        }
                    }
                    break;
                case 0:
                    System.out.println("Kiitos ohjelman käytöstä.");
                    exit = true;
                    break;
                default:
                    System.out.println("Virheellinen valinta.");
            }
        }
        sc.close();
    }
}
