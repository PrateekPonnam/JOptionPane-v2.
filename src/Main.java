import javax.swing.*;
import java.awt.*;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
   //1 Create a frame
        JFrame frame = new JFrame();
        frame.setSize(500,500);
   //2 Create a panel
        JPanel panel = new JPanel();
        panel.setBackground(Color.BLUE);
   //3 Create components
        JLabel label = new JLabel("Hello World");
        JButton button = new JButton("Push me");
        JTextField textField = new JTextField(5);
        // adding an image
        // image must be in the same folder as the project or you
        // need to spedify the class path
        ImageIcon icon = new ImageIcon("image/MyCards/2C.png");
        // Scaling the image before putting it on the label
        icon.setImage(icon.getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT));
        JLabel picLabel = new JLabel(icon);
        JCheckBox checkBox = new JCheckBox();
   //4 Add components to panel
        panel.add(label);
        panel.add(button);
        panel.add(textField);
        panel.add(picLabel);
        panel.add(checkBox);


        //5 Add the panel to the frame

        frame.add(panel);
   //6 Make frame visible
        frame.setVisible(true);

    }//last
}