package nl.dke.boardgame.display;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InfoPanel extends JPanel
{

    private static final long serialVersionUID = 1L;
    private JLabel label;
    private JTextField input;
    
    public InfoPanel()
    {
        this.setPreferredSize(new Dimension(150, 700));
        label = new JLabel("Please enter move");
        input = new JTextField(7);
        JButton button = new JButton("Enter");
        button.addActionListener(new buttonInput());
        this.add(label); this.add(input);;this.add(button);
    }
    
    public void updateLabel(String newInput) {
    	label.setText(newInput);
    }
    
    public class buttonInput implements ActionListener
    {
		public void actionPerformed(ActionEvent arg0) {
			//would start the move function based on user input
			updateLabel(input.getText());
		}
    }
}
