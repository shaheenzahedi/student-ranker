/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intermediary.command;

import java.util.HashMap;
import intermediary.util.Utility;

/**
 *
 * @author Shaheen-Laptop
 */
public abstract class GenericCommandFactory {

    private final HashMap<Integer, ICommand> commands;

    public void listCommands(String title, String[] menu) {
        Utility.titleViewer(title);
        Utility.menuViewer(menu);
    }

    public GenericCommandFactory() {
        commands = new HashMap<>();
    }

    public void addCommand(final Integer name, final ICommand command) {
        commands.put(name, command);
    }

    public void executeCommand(Integer name) {
        intermediary.util.Utility.clearScreen();
        if (commands.containsKey(name)) {
            commands.get(name).apply();
        }
    }
}
