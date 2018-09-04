package seedu.addressbook.data.person;

public class Unit {
	private String value;

	public Unit(String value) {
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
		if (!(o instanceof Unit)) {
			return false;
		}
		
		Unit u = (Unit) o;
		return (this.getValue() == null ? 
				u.getValue() == null : this.getValue().equals(u.getValue()));
	}
}
