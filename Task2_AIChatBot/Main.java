import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ChatBot bot = new ChatBot();

        System.out.println("====================================");
        System.out.println("     CODEALPHA AI CHATBOT");
        System.out.println("====================================");
        System.out.println("Ask me anything!");
        System.out.println("Type 'bye' to exit.\n");

        while(true) {

            System.out.print("You: ");
            String userInput = scanner.nextLine();

            String response = bot.getResponse(userInput);

            System.out.println("Bot: " + response);

            if(userInput.equalsIgnoreCase("bye")) {
                break;
            }
        }

        System.out.println("\nChat Ended Successfully.");
        scanner.close();
    }
}