package seedu.addressbook.commands;


/**
 * Represents an incorrect command. Upon execution, produces some feedback to the user.
 */
public class IncorrectCommand extends Command {
	
	/** The feedback message to be shown to the user. */
    private final String feedbackToUser;
    
    /**
     * Returns the feedback message to be shown to the user.
     */
    public String getFeedbackToUser() {
		return feedbackToUser;
	}

	public IncorrectCommand(String feedbackToUser) {
        this.feedbackToUser = feedbackToUser;
    }

    @Override
    public CommandResult execute() {
        return new CommandResult(feedbackToUser);
    }

}
