public class BodaBodaDemo {
    public static void main(String[] args) {
        BodaBoda boda1 = new BodaBoda("UBB123X", "Nakato Faith", 1500);
        BodaBoda boda2 = new BodaBoda("UFD456Y", "Okello Brian", 2000);

        System.out.println("=== Boda Boda 1 ===");
        boda1.displayDetails();
        System.out.printf("Fare for 3 km: UGX %.2f%n", boda1.computeFare(3));
        System.out.printf("Fare for 7.5 km: UGX %.2f%n%n", boda1.computeFare(7.5));

        System.out.println("=== Boda Boda 2 ===");
        boda2.displayDetails();
        System.out.printf("Fare for 2 km: UGX %.2f%n", boda2.computeFare(2));
        System.out.printf("Fare for 5 km: UGX %.2f%n%n", boda2.computeFare(5));

        System.out.println("Rider 1's name from getter: " + boda1.getRiderName());
        boda1.setRiderName("Nakato Faith");
        boda1.setFarePerKm(1800);
        System.out.printf("Updated fare per km: UGX %.2f%n", boda1.getFarePerKm());

        boda1.setFarePerKm(0);
    }
}
