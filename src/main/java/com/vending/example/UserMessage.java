package com.vending.example;

public enum UserMessage {
    WRONG_COIN("You entered wrong note/coin. Please insert correct note");

    private String message;

    UserMessage(String message) {
        this.message = message;
    }

    public String getMessage(){
        return this.message;
    }
}
