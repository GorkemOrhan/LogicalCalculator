import javax.swing.*;

public class CalculatorEnableDisable {

    public void enableDecimal(JButton[] buttons) {
        for (JButton button : buttons) {
            button.setEnabled(!isHexadecimalButton(button));
        }
    }

    public void enableHexadecimal(JButton[] buttons) {
        for (JButton button : buttons) {
            button.setEnabled(true);
        }
    }

    public void enableBinary(JButton[] buttons) {
        for (JButton button : buttons) {
            button.setEnabled(isBinaryButton(button) || isMandatoryButton(button));
        }
    }

    private boolean isHexadecimalButton(JButton button) {
        String text = button.getText();
        return "A".equals(text) || "B".equals(text) || "C".equals(text) || "D".equals(text) || "E".equals(text) || "F".equals(text);
    }

    private boolean isBinaryButton(JButton button) {
        String text = button.getText();
        return "0".equals(text) || "1".equals(text);
    }

    private boolean isMandatoryButton(JButton button) {
        String text = button.getText();
        return "AND".equals(text) || "OR".equals(text) || "XOR".equals(text) || "NOT".equals(text) || "<<".equals(text) ||
                ">>".equals(text) || "CLEAR".equals(text) || "+".equals(text) || "-".equals(text) || "*".equals(text) ||
                "=".equals(text) || "/".equals(text);
    }

}
