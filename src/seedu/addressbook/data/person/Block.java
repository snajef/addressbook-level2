package seedu.addressbook.data.person;

public class Block {
	private String value;

	public Block(String value) {
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
		if (!(o instanceof Block)) {
			return false;
		}
		
		Block u = (Block) o;
		return (this.getValue() == null ? 
				u.getValue() == null : this.getValue().equals(u.getValue()));
	}
}
