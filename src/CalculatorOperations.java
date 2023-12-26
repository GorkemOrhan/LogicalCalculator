import javax.swing.*;
import java.util.Objects;

public class CalculatorOperations {

    public String sumOperator(String operand1, String operand2, JRadioButton currentButton){
        if(Objects.equals(currentButton.getText(), "Hexadecimal")){
            int num1= Integer.parseInt(operand1,16);
            int num2= Integer.parseInt(operand2,16);
            int sum = num1+num2;
            return Integer.toHexString(sum).toUpperCase();
        }
        else if(Objects.equals(currentButton.getText(), "Decimal")){
            int num1= Integer.parseInt(operand1);
            int num2= Integer.parseInt(operand2);
            int sum = num1+num2;
            return Integer.toString(sum);
        }
        else{
            int num1= Integer.parseInt(operand1,2);
            int num2= Integer.parseInt(operand2,2);
            int sum = num1+num2;
            return Integer.toBinaryString(sum);
        }
    }

    public String subtractionOperator(String operand1, String operand2, JRadioButton currentButton){
        if(Objects.equals(currentButton.getText(), "Hexadecimal")){
            int num1= Integer.parseInt(operand1,16);
            int num2= Integer.parseInt(operand2,16);
            int sum = num1-num2;
            return Integer.toHexString(sum).toUpperCase();
        }
        else if(Objects.equals(currentButton.getText(), "Decimal")){
            int num1= Integer.parseInt(operand1);
            int num2= Integer.parseInt(operand2);
            int sum = num1-num2;
            return Integer.toString(sum);
        }
        else{
            int num1= Integer.parseInt(operand1,2);
            int num2= Integer.parseInt(operand2,2);
            int sum = num1-num2;
            return Integer.toBinaryString(sum);
        }
    }

    public String multiplyOperator(String operand1, String operand2, JRadioButton currentButton){
        if(Objects.equals(currentButton.getText(), "Hexadecimal")){
            int num1= Integer.parseInt(operand1,16);
            int num2= Integer.parseInt(operand2,16);
            int sum = num1*num2;
            return Integer.toHexString(sum).toUpperCase();
        }
        else if(Objects.equals(currentButton.getText(), "Decimal")){
            int num1= Integer.parseInt(operand1);
            int num2= Integer.parseInt(operand2);
            int sum = num1*num2;
            return Integer.toString(sum);
        }
        else{
            int num1= Integer.parseInt(operand1,2);
            int num2= Integer.parseInt(operand2,2);
            int sum = num1*num2;
            return Integer.toBinaryString(sum);
        }
    }

    public String divisionOperator(String operand1, String operand2, JRadioButton currentButton){
        if(Objects.equals(currentButton.getText(), "Hexadecimal")){
            int num1= Integer.parseInt(operand1,16);
            int num2= Integer.parseInt(operand2,16);
            int sum = num1/num2;
            return Integer.toHexString(sum).toUpperCase();
        }
        else if(Objects.equals(currentButton.getText(), "Decimal")){
            int num1= Integer.parseInt(operand1);
            int num2= Integer.parseInt(operand2);
            int sum = num1/num2;
            return Integer.toString(sum);
        }
        else{
            int num1= Integer.parseInt(operand1,2);
            int num2= Integer.parseInt(operand2,2);
            int sum = num1/num2;
            return Integer.toBinaryString(sum);
        }
    }

}
