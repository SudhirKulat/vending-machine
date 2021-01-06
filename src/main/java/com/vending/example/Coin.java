package com.vending.example;

public enum Coin {
    NOCOINE(0), FIVERUPEE(5),TENRUPEE(10),TWENTYRUPEE(20),FIFTYRUPEE(50),HUNDREDRUPEE(100),TWOHUNDREDRUPEE(200);

    private int coinValue;

    Coin(int i){
        this.coinValue=i;
    }

    public int getCoinValue(){
        return this.coinValue;
    }
}
