package swing;
import javax.swing.*;
import java.awt.*;
import ui.ExchangeDialog;

public class ApplicationFrame extends JFrame {
    private ExchangeDialog exchangeDialog;
    public ApplicationFrame() {
        setTitle("Money Calculator");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        this.add(createExchangeDialogPanel());
        this.add(createMoneyPanel());
        this.add(createButton());
    }
    
    private JPanel createExchangeDialogPanel() {
        ExchangeDialogPanel panel = new ExchangeDialogPanel();
        this.exchangeDialog = panel;
        return panel;
    }

    private JButton createButton() {
        JButton button = new JButton("Calculate");
        return button;
    }

    private JPanel createMoneyPanel() {
        return new JPanel();
    }
}
