/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.interactor;

import java.util.Scanner;
import intermediary.command.LogCommandFactory;
import intermediary.command.PaymentCommandFactory;
import intermediary.command.ScoreCommandFactory;
import intermediary.command.StudentCommandFactory;

/**
 *
 * @author Shaheen-Laptop
 */
public class MainConsoleInteractor {

    Scanner scanner;

    public MainConsoleInteractor() {
        scanner = new Scanner(System.in);
    }

    public void quitProcceed() {
        intermediary.util.Utility.exitSystem();
    }

    public void student() {

        StudentCommandFactory command
                = StudentCommandFactory.init(new StudentConsoleInteractor());
        command.listCommands("Student Related Operations", new String[]{
            "Back",
            "Add",
            "Update",
            "Search",
            "Delete",
            "Observe All Students"});
        command.executeCommand(scanner.nextInt());
    }

    public void score() {
        ScoreCommandFactory command
                = ScoreCommandFactory.init(new ScoreConsoleInteractor());
        command.listCommands("Score Management", new String[]{
            "Back",
            "Score Up",
            "Score Down",
            "View Ranks"});
        command.executeCommand(scanner.nextInt());
    }

    public void payment() {
        PaymentCommandFactory command
                = PaymentCommandFactory.init(new PaymentConsoleInteractor());
        command.listCommands("Payment Management", new String[]{
            "Back",
            "Recieve Monthly Payment",
            "Change Base Payment Price",
            "View Payments"});
        command.executeCommand(scanner.nextInt());
    }

    public void log() {
        LogCommandFactory command
                = LogCommandFactory.init(new LogConsoleInteractor());
        command.listCommands("Log Management", new String[]{
            "Back",
            "Delete Log",
            "View Update Logs",
            "View Insert Logs", 
            "View Delete Logs",
            "View All Log"});
        command.executeCommand(scanner.nextInt());
    }

}
