public class BuyAlgorithm {
    public static int billigsteTastatur(int[] tastaturen) {
        int min = tastaturen[0];
        for (int preis : tastaturen) {
            if (preis < min) {
                min = preis;
            }
        }
        return min;
    }

    public static int teuersterGegenstand(int[] tastaturen, int[] usbs) {
        int max = tastaturen[0];

        for (int preis : tastaturen) {
            if (preis > max) {
                max = preis;
            }
        }

        for (int preis : usbs) {
            if (preis > max) {
                max = preis;
            }
        }

        return max;
    }

    public static int teuersterUsbImBudget(int[] usbs, int budget) {
        int max = -1;
        for (int preis : usbs) {
            if (preis <= budget && preis > max) {
                max = preis;
            }
        }
        return max;
    }

    public static int maximalerBetrag(int budget, int[] tastaturen, int[] usbs) {
        int maxSum = -1;

        for (int tastaturPreis : tastaturen) {
            for (int usbPreis : usbs) {
                int sum = tastaturPreis + usbPreis;
                if (sum <= budget && sum > maxSum) {
                    maxSum = sum;
                }
            }
        }

        return maxSum;
    }
}
