package Interfaces;

import java.util.Scanner;


class EnglishGreeter implements greeter {
    @Override
    public void greet(String name) {
        System.out.println("Hello "+ name +"!");
    }
}

class SpanishGreeter implements greeter {
    @Override
    public void greet(String name) {
        System.out.println("¡Hola "+ name +"!");
    }
}

public class example {
    public static String getName() {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        return name;
    }
    public static String getLanguage() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose a language (en/es): ");
        String language = scanner.nextLine();
        scanner.close();
        return language;
    }

    public static void main(String[] args) {
        String name = getName();
        String language = getLanguage();
        greeter greeter;
        if (language.equals("es")) {
            greeter = new SpanishGreeter();
        } else {
            greeter = new EnglishGreeter();
        }
        greeter.greet(name);

    

    }
}
