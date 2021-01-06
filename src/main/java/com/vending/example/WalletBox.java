package com.vending.example;

import java.util.HashMap;
import java.util.Map;

public class WalletBox {

    private Map<Coin, Integer> wallet = new HashMap<>();

    public WalletBox() {
       wallet.put(Coin.FIVERUPEE, 5);
       wallet.put(Coin.TENRUPEE, 10);
       wallet.put(Coin.TWENTYRUPEE, 5);
       wallet.put(Coin.FIFTYRUPEE, 2);
       wallet.put(Coin.HUNDREDRUPEE, 0);
    }

    public Map<Coin, Integer> getWallet() {
        return wallet;
    }

    public void setWallet(Map<Coin, Integer> wallet) {
        this.wallet = wallet;
    }

    @Override
    public String toString() {
        return "WalletBox{" +
                "wallet=" + wallet +
                '}';
    }
}
