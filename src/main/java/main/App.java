package main;

import java.util.ArrayList;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {
        ArrayList<Instrument> instruments = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        // Action menu
        while (running) {
            System.out.println("1) Lisää soitin");
            System.out.println("2) Listaa soittimet");
            System.out.println("3) Viritä kielisoittimet");
            System.out.println("4) Soita rumpuja");
            System.out.println("0) Lopeta ohjelma");
            
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    // Chooses type of instrument and gives manufacturer and price
                    System.out.println("Minkä soittimen haluat lisätä? 1) Kitara, 2) Viulu, 3) Rummut");
                    int instrumentChoice = Integer.parseInt(scanner.nextLine());
                    System.out.println("Anna valmistajan nimi:");
                    String manufacturer = scanner.nextLine();
                    System.out.println("Anna hinta euroina:");
                    int price = Integer.parseInt(scanner.nextLine());
                    
                    // Instrument choice menu
                    switch (instrumentChoice) {
                        case 1:
                            instruments.add(new Guitar(manufacturer, price));
                            break;
                        case 2:
                            instruments.add(new Violin(manufacturer, price));
                            break;
                        case 3:
                            instruments.add(new Drum(manufacturer, price));
                            break;
                        default:
                            System.out.println("Virheellinen soitinvalinta.");
                            continue;
                    }
                    System.out.println("Soitin lisätty listaan!");
                    break;
                case 2:
                    // Check if list exists and display it
                    if (instruments.isEmpty()) {
                        System.out.println("Ei lisättyjä soittimia.");
                    } else {
                        for (Instrument inst : instruments) {
                            System.out.println(inst.getDetails());
                        }
                    }
                    break;
                case 3:
                    //Run tune method if string instruments have been added
                    for (Instrument inst : instruments) {
                        if (inst instanceof StringInstrument) {
                            ((StringInstrument) inst).tune();
                        }
                    }
                    break;
                case 4:
                    //Run playBeat method if Drum has been added
                    for (Instrument inst : instruments) {
                        if (inst instanceof Drum) {
                            ((Drum) inst).playBeat();
                        }
                    }
                    break;
                case 0:
                    System.out.println("Kiitos ohjelman käytöstä.");
                    running = false;
                    break;
                default:
                    System.out.println("Virheellinen valinta.");
            }
        }
        scanner.close();
    }
}

