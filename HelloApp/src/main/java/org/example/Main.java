package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {
        String names = "World";
        if (args.length > 0) {
            names = String.join(", ", args);
        }
        System.out.println("Hello " + names + "!");
    }
}
