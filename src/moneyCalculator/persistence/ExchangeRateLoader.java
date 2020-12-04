package moneyCalculator.persistence;

import moneyCalculator.model.Currency;
import moneyCalculator.model.ExchangeRate;

public interface ExchangeRateLoader {
    ExchangeRate load(Currency from, Currency to);
    
}