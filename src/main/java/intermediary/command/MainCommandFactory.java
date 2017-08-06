/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intermediary.command;

import view.interactor.MainConsoleInteractor;

/**
 *
 * @author Shaheen-Laptop
 */
public final class MainCommandFactory extends GenericCommandFactory{
    /* Factory pattern */
    public static MainCommandFactory init(MainConsoleInteractor interactor) {
        final MainCommandFactory command = new MainCommandFactory();
        command.addCommand(0, interactor::quitProcceed);
        command.addCommand(1, interactor::student);
        command.addCommand(2, interactor::score);
        command.addCommand(3, interactor::payment);
        command.addCommand(4, interactor::log);
        return command;
    }
}
