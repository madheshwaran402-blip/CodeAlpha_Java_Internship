import java.time.LocalTime;

public class ChatBot {

    public String getResponse(String input) {

        input = input.toLowerCase().trim();

        if(input.contains("hello") || input.contains("hi")) {
            return "Hello! How can I assist you today?";
        }
        else if(input.contains("how are you")) {
            return "I'm doing great. Thanks for asking!";
        }
        else if(input.contains("your name")) {
            return "My name is CodeAlpha AI ChatBot.";
        }
        else if(input.contains("java")) {
            return "Java is a powerful object-oriented programming language.";
        }
        else if(input.contains("oop")) {
            return "OOP stands for Object-Oriented Programming.";
        }
        else if(input.contains("class")) {
            return "A class is a blueprint for creating objects.";
        }
        else if(input.contains("object")) {
            return "An object is an instance of a class.";
        }
        else if(input.contains("arraylist")) {
            return "ArrayList is a dynamic array in Java.";
        }
        else if(input.contains("inheritance")) {
            return "Inheritance allows one class to acquire properties of another.";
        }
        else if(input.contains("polymorphism")) {
            return "Polymorphism allows methods to perform different behaviors.";
        }
        else if(input.contains("encapsulation")) {
            return "Encapsulation binds data and methods together.";
        }
        else if(input.contains("abstraction")) {
            return "Abstraction hides implementation details from users.";
        }
        else if(input.contains("internship")) {
            return "This chatbot was developed for the CodeAlpha Java Internship.";
        }
        else if(input.contains("project")) {
            return "This project demonstrates Java OOP and chatbot development.";
        }
        else if(input.contains("college")) {
            return "I can help with programming-related questions.";
        }
        else if(input.contains("developer")) {
            return "A developer writes, tests, and maintains software.";
        }
        else if(input.contains("time")) {
            return "Current Time: " + LocalTime.now().withNano(0);
        }
        else if(input.contains("thank")) {
            return "You're welcome!";
        }
        else if(input.contains("help")) {
            return "You can ask me about Java, OOP, projects, internship, or time.";
        }
        else if(input.contains("bye")) {
            return "Goodbye! Have a productive day.";
        }
        else {
            return "Sorry, I don't understand that. Try asking about Java, OOP, internship, or time.";
        }
    }
}
