/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intermediary.command;

import view.interactor.ScoreConsoleInteractor;

/**
 *
 * @author Shaheen-Laptop
 */
public class ScoreCommandFactory extends GenericCommandFactory {

    public static ScoreCommandFactory init(ScoreConsoleInteractor interactor) {
        final ScoreCommandFactory command = new ScoreCommandFactory();
        command.addCommand(0, interactor::back);
        command.addCommand(1, interactor::scoreUp);
        command.addCommand(2, interactor::scoreDown);
        command.addCommand(3, interactor::viewRanks);
        return command;
    }
}
