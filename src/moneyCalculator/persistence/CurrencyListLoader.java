package moneyCalculator.persistence;

import moneyCalculator.model.Currency;

public interface CurrencyListLoader {
    Currency[] currencies();
}