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
                    switch (instrumentChoice) {
                        case 1:
                            System.out.println("Anna valmistajan nimi: ");
                            String guitarManufacturer = sc.next();
                            System.out.println("Anna hinta euroina: ");
                            int guitarPrice = sc.nextInt();
                            Guitar guitar = new Guitar(guitarManufacturer, guitarPrice);
                            instruments.add(guitar);
                            break;
                        case 2:
                            System.out.println("Anna valmistajan nimi: ");
                            String violinManufacturer = sc.next();
                            System.out.println("Anna hinta euroina: ");
                            int violinPrice = sc.nextInt();
                            Violin violin = new Violin(violinManufacturer, violinPrice);
                            instruments.add(violin);
                            break;
                        case 3:
                            System.out.println("Anna valmistajan nimi: ");
                            String drumManufacturer = sc.next();
                            System.out.println("Anna hinta euroina: ");
                            int drumPrice = sc.nextInt();
                            Drum drum = new Drum(drumManufacturer, drumPrice);
                            instruments.add(drum);
                            break;
                        default:
                            break;
                    }
                    System.out.println("Soitin lisätty listaan!");
                    break;
                case 2:
                    for (Instrument instrument : instruments) {
                        System.out.println(instrument.getDetails());
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
                default:
                    System.out.println("Virheellinen valinta.");
            }
        }
        sc.close();
    }
}
