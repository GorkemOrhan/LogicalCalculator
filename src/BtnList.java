import javax.swing.*;

public class BtnList extends JButton {
    JButton hexaDecimalABtn = new JButton("A");
    JButton logicNotBtn = new JButton("NOT");
    JButton shiftLeftBtn = new JButton("<<");
    JButton shiftRightBtn = new JButton(">>");
    JButton clearBtn = new JButton("CLEAR");
    JButton hexaDecimalBBtn = new JButton("B");
    JButton logicAndBtn = new JButton("AND");
    JButton logicOrBtn = new JButton("OR");
    JButton logicXor = new JButton("XOR");
    JButton sumBtn = new JButton("+");
    JButton hexaDecimalCBtn = new JButton("C");
    JButton numSevenBtn = new JButton("7");
    JButton numEightBtn = new JButton("8");
    JButton numNineBtn = new JButton("9");
    JButton subtractionBtn = new JButton("-");
    JButton hexaDecimalDBtn = new JButton("D");
    JButton numFourBtn = new JButton("4");
    JButton numFiveBtn = new JButton("5");
    JButton num6Btn = new JButton("6");
    JButton multiplyBtn = new JButton("*");
    JButton hexaDecimalEBtn = new JButton("E");
    JButton numOneBtn = new JButton("1");
    JButton numTwoBtn = new JButton("2");
    JButton numThreeBtn = new JButton("3");
    JButton divisionBtn = new JButton("/");
    JButton hexaDecimalFBtn = new JButton("F");
    JButton numZeroBtn = new JButton("0");
    JButton equaltoBtn = new JButton("=");

    JRadioButton hexaDecimalRadio = new JRadioButton("Hexadecimal");
    JRadioButton decimalRadio = new JRadioButton("Decimal");
    JRadioButton binaryRadio = new JRadioButton("Binary");

    private JRadioButton[] radioButton = {hexaDecimalRadio, decimalRadio, binaryRadio};
    private JButton[] mainButton = {hexaDecimalABtn, logicNotBtn, shiftLeftBtn, shiftRightBtn, clearBtn, hexaDecimalBBtn, logicAndBtn,
            logicOrBtn, logicXor, sumBtn, hexaDecimalCBtn, numSevenBtn, numEightBtn, numNineBtn, subtractionBtn, hexaDecimalDBtn,
            numFourBtn, numFiveBtn, num6Btn, multiplyBtn, hexaDecimalEBtn, numOneBtn, numTwoBtn, numThreeBtn, divisionBtn, hexaDecimalFBtn,
            numZeroBtn, equaltoBtn};

    public BtnList(){
        for(JButton button:mainButton){
            String txt = button.getText();
            button.setActionCommand(txt);
        }
    }

    public JButton[] getButton() {
        return mainButton;
    }

    public JRadioButton[] getRadioButton() {
        return radioButton;
    }



}
