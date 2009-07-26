package cz.romario.opensudoku.game.command;

/**
 * Generic interface for command in application.
 * 
 * @author romario
 *
 */
public interface Command {
	/**
	 * Executes the command.
	 */
	void execute();
	/**
	 * Undo this command.
	 */
	void undo();
}