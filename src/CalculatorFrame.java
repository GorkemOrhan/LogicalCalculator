import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class CalculatorFrame extends JFrame {
    JPanel btnPanel = new JPanel(new GridLayout(6,5));
    JPanel radixPanel = new JPanel();
    BtnList btnList = new BtnList();
    JRadioButton[] radioButtonList = btnList.getRadioButton();
    JButton[] buttonList = btnList.getButton();
    JRadioButton hexaDecimalRadio = radioButtonList[0];
    JRadioButton decimalRadio = radioButtonList[1];
    JRadioButton binaryRadio = radioButtonList[2];

    CalculatorEnableDisable calEnabDisab = new CalculatorEnableDisable();

    JLabel result = new JLabel("",SwingConstants.CENTER);

    public CalculatorFrame() {
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        for (JButton button : buttonList) {
            if (Objects.equals(button.getText(), "0")) {
                btnPanel.add(new JLabel(""));
                btnPanel.add(button);
                btnPanel.add(new JLabel(""));
                continue;
            }
            btnPanel.add(button);
        }

        int totalButtons = buttonList.length + 2;
        int totalCells = 6 * 5;
        for (int i = totalButtons; i < totalCells; i++) {
            btnPanel.add(new JLabel(""));
        }

        for(JRadioButton radioButton:radioButtonList){
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

        ButtonHandler buttonHandler = new ButtonHandler();
        decimalRadio.addActionListener(buttonHandler);
        hexaDecimalRadio.addActionListener(buttonHandler);
        binaryRadio.addActionListener(buttonHandler);

        add(resultPanel, BorderLayout.CENTER);
        add(btnPanel,BorderLayout.SOUTH);
        hexaDecimalRadio.setSelected(true);
        setVisible(true);
    }

    public class ButtonHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == decimalRadio) {
                hexaDecimalRadio.setSelected(false);
                binaryRadio.setSelected(false);
                calEnabDisab.enableDecimal(buttonList);
            } else if (e.getSource() == hexaDecimalRadio) {
                decimalRadio.setSelected(false);
                binaryRadio.setSelected(false);
                calEnabDisab.enableHexadecimal(buttonList);
            } else if (e.getSource() == binaryRadio) {
                decimalRadio.setSelected(false);
                hexaDecimalRadio.setSelected(false);
                calEnabDisab.enableBinary(buttonList);
            }
            btnPanel.revalidate();
            btnPanel.repaint();
        }
    }

}
