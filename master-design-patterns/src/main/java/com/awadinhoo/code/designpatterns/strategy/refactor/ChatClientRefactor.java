package com.awadinhoo.code.designpatterns.strategy.refactor;

public class ChatClientRefactor {

    private final EncryptionAlgorithm encryptionAlgorithm;

    private final MessageSender messageSender;

    public ChatClientRefactor(EncryptionAlgorithm encryptionAlgorithm, MessageSender messageSender) {
        this.encryptionAlgorithm = encryptionAlgorithm;
        this.messageSender = messageSender;
    }

    public void send(String message) {
        String encryptedMessage = encryptionAlgorithm.encrypt(message);
        String statusCode = messageSender.Send(encryptedMessage);
    }
}
