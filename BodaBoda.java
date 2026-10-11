public class BodaBoda {
    private String plateNumber;
    private String riderName;
    private double farePerKm;

    public BodaBoda(String plateNumber, String riderName, double farePerKm) {
        this.plateNumber = plateNumber;
        this.riderName = riderName;
        setFarePerKm(farePerKm); // Reuse validation in the setter
    }
    public String getPlateNumber() {
        return plateNumber;
    }

    public String getRiderName() {
        return riderName;
    }

    public double getFarePerKm() {
        return farePerKm;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public void setRiderName(String riderName) {
        this.riderName = riderName;
    }

    public void setFarePerKm(double farePerKm) {
        if (farePerKm > 0) {
            this.farePerKm = farePerKm;
        } else {
            System.out.println("Invalid fare: fare per kilometre must be greater than 0.");
        }
    }

    public void displayDetails() {
        System.out.println("Plate Number: " + plateNumber);
        System.out.println("Rider Name: " + riderName);
        System.out.printf("Fare per Km: UGX %.2f%n", farePerKm);
    }

    public double computeFare(double distanceKm) {
        if (distanceKm < 0) {
            throw new IllegalArgumentException("Distance cannot be negative.");
        }
        return farePerKm * distanceKm;
    }
}
