import javax.swing.*;
import java.awt.*;
import javax.swing.JLabel;

public class Picture {
	
	
    public static void main(String[] args) {
        
		int H_score = 0;
		int C_score = 0;
		
		JFrame frame = new JFrame("Rainbow Neighbours");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null);

		JLabel score = new JLabel();
		score.setFont(new Font("Arail" , Font.BOLD, 40));
		score.setForeground(Color.BLACK);
		score.setText(String.format("Highest Score : %02d   Your Score : %02d", H_score, C_score));
		score.setHorizontalAlignment(JLabel.RIGHT);
		score.setVerticalAlignment(JLabel.TOP);
		
		score.setBounds(900,100,800, 800);
        JPanel gridPanel = new JPanel(new GridLayout(6, 6, 5, 5));
        
        gridPanel.setBounds(20,300,580,580); 
        gridPanel.setOpaque(false); 


        for (int i = 0; i < 36; i++) {
            JButton button = new JButton();
            button.setBackground(Color.LIGHT_GRAY);
            button.setOpaque(true);
            button.setBorderPainted(true);
            gridPanel.add(button);
        }
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        ImageIcon icon = new ImageIcon("\\\\ict.ru.ac.za\\DFS\\UGHomes\\G25N9743\\My Documents\\My Pictures\\7db2f51483e33ec43d4d4308aaf321d4.jpg");
        Image scaled = icon.getImage().getScaledInstance(screenSize.width ,screenSize.height,Image.SCALE_SMOOTH);
        JLabel background = new JLabel(new ImageIcon(scaled));
        background.setBounds(0, 0, 500, 500);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setContentPane(background);
        background.setLayout(null); 


		background.add(score);
        background.add(gridPanel);
        frame.add(gridPanel);
        frame.setVisible(true);
    }
    
    
}
