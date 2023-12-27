import javax.swing.*;
import java.util.Objects;

public class CalculatorOperations {

    public String sumOperator(String operand1, String operand2, JRadioButton currentButton) {
        if (Objects.equals(currentButton.getText(), "Hexadecimal")) {
            int num1 = Integer.parseInt(operand1, 16);
            int num2 = Integer.parseInt(operand2, 16);
            int sum = num1 + num2;
            return Integer.toHexString(sum).toUpperCase();
        } else if (Objects.equals(currentButton.getText(), "Decimal")) {
            int num1 = Integer.parseInt(operand1);
            int num2 = Integer.parseInt(operand2);
            int sum = num1 + num2;
            return Integer.toString(sum);
        } else {
            int num1 = Integer.parseInt(operand1, 2);
            int num2 = Integer.parseInt(operand2, 2);
            int sum = num1 + num2;
            return Integer.toBinaryString(sum);
        }
    }

    public String subtractionOperator(String operand1, String operand2, JRadioButton currentButton) {
        if (Objects.equals(currentButton.getText(), "Hexadecimal")) {
            int num1 = Integer.parseInt(operand1, 16);
            int num2 = Integer.parseInt(operand2, 16);
            int sum = num1 - num2;
            return Integer.toHexString(sum).toUpperCase();
        } else if (Objects.equals(currentButton.getText(), "Decimal")) {
            int num1 = Integer.parseInt(operand1);
            int num2 = Integer.parseInt(operand2);
            int sum = num1 - num2;
            return Integer.toString(sum);
        } else {
            int num1 = Integer.parseInt(operand1, 2);
            int num2 = Integer.parseInt(operand2, 2);
            int sum = num1 - num2;
            return Integer.toBinaryString(sum);
        }
    }

    public String multiplyOperator(String operand1, String operand2, JRadioButton currentButton) {
        if (Objects.equals(currentButton.getText(), "Hexadecimal")) {
            int num1 = Integer.parseInt(operand1, 16);
            int num2 = Integer.parseInt(operand2, 16);
            int sum = num1 * num2;
            return Integer.toHexString(sum).toUpperCase();
        } else if (Objects.equals(currentButton.getText(), "Decimal")) {
            int num1 = Integer.parseInt(operand1);
            int num2 = Integer.parseInt(operand2);
            int sum = num1 * num2;
            return Integer.toString(sum);
        } else {
            int num1 = Integer.parseInt(operand1, 2);
            int num2 = Integer.parseInt(operand2, 2);
            int sum = num1 * num2;
            return Integer.toBinaryString(sum);
        }
    }

    public String divisionOperator(String operand1, String operand2, JRadioButton currentButton) {
        if (Objects.equals(currentButton.getText(), "Hexadecimal")) {
            int num1 = Integer.parseInt(operand1, 16);
            int num2 = Integer.parseInt(operand2, 16);
            int sum = num1 / num2;
            return Integer.toHexString(sum).toUpperCase();
        } else if (Objects.equals(currentButton.getText(), "Decimal")) {
            int num1 = Integer.parseInt(operand1);
            int num2 = Integer.parseInt(operand2);
            int sum = num1 / num2;
            return Integer.toString(sum);
        } else {
            int num1 = Integer.parseInt(operand1, 2);
            int num2 = Integer.parseInt(operand2, 2);
            int sum = num1 / num2;
            return Integer.toBinaryString(sum);
        }
    }

    public String andOperator(String operand1, String operand2, JRadioButton currentButton) {
        if (Objects.equals(currentButton.getText(), "Hexadecimal")) {
            int num1 = Integer.parseInt(operand1, 16);
            int num2 = Integer.parseInt(operand2, 16);
            return Integer.toHexString(num1 & num2).toUpperCase();
        } else if (Objects.equals(currentButton.getText(), "Decimal")) {
            int num1 = Integer.parseInt(operand1);
            int num2 = Integer.parseInt(operand2);
            return Integer.toString(num1 & num2);
        } else {
            int num1 = Integer.parseInt(operand1, 2);
            int num2 = Integer.parseInt(operand2, 2);
            return Integer.toBinaryString(num1 & num2);
        }
    }

    public String orOperator(String operand1, String operand2, JRadioButton currentButton) {
        if (Objects.equals(currentButton.getText(), "Hexadecimal")) {
            int num1 = Integer.parseInt(operand1, 16);
            int num2 = Integer.parseInt(operand2, 16);
            return Integer.toHexString(num1 | num2).toUpperCase();
        } else if (Objects.equals(currentButton.getText(), "Decimal")) {
            int num1 = Integer.parseInt(operand1);
            int num2 = Integer.parseInt(operand2);
            return Integer.toString(num1 | num2);
        } else {
            int num1 = Integer.parseInt(operand1, 2);
            int num2 = Integer.parseInt(operand2, 2);
            return Integer.toBinaryString(num1 | num2);
        }
    }

    public String xorOperator(String operand1, String operand2, JRadioButton currentButton) {
        if (Objects.equals(currentButton.getText(), "Hexadecimal")) {
            int num1 = Integer.parseInt(operand1, 16);
            int num2 = Integer.parseInt(operand2, 16);
            return Integer.toHexString(num1 ^ num2).toUpperCase();
        } else if (Objects.equals(currentButton.getText(), "Decimal")) {
            int num1 = Integer.parseInt(operand1);
            int num2 = Integer.parseInt(operand2);
            return Integer.toString(num1 ^ num2);
        } else {
            int num1 = Integer.parseInt(operand1, 2);
            int num2 = Integer.parseInt(operand2, 2);
            return Integer.toBinaryString(num1 ^ num2);
        }
    }

    public String notOperator(String operand, JRadioButton currentButton) {
        if (operand.startsWith("NOT(") && operand.endsWith(")")) {
            operand = operand.substring(4, operand.length() - 1);
        }

        if (Objects.equals(currentButton.getText(), "Hexadecimal")) {
            int num = Integer.parseInt(operand, 16);
            return Integer.toHexString(~num).toUpperCase();
        } else if (Objects.equals(currentButton.getText(), "Decimal")) {
            int num = Integer.parseInt(operand);
            return Integer.toString(~num);
        } else {
            int num = Integer.parseInt(operand, 2);
            return Integer.toBinaryString(~num);
        }
    }

    public String lshOperator(String operand1, String bitNumber, JRadioButton currentButton) {
        int bit = Integer.parseInt(bitNumber);
        if (Objects.equals(currentButton.getText(), "Hexadecimal")) {
            int num1 = Integer.parseInt(operand1, 16);
            return Integer.toHexString(num1 << bit).toUpperCase();
        } else if (Objects.equals(currentButton.getText(), "Decimal")) {
            int num1 = Integer.parseInt(operand1);
            return Integer.toString(num1 << bit);
        } else {
            int num1 = Integer.parseInt(operand1, 2);
            return Integer.toBinaryString(num1 << bit);
        }
    }

}
