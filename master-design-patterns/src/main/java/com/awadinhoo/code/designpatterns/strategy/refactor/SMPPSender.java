package com.awadinhoo.code.designpatterns.strategy.refactor;

public class SMPPSender implements MessageSender {
    @Override
    public String Send(String msg) {
        System.out.println("Sending the message by SMPP Sender ...");
        return "200";
    }
}
