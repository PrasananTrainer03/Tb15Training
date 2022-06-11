package com.java.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployTest {

	@Test
	public void testConstructors() {
		Employ employ = new Employ();
		assertNotNull(employ);
		Employ emp1 = new Employ(1, "Harshini", Gender.FEMALE, "Java", "Developer", 94244.22);
		assertEquals(1, emp1.getEmpno());
		assertEquals("Harshini", emp1.getName());
		assertEquals(Gender.FEMALE, emp1.getGender());
		assertEquals("Java", emp1.getDept());
		assertEquals("Developer", emp1.getDesig());
		assertEquals(94244.22,emp1.getBasic(), 0);
	}
	
	@Test
	public void testGettersAndSetters() {
		Employ emp1 = new Employ();
		emp1.setEmpno(1);
		emp1.setName("Harshini");
		emp1.setGender(Gender.FEMALE);
		emp1.setDept("Java");
		emp1.setDesig("Developer");
		emp1.setBasic(94244.22);
		assertEquals(1, emp1.getEmpno());
		assertEquals("Harshini", emp1.getName());
		assertEquals(Gender.FEMALE, emp1.getGender());
		assertEquals("Java", emp1.getDept());
		assertEquals("Developer", emp1.getDesig());
		assertEquals(94244.22,emp1.getBasic(), 0);
		
	}
	
}
