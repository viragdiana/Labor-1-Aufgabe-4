public class Main {
    public static void main(String[] args) {
        int[] tastaturen = {40, 35, 70, 15, 45};
        int[] usbs = {20, 15, 40, 15};
        int budget = 60;

        System.out.println("Billigste Tastatur: " + BuyAlgorithm.billigsteTastatur(tastaturen));
        System.out.println("Teuerster Gegenstand: " + BuyAlgorithm.teuersterGegenstand(tastaturen, usbs));
        System.out.println("Teuerster USB im Budget: " + BuyAlgorithm.teuersterUsbImBudget(usbs, 30));
        System.out.println("Maximaler Betrag im Budget: " + BuyAlgorithm.maximalerBetrag(budget, tastaturen, usbs));
    }
}