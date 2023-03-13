package com.awadinhoo.code.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StockListView implements Observer{

    private List<Stock> stocks = new ArrayList<>();

    public void addStock(Stock stock) {
        stocks.add(stock);
        stock.addObserver(this);
    }

    public void show() {
        for (Stock stock : stocks)
            System.out.println(stock);
    }

    @Override
    public void update(Stock stock) {

        System.out.println(" Stocks in StockListView is refershed ");
        for (Stock st : stocks){
            if(st.getSymbol().equalsIgnoreCase(stock.getSymbol())){
                st.setPrice(stock.getPrice());
                break;
            }
        }
        this.show();
    }

}
