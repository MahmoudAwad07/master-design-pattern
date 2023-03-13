package com.awadinhoo.code.designpatterns.strategy.refactor;

public class StrategyTest {


    public static void main (String[] args){

        ChatClientRefactor chatClientRefactor = new ChatClientRefactor(new DESEncryptionAlgorithm(), new SMPPSender());
        chatClientRefactor.send("Hello from Strategy Design Pattern");

    }
}
