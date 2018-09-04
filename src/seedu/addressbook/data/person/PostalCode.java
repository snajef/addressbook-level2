package seedu.addressbook.data.person;

public class PostalCode {
	private String value;
	
	public PostalCode(String value) {
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
		if (!(o instanceof PostalCode)) {
			return false;
		}
		
		PostalCode u = (PostalCode) o;
		return (this.getValue() == null ? 
				u.getValue() == null : this.getValue().equals(u.getValue()));
	}
}
