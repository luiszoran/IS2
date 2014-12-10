package swing;

import javax.swing.JButton;
import javax.swing.JPanel;
import model.Exchange;
import ui.ExchangeDialog;


public class ExchangeDialogPanel extends JPanel implements ExchangeDialog{

    public ExchangeDialogPanel() {
        addMoneyPanel();
        addCalculateButton();
        addExchangePanel();
    }

    private JPanel addMoneyPanel() {
        return null;
    }

    private JButton addCalculateButton() {
        return null;
    }

    private JPanel addExchangePanel() {
        return null;
    }
    
    public Exchange getExchange() {
        //return new Exchange(getMoney(), getCurrency(toCurrency));
        return null;
    }
    
}
