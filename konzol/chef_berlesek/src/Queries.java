import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Queries {
    private ArrayList<Berles> rents;
    public Queries(ArrayList<Berles> rents) {
        this.rents = rents;
    }
    public void forMonth() {
        Scanner sc = new Scanner(System.in);
        int month = 0;
        while (month < 1 || month > 12) {
            try {
                System.out.print("Kérlek adj meg egy hónapot (1-12): ");
                month = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Kérlek egy számot írj be 1-től 12-ig.");
                sc.nextLine();
            }
        }
        sc.close();
        int totalForMonth = 0;
        for (Berles rent : rents) {
            if (rent.isInMonth(month)) {
                totalForMonth += rent.getTotalPrice();
            }
        }
        System.out.println(String.format("A bevétel a %d. hónapra: %d EUR",month,totalForMonth));
    }
    public void forYear() {
        int totalForYear = 0;
        for (Berles rent : rents) {
            totalForYear += rent.getTotalPrice();
        }
        System.out.println(String.format("A teljes éves bevétel: %d EUR",totalForYear));
    }
    public void mostExpensiveRent() {
        int max = 0;
        int maxid = 0;
        for (Berles rent : rents) {
            if (rent.getTotalPrice() > max) {
                max = rent.getTotalPrice();
                maxid = rent.getUid();
            }
        }
        System.out.println(String.format("A legdrágább bérlés száma %d, melynek összege %d EUR",maxid,max));
    }
    private HashMap<String,Integer> numberOfUniqueChefs() {
        HashMap<String,Integer> chef_count = new HashMap<>();
        for (Berles rent : rents) {
            if (chef_count.keySet().contains(rent.getName())) {
                int x = chef_count.get(rent.getName());
                chef_count.put(rent.getName(), x+1);
            } else {
                chef_count.put(rent.getName(),1);
            }
        }
        return chef_count;
    }
    public void getNumberOfUniqueChefs() {
        System.out.println(numberOfUniqueChefs().size());
    }
    public void mostRentedChef() {
        HashMap<String,Integer> chefcount = numberOfUniqueChefs();
        int maxrents = 0;
        String maxname = "";
        for (String name : chefcount.keySet()) {
            if (chefcount.get(name) > maxrents) {
                maxrents = chefcount.get(name);
                maxname = name;
            }
        }
        System.out.println(String.format("A legtöbbet bérelt séf neve: %s",maxname));
    }
    public void rentsPerCuisine() {
        HashMap<String,Integer> cuisine_count = new HashMap<>();
        for (Berles rent : rents) {
            if (cuisine_count.keySet().contains(rent.getCuisine())) {
                int x = cuisine_count.get(rent.getCuisine());
                cuisine_count.put(rent.getCuisine(), x+1);
            } else {
                cuisine_count.put(rent.getCuisine(),1);
            }
        }
        System.out.println();
        for (String cuisine : cuisine_count.keySet()) {
            System.out.println(String.format("A(z) \"%s\" konyhavilágot %d alkalommal bérelték ki",cuisine,cuisine_count.get(cuisine)));
        }
    } public void averageRentPeriod () {
        int allRentDays = 0;
        for (Berles rent : rents) {
            allRentDays += rent.getTotal_time();
        }
        Double averageRent = (double)allRentDays/rents.size();
        System.out.println(String.format("Az átlagos bérlés %.2f napig tartott",averageRent)); 
    }
}
