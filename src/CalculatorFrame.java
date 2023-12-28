import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class CalculatorFrame extends JFrame {
    JPanel btnPanel = new JPanel(new GridLayout(6, 5));
    JPanel radixPanel = new JPanel();
    BtnList btnList = new BtnList();
    JRadioButton[] radioButtonList = btnList.getRadioButton();
    JButton[] buttonList = btnList.getButton();
    JRadioButton hexaDecimalRadio = radioButtonList[0];
    JRadioButton decimalRadio = radioButtonList[1];
    JRadioButton binaryRadio = radioButtonList[2];
    JRadioButton currentRadioButton;
    String currentOperator;
    String operand1;
    String operand2;
    CalculatorOperations calculatorOperations = new CalculatorOperations();

    CalculatorEnableDisable calculatorEnableDisable = new CalculatorEnableDisable();

    JLabel result = new JLabel("", SwingConstants.CENTER);

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

        for (JRadioButton radioButton : radioButtonList) {
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
        for (JButton button : buttonList) {
            button.addActionListener(buttonHandler);
        }

        add(resultPanel, BorderLayout.CENTER);
        add(btnPanel, BorderLayout.SOUTH);
        hexaDecimalRadio.setSelected(true);
        currentRadioButton = hexaDecimalRadio;
        setVisible(true);
    }

    public class ButtonHandler implements ActionListener {

        //todo: chatgpt'de en sonki yazışmaya bak. ona göre switch caseler ile
        // ekrana yazdırtma fonksiyonuna devam et

        @Override
        public void actionPerformed(ActionEvent e) {

            String command = e.getActionCommand();

            switch (command) {
                case "1":
                    result.setText(result.getText() + "1");
                    break;
                case "2":
                    result.setText(result.getText() + "2");
                    break;
                case "3":
                    result.setText(result.getText() + "3");
                    break;
                case "4":
                    result.setText(result.getText() + "4");
                    break;
                case "5":
                    result.setText(result.getText() + "5");
                    break;
                case "6":
                    result.setText(result.getText() + "6");
                    break;
                case "7":
                    result.setText(result.getText() + "7");
                    break;
                case "8":
                    result.setText(result.getText() + "8");
                    break;
                case "9":
                    result.setText(result.getText() + "9");
                    break;
                case "0":
                    result.setText(result.getText() + "0");
                    break;
                case "A":
                    result.setText(result.getText() + "A");
                    break;
                case "B":
                    result.setText(result.getText() + "B");
                    break;
                case "C":
                    result.setText(result.getText() + "C");
                    break;
                case "D":
                    result.setText(result.getText() + "D");
                    break;
                case "E":
                    result.setText(result.getText() + "E");
                    break;
                case "F":
                    result.setText(result.getText() + "F");
                    break;
                case "<<":
                    currentOperator = "<<";
                    operand1 = result.getText();
                    result.setText(result.getText() + " Lsh ");
                    break;
                case ">>":
                    currentOperator = ">>";
                    operand1 = result.getText();
                    result.setText(result.getText() + " Rsh ");
                    break;
                case "+":
                    currentOperator = "+";
                    operand1 = result.getText();
                    result.setText(result.getText() + " + ");
                    break;
                case "-":
                    currentOperator = "-";
                    operand1 = result.getText();
                    result.setText(result.getText() + " - ");
                    break;
                case "*":
                    currentOperator = "*";
                    operand1 = result.getText();
                    result.setText(result.getText() + " * ");
                    break;
                case "/":
                    currentOperator = "/";
                    operand1 = result.getText();
                    result.setText(result.getText() + " / ");
                    break;
                case "AND":
                    currentOperator = "AND";
                    operand1 = result.getText();
                    result.setText(result.getText() + " AND ");
                    break;
                case "OR":
                    currentOperator = "OR";
                    operand1 = result.getText();
                    result.setText(result.getText() + " OR ");
                    break;
                case "XOR":
                    currentOperator = "XOR";
                    operand1 = result.getText();
                    result.setText(result.getText() + " XOR ");
                    break;
                case "NOT":
                    currentOperator = "NOT";
                    operand1 = result.getText();;
                    result.setText("NOT(" + operand1 + ")");
                    break;
                case "=":
                    String inputText = result.getText();
                    if (currentOperator.equals("<<")) {
                        int operatorIndex = inputText.lastIndexOf(" Lsh ");
                        operand2 = inputText.substring(operatorIndex + " Lsh ".length());
                        result.setText(calculatorOperations.lshOperator(operand1, operand2, currentRadioButton));
                    }
                    else if (currentOperator.equals(">>")){
                        int operatorIndex = inputText.lastIndexOf(" Rsh ");
                        operand2 = inputText.substring(operatorIndex + " Rsh ".length());
                        result.setText(calculatorOperations.rshOperator(operand1, operand2, currentRadioButton));
                    }
                    else if (currentOperator.equals("NOT")) {
                        String notResult = calculatorOperations.notOperator(operand1, currentRadioButton);
                        result.setText(calculatorOperations.notOperator(operand1, currentRadioButton));
                    }
                    else{
                        int operatorIndex = inputText.lastIndexOf(" "+currentOperator+" ");
                        int operator2StartIndex = operatorIndex+currentOperator.length()+2;
                        if(operatorIndex!=-1){
                            operand2 = inputText.substring(operator2StartIndex);
                            if(currentOperator.equals("<<")){
                                result.setText(calculatorOperations.lshOperator(operand1,operand2,currentRadioButton));
                            }
                            else if(result.getText().contains("+")){
                                result.setText(calculatorOperations.sumOperator(operand1,operand2,currentRadioButton));
                            }
                            else if(result.getText().contains("-")){
                                result.setText(calculatorOperations.subtractionOperator(operand1,operand2,currentRadioButton));
                            }
                            else if(result.getText().contains("*")){
                                result.setText(calculatorOperations.multiplyOperator(operand1,operand2,currentRadioButton));
                            }
                            else if(result.getText().contains("/")){
                                result.setText(calculatorOperations.divisionOperator(operand1,operand2,currentRadioButton));
                            }
                            else if (result.getText().contains("AND")){
                                result.setText(calculatorOperations.andOperator(operand1,operand2,currentRadioButton));
                            }
                            else if(result.getText().contains("OR")){
                                result.setText(calculatorOperations.orOperator(operand1,operand2,currentRadioButton));
                            }
                            else if(result.getText().contains("XOR")){
                                result.setText(calculatorOperations.xorOperator(operand1,operand2,currentRadioButton));
                            }
                        }
                    }
                    break;
                case "CLEAR":
                    result.setText("");
                    break;
            }

            if (e.getSource() == decimalRadio) {
                currentRadioButton = decimalRadio;
                hexaDecimalRadio.setSelected(false);
                binaryRadio.setSelected(false);
                calculatorEnableDisable.enableDecimal(buttonList);
            } else if (e.getSource() == hexaDecimalRadio) {
                currentRadioButton = hexaDecimalRadio;
                decimalRadio.setSelected(false);
                binaryRadio.setSelected(false);
                calculatorEnableDisable.enableHexadecimal(buttonList);
            } else if (e.getSource() == binaryRadio) {
                currentRadioButton = binaryRadio;
                decimalRadio.setSelected(false);
                hexaDecimalRadio.setSelected(false);
                calculatorEnableDisable.enableBinary(buttonList);
            }
            btnPanel.revalidate();
            btnPanel.repaint();
        }
    }
}
