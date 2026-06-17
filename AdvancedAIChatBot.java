import java.util.Scanner;
import java.time.LocalDateTime;
import java.util.Random;

public class AdvancedAIChatBot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String userName = "";

        System.out.println("🤖 Advanced AI ChatBot Started!");
        System.out.println("Bot: Hello! What is your name?");

        System.out.print("You: ");
        userName = sc.nextLine();

        System.out.println("Bot: Nice to meet you, " + userName + "!");
        System.out.println("Bot: Type 'bye' anytime to exit.");

        while (true) {

            System.out.print(userName + ": ");
            String input = sc.nextLine().toLowerCase();

            if (input.equals("bye")) {
                System.out.println("Bot: Goodbye " + userName + "! Have a great day!");
                break;
            }

            else if (input.contains("hello") || input.contains("hi")) {
                String greetings[] = {
                    "Hello " + userName + "!",
                    "Hi there! How are you today?",
                    "Nice to see you again!"
                };

                System.out.println("Bot: " + greetings[random.nextInt(greetings.length)]);
            }

            else if (input.contains("how are you")) {
                System.out.println("Bot: I am functioning perfectly! Thanks for asking.");
            }

            else if (input.contains("your name")) {
                System.out.println("Bot: My name is Advanced Java AI ChatBot.");
            }

            else if (input.contains("time")) {
                System.out.println("Bot: Current time is " + LocalDateTime.now());
            }

            else if (input.contains("date")) {
                System.out.println("Bot: Today's date is " + LocalDateTime.now().toLocalDate());
            }

            else if (input.contains("java")) {
                System.out.println("Bot: Java is a powerful object-oriented programming language used for web, mobile, and enterprise applications.");
            }

            else if (input.contains("college")) {
                System.out.println("Bot: Study consistently, practice coding, and you will improve your skills.");
            }

            else if (input.contains("joke")) {
                String jokes[] = {
                    "Why do programmers prefer dark mode? Because light attracts bugs!",
                    "Why was the computer cold? Because it forgot to close its Windows!",
                    "A programmer's favorite place is the Foo Bar."
                };

                System.out.println("Bot: " + jokes[random.nextInt(jokes.length)]);
            }

            else if (input.contains("add")) {

                System.out.print("Bot: Enter first number: ");
                int a = sc.nextInt();

                System.out.print("Bot: Enter second number: ");
                int b = sc.nextInt();

                System.out.println("Bot: The sum is " + (a + b));

                sc.nextLine(); // clear buffer
            }

            else if (input.contains("thanks")) {
                System.out.println("Bot: You're welcome, " + userName + "! Happy coding.");
            }

            else if (input.contains("help")) {
                System.out.println("Bot: You can ask me about Java, time, date, jokes, addition, or say hello.");
            }

            else {
                System.out.println("Bot: Sorry, I didn't understand that. Type 'help' to know what I can do.");
            }
        }

        sc.close();
    }
}