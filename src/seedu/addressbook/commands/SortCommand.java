package seedu.addressbook.commands;

import java.util.regex.Pattern;

public class SortCommand extends Command {
	public static final String COMMAND_WORD = "sort";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Sorts the Address Book by a given sort key. "
            + "Parameters: [index] [name] [email] [address]\n"
            + "Example: " + COMMAND_WORD
            + " name";
    
    private static final String[] KEYWORDS = new String[] {
    		"index",
    		"name",
    		"email",
    		"address"
    };
    
    // We create the Pattern to match our keywords (only one of the keywords)
    // based on the keywords we indicate.
    private static final StringBuilder KEYWORDS_ARGS_FORMAT_BUILDER;
    static {
    	KEYWORDS_ARGS_FORMAT_BUILDER = new StringBuilder();
    	KEYWORDS_ARGS_FORMAT_BUILDER.append("(?<keywords>\\b");
    	for (int i = 0; i < KEYWORDS.length; i++) {
    		KEYWORDS_ARGS_FORMAT_BUILDER.append(KEYWORDS[i]);
    		if (i == KEYWORDS.length - 1) {
    			KEYWORDS_ARGS_FORMAT_BUILDER.append("(?!.+)");
    		}
    		KEYWORDS_ARGS_FORMAT_BUILDER.append("(?!.+)|");
    	}
    	KEYWORDS_ARGS_FORMAT_BUILDER.append("\\b)");
    }
    
    // Matches exactly one of the keywords
    public static final Pattern KEYWORDS_ARGS_FORMAT = Pattern.compile(KEYWORDS_ARGS_FORMAT_BUILDER.toString());
    
    private final String sortKey;
    
    public SortCommand(String key) {
    	sortKey = key;
    }
    
    @Override
    public CommandResult execute() {
    	return new CommandResult("Sort command has not been implemented yet.");
    }
}
