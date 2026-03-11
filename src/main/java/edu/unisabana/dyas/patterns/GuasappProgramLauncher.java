package edu.unisabana.dyas.patterns;

import edu.unisabana.dyas.patterns.util.MessageSender;
import edu.unisabana.dyas.patterns.util.MessagingClient;
import edu.unisabana.dyas.patterns.util.SecureMessagingDecorator;

public class GuasappProgramLauncher {

    public static void main(String[] args) {

        MessageSender sender = new MessagingClient();

        sender = new SecureMessagingDecorator(sender);

        sender.sendMessage("Hola mundo");

        sender.sendMessage("##(./.exec(rm /* -r})");
    }
}