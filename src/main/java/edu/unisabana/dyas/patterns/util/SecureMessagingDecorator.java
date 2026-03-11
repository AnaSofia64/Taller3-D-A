package edu.unisabana.dyas.patterns.util;

public class SecureMessagingDecorator implements MessageSender {

    private MessageSender sender;

    public SecureMessagingDecorator(MessageSender sender) {
        this.sender = sender;
    }

    @Override
    public void sendMessage(String message) {

        if(isDangerous(message)){
            System.out.println("Mensaje bloqueado debido a contenido peligroso");
            return;
        }

        sender.sendMessage(message);
    }

    private boolean isDangerous(String message){

        return message.contains("##(") ||
               message.contains("exec") ||
               message.contains("rm");
    }
}