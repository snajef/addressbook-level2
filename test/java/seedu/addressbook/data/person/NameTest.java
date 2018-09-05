package seedu.addressbook.data.person;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import seedu.addressbook.data.exception.IllegalValueException;

public class NameTest {
	private Name standard_FirstNameMiddleNameLastName;
	private Name irregularCap_FirstNameMiddleNameLastName;
	private Name allCaps_FirstNameMiddleNameLastName;
	
	private Name standard_LastNameFirstNameMiddleName;
	private Name irregularCap_LastNameFirstNameMiddleName;
	private Name allCaps_LastNameFirstNameMiddleName;
	
	private Name standard_LastNameFirstName;
	private Name irregularCap_LastNameFirstName;
	private Name allCaps_LastNameFirstName;
	
	private Name standard_FirstNameLastName;
	private Name irregularCap_FirstNameLastName;
	private Name allCaps_FirstNameLastName;
	
	private Name unrelatedName;
	
	@Before
	public void setUp() throws IllegalValueException {
		standard_FirstNameMiddleNameLastName = new Name("John K Smith");
		irregularCap_FirstNameMiddleNameLastName = new Name("JoHn K sMiTh");
		allCaps_FirstNameMiddleNameLastName = new Name("JOHN K SMITH");
		
		standard_LastNameFirstNameMiddleName = new Name("Smith John K");
		irregularCap_LastNameFirstNameMiddleName = new Name("SmItH jOhN K");
		allCaps_LastNameFirstNameMiddleName = new Name("SMITH JOHN K");
		
		standard_LastNameFirstName = new Name("Smith John");
		irregularCap_LastNameFirstName = new Name("SmItH jOhN");
		allCaps_LastNameFirstName = new Name("SMITH JOHN");
		
		standard_FirstNameLastName = new Name("John Smith");
		irregularCap_FirstNameLastName = new Name("JoHn SmItH");
		allCaps_FirstNameLastName = new Name("JOHN SMITH");
		
		unrelatedName = new Name("Mary Brown");
	}
	
	@Test
	public void isSimilar_standardFmlAndIrregularCapFml_true() {
		assertTrue(standard_FirstNameMiddleNameLastName.isSimilar(irregularCap_FirstNameMiddleNameLastName));
		assertTrue(irregularCap_FirstNameMiddleNameLastName.isSimilar(standard_FirstNameMiddleNameLastName));
	}
	
	@Test
	public void isSimilar_standardFmlAndAllCapsFml_true() {
		assertTrue(standard_FirstNameMiddleNameLastName.isSimilar(allCaps_FirstNameMiddleNameLastName));
		assertTrue(allCaps_FirstNameMiddleNameLastName.isSimilar(standard_FirstNameMiddleNameLastName));
	}
	
	@Test
	public void isSimilar_standardFmlAndStandardLmf_true() {
		assertTrue(standard_FirstNameMiddleNameLastName.isSimilar(standard_LastNameFirstNameMiddleName));
		assertTrue(standard_LastNameFirstNameMiddleName.isSimilar(standard_FirstNameMiddleNameLastName));
	}
	
	@Test
	public void isSimilar_standardFmlAndIrregularCapLmf_true() {
		assertTrue(standard_FirstNameMiddleNameLastName.isSimilar(irregularCap_LastNameFirstNameMiddleName));
		assertTrue(irregularCap_LastNameFirstNameMiddleName.isSimilar(standard_FirstNameMiddleNameLastName));
	}
	
	@Test
	public void isSimilar_standardFmlAndAllCapsLmf_true() {
		assertTrue(standard_FirstNameMiddleNameLastName.isSimilar(allCaps_LastNameFirstNameMiddleName));
		assertTrue(irregularCap_FirstNameMiddleNameLastName.isSimilar(standard_LastNameFirstNameMiddleName));
	}
	
	@Test
	public void isSimilar_standardFmlAndStandardFl_true() {
		assertTrue(standard_FirstNameMiddleNameLastName.isSimilar(standard_FirstNameLastName));
		assertTrue(standard_FirstNameLastName.isSimilar(standard_FirstNameMiddleNameLastName));
	}
	
	@Test
	public void isSimilar_standardFmlAndIrregularCapFl_true() {
		assertTrue(standard_FirstNameMiddleNameLastName.isSimilar(irregularCap_FirstNameLastName));
		assertTrue(irregularCap_FirstNameLastName.isSimilar(standard_FirstNameMiddleNameLastName));
	}
	
	@Test
	public void isSimilar_standardFmlAndAllCapsFl_true() {
		assertTrue(standard_FirstNameMiddleNameLastName.isSimilar(allCaps_FirstNameLastName));
		assertTrue(allCaps_FirstNameLastName.isSimilar(standard_FirstNameMiddleNameLastName));
	}
	
	@Test
	public void isSimilar_standardFmlAndStandardLf_true() {
		assertTrue(standard_FirstNameMiddleNameLastName.isSimilar(standard_LastNameFirstName));
		assertTrue(standard_LastNameFirstName.isSimilar(standard_FirstNameMiddleNameLastName));
	}
	
	@Test
	public void isSimilar_standardFmlAndIrregularCapLf_true() {
		assertTrue(standard_FirstNameMiddleNameLastName.isSimilar(irregularCap_LastNameFirstName));
		assertTrue(irregularCap_LastNameFirstName.isSimilar(standard_FirstNameMiddleNameLastName));
	}
	
	@Test
	public void isSimilar_standardFmlAndAllCapsLf_true() {
		assertTrue(standard_FirstNameMiddleNameLastName.isSimilar(allCaps_LastNameFirstName));
		assertTrue(allCaps_LastNameFirstName.isSimilar(standard_FirstNameMiddleNameLastName));
	}
	
	@Test
	public void isSimilar_standardFmlAndUnrelatedName_false() {
		assertFalse(standard_FirstNameMiddleNameLastName.isSimilar(unrelatedName));
		assertFalse(unrelatedName.isSimilar(standard_FirstNameMiddleNameLastName));
	}
}
