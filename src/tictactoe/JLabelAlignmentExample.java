import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;

public class JLabelAlignmentExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JLabel Alignment Example");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel label = new JLabel("Sample Text");
        label.setBounds(50, 50, 300, 200); // Set size and position
        label.setBackground(Color.LIGHT_GRAY);
        label.setOpaque(true);
        label.setFont(new Font("Arial", Font.BOLD, 20));
        label.setHorizontalAlignment(SwingConstants.CENTER); // Center the text horizontally
        label.setVerticalAlignment(SwingConstants.CENTER);   // Center the text vertically

        frame.add(label);
        frame.setVisible(true);
    }
}

