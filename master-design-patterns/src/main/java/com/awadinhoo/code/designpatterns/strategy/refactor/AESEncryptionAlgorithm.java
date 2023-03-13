package com.awadinhoo.code.designpatterns.strategy.refactor;

public class AESEncryptionAlgorithm implements EncryptionAlgorithm{
    @Override
    public String encrypt(String msg) {
        System.out.println("Encrypting message using AES");
        return "Message Encrypted By AES Algorithm";
    }
}
