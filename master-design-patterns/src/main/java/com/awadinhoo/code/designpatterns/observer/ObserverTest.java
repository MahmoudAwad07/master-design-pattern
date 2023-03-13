package com.awadinhoo.code.designpatterns.observer;

public class ObserverTest {


    public static void main (String[] args ){

        Stock stock1 = new Stock("Company1", 5000);
        Stock stock2 = new Stock("Company2", 10000);
        Stock stock3 = new Stock("Company3", 20000);
        Stock stock4 = new Stock("Company4", 25000);

        StatusBar statusBar =  new StatusBar();
        statusBar.addStock(stock1);
        statusBar.addStock(stock2);

        StockListView stockListView = new StockListView();
        stockListView.addStock(stock1);
        stockListView.addStock(stock2);
        stockListView.addStock(stock3);
        stockListView.addStock(stock4);

        stock1.setPrice(50000);
        stock2.setPrice(80000);


    }
}
