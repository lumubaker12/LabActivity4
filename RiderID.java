public class RiderID {
    public static void main(String[] args) {
        String riderName = "Nakato Faith";
        String plateNumber = "UBB123X";
        
        if (riderName == null || riderName.trim().length() < 3) {
            System.out.println("Rider name must contain at least three characters.");
            return;
        }

        String riderCode = riderName.trim().substring(0, 3).toUpperCase();
        String riderID = riderCode + "-" + plateNumber;

        System.out.println("Rider Name: " + riderName);
        System.out.println("Plate Number: " + plateNumber);
        System.out.println("Rider ID: " + riderID);
    }
}
