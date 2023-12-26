import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class CalculatorFrame extends JFrame {
    JPanel btnPanel = new JPanel(new GridLayout(6,5));
    JPanel radixPanel = new JPanel();
    BtnList btnList = new BtnList();

    JLabel result = new JLabel("",SwingConstants.CENTER);

    public CalculatorFrame() {
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        for (JButton button : btnList.getButton()) {
            if (Objects.equals(button.getText(), "0")) {
                btnPanel.add(new JLabel(""));
                btnPanel.add(button);
                btnPanel.add(new JLabel(""));
                continue;
            }
            btnPanel.add(button);
        }

        int totalButtons = btnList.getButton().length + 2;
        int totalCells = 6 * 5;
        for (int i = totalButtons; i < totalCells; i++) {
            btnPanel.add(new JLabel(""));
        }

        for(JRadioButton radioButton:btnList.getRadioButton()){
            radixPanel.add(radioButton);
        }
        add(radixPanel, BorderLayout.NORTH);

        result.setMaximumSize(new Dimension(200, 30));
        result.setPreferredSize(new Dimension(200, 30));
        result.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        result.setOpaque(true);
        result.setBackground(Color.WHITE);

        JPanel resultPanel = new JPanel();
        resultPanel.setLayout(new BoxLayout(resultPanel, BoxLayout.LINE_AXIS));
        resultPanel.add(Box.createHorizontalGlue());
        resultPanel.add(result);
        resultPanel.add(Box.createHorizontalGlue());


        add(resultPanel, BorderLayout.CENTER);
        add(btnPanel,BorderLayout.SOUTH);
        setVisible(true);
    }

}
