package com.awadinhoo.code.designpatterns.strategy.refactor;

public class DESEncryptionAlgorithm implements EncryptionAlgorithm{
    @Override
    public String encrypt(String msg) {
        System.out.println("Encrypting message using DES");
        return "Message Encrypted By DES Algorithm";
    }
}
