import javax.swing.*;
import java.awt.FlowLayout;

public class FareCalculatorGUI {
    public static void main(String[] args) {
       
        BodaBoda boda = new BodaBoda("UBB123X", "Nakato Faith", 1500);

        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Boda Boda Fare Calculator");
            frame.setSize(420, 180);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new FlowLayout());

            JLabel detailsLabel = new JLabel(
                    "Rider: " + boda.getRiderName()
                    + " | Plate: " + boda.getPlateNumber()
                    + " | Rate: UGX " + String.format("%.2f", boda.getFarePerKm()) + "/km"
            );
            JLabel distanceLabel = new JLabel("Enter distance (km):");
            JTextField distanceField = new JTextField(10);
            JButton calculateButton = new JButton("Calculate Fare");
            JLabel resultLabel = new JLabel("Fare will appear here.");

            calculateButton.addActionListener(e -> {
                try {
                    double distance = Double.parseDouble(distanceField.getText().trim());
                    if (distance < 0) {
                        resultLabel.setText("Distance cannot be negative.");
                        return;
                    }

                    double fare = boda.computeFare(distance);
                    resultLabel.setText(String.format("Total fare: UGX %.2f", fare));
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Please enter a valid number.");
                } catch (IllegalArgumentException ex) {
                    resultLabel.setText(ex.getMessage());
                }
            });

            frame.add(detailsLabel);
            frame.add(distanceLabel);
            frame.add(distanceField);
            frame.add(calculateButton);
            frame.add(resultLabel);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
