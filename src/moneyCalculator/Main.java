package moneyCalculator;

import moneyCalculator.control.CalculateCommand;
import moneyCalculator.persistence.CurrencyListLoader;
import moneyCalculator.persistence.ExchangeRateLoader;
import moneyCalculator.persistence.files.FilesCurrencyListLoader;
import moneyCalculator.persistence.rest.RestExchangeRateLoader;

public class Main {

    public static void main(String[] args) {
        
        CurrencyListLoader currencyLoader = new FilesCurrencyListLoader("currencies.txt");
        ExchangeRateLoader exchangeRateLoader = new RestExchangeRateLoader();
        MainFrame mainFrame = new MainFrame(currencyLoader.currencies());
        mainFrame.add(new CalculateCommand(mainFrame.getMoneyDialog(), mainFrame.getMoneyDisplay(), exchangeRateLoader));
        
    }  
}