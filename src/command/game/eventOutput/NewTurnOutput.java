package command.game.eventOutput;

import IO.IOHandler;
import command.ICommandOutput;
import command.game.eventController.NewTurnController;

public class NewTurnOutput extends NewTurnController implements ICommandOutput {

	@Override
	public void init(String[] inputArray) {
		super.execute(inputArray);
		IOHandler.output.println("Player " + (idx + 1) + "'s turn");
	}

}
