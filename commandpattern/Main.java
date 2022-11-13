package org.example.designpatterns.commandpattern;

public class Main {
    public static void main(String[] args) {
        Terminal terminal = new Terminal("Linux");
        terminal.executeCommand("mkdir abc");
        terminal.executeCommand("rmdir abc");
    }
}
