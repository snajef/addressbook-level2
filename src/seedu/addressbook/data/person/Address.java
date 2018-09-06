package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's address in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidAddress(String)}
 */
public class Address {

    public static final String EXAMPLE = "123, some street";
    public static final String MESSAGE_ADDRESS_CONSTRAINTS = "Person addresses can be in any format";
    public static final String ADDRESS_VALIDATION_REGEX = ".+";
    
    private final String encodedString;
    private final Block block;
    private final Street street;
    private final Unit unit;
    private final PostalCode postalCode;
    
    
    private boolean isPrivate;

    /**
     * Validates given address.
     *
     * @throws IllegalValueException if given address string is invalid.
     */
    public Address(String address, boolean isPrivate) throws IllegalValueException {
        String trimmedAddress = address.trim();
        this.isPrivate = isPrivate;
        if (!isValidAddress(trimmedAddress)) {
            throw new IllegalValueException(MESSAGE_ADDRESS_CONSTRAINTS);
        }
        
        encodedString = trimmedAddress;
        String[] splitAddress = trimmedAddress.split(", ");
        
        block = new Block(splitAddress.length > 0 ? splitAddress[0] : null);
        street = new Street(splitAddress.length > 1 ? splitAddress[1] : null);
        unit = new Unit(splitAddress.length > 2 ? splitAddress[2] : null);
        postalCode = new PostalCode(splitAddress.length > 3 ? splitAddress[3] : null);
    }

    /**
     * Returns true if a given string is a valid person address.
     */
    public static boolean isValidAddress(String test) {
        return test.matches(ADDRESS_VALIDATION_REGEX);
    }
    
    public String getEncodedString() {
    	return encodedString;
    }
    
    @Override
    public String toString() {
        return (block.getValue() == null ? "" : block.getValue()) 
        		+ (street.getValue() == null ? "" : ", ") 
        		+ (street.getValue() == null ? "" : street.getValue()) 
        		+ (unit.getValue() == null ? "" : ", ") 
        		+ (unit.getValue() == null ? "" : unit.getValue()) 
        		+ (postalCode.getValue() == null ? "" : ", ") 
        		+ (postalCode.getValue() == null ? "" : postalCode.getValue());
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Address // instanceof handles nulls
                && this.block.equals(((Address) other).block)
                && this.street.equals(((Address) other).street)
                && this.unit.equals(((Address) other).unit)
                && this.postalCode.equals(((Address) other).postalCode)); // state check
    }

    @Override
    public int hashCode() {
        return toString().hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
}
