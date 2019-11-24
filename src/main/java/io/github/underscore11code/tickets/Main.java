package io.github.underscore11code.tickets;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hey!");
        System.out.println("I'm a spigot plugin");
        System.out.println("Don't run me directly, put me in your plugin folder");
        if(args[0].equalsIgnoreCase("true")){new Tickets();}
    }
}
