package seedu.addressbook.data.person;

public class Street {
	private String value;

	public Street(String value) {
		super();
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Street)) {
			return false;
		}
		
		Street u = (Street) o;
		return (this.getValue() == null ? 
				u.getValue() == null : this.getValue().equals(u.getValue()));
	}
}
