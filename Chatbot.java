package ChatBOT;

import java.util.Scanner;
public class Chatbot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Hey! I'm your friendly chatbot. What's your name?");
        String name = scanner.nextLine();
        
        System.out.println("Nice to meet you, " + name + "! How can I assist you today?");
        
        while (true) {
            String userInput = scanner.nextLine();
            
            String response = generateResponse(userInput);
            
            System.out.println(response);
            
            if (response.equalsIgnoreCase("Goodbye!")) {
                break;
            }
        }
        
        System.out.println("It was nice chatting with you, " + name + "! Have a great day!");
    }
    
    public static String generateResponse(String userInput) {
        if (userInput.contains("hello") || userInput.contains("hi")) {
            return "Hello! How can I help you?";
        } else if (userInput.contains("how are you")) {
            return "I'm doing well, thank you! How about you?";
        } else if (userInput.contains("good") || userInput.contains("great")) {
            return "That's awesome! Anything specific you'd like to chat about?";
        } else if (userInput.contains("bye")) {
            return "Goodbye!";
        } else {
            return "I'm sorry, I didn't quite catch that. Can you please rephrase?";
        }
    }
}