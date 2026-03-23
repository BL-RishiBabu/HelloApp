package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {
        StringBuilder nameBuilder = new StringBuilder();
        String name_s = "";
        boolean first = true;
        for (String name: args) {
            if (!first) {
                nameBuilder.append(", ");
            }
            nameBuilder.append(name);
            first = false;
        }
        name_s = nameBuilder.toString();
        System.out.println("Hello, " + name_s + "!");
    }
}
