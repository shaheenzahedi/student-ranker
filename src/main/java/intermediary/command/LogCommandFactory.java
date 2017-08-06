/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intermediary.command;

import view.interactor.LogConsoleInteractor;

/**
 *
 * @author Shaheen-Laptop
 */
public class LogCommandFactory extends GenericCommandFactory {

    public static LogCommandFactory init(LogConsoleInteractor interactor) {
        final LogCommandFactory command = new LogCommandFactory();
        command.addCommand(0, interactor::back);
        command.addCommand(1, interactor::viewInsertions);
        command.addCommand(2, interactor::viewUpdates);
        command.addCommand(3, interactor::viewDeletes);
        command.addCommand(2, interactor::deleteLog);
        command.addCommand(3, interactor::viewAll);
        return command;
    }

}
