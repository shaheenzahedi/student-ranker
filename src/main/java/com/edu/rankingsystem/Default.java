package com.edu.rankingsystem;

import java.util.Scanner;
import view.interactor.MainConsoleInteractor;
import intermediary.command.MainCommandFactory;

public class Default {

    public static void main(String[] args) {
        MainCommandFactory command = MainCommandFactory.init(new MainConsoleInteractor());
        while (true) {
            command.listCommands("Main Menu", new String[]{
                "Quit",
                "Student",
                "Score",
                "Payment",
                "Log"});
            command.executeCommand(new Scanner(System.in).nextInt());
        }

    }
}
