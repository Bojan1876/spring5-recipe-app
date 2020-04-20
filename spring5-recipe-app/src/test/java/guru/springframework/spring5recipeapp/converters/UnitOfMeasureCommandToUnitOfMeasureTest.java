package guru.springframework.spring5recipeapp.converters;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.aspectj.lang.annotation.Before;
import org.junit.Test;

import guru.springframework.spring5recipeapp.commands.UnitOfMeasureCommand;
import guru.springframework.spring5recipeapp.domain.UnitOfMeasure;

public class UnitOfMeasureCommandToUnitOfMeasureTest {

	public static final String DESCRIPTION = "description";
	public static final Long LONG_VALUE = new Long(1L);
	
	UnitOfMeasureCommandToUnitOfMeasure converter;
	
	@Before(value = "")
	public void setUp() throws Exception {
		converter = new UnitOfMeasureCommandToUnitOfMeasure();
	}
	
	@Test
	public void testNullParameter() throws Exception{
		assertNotNull(converter.convert(null));
	}
	
	@Test
	public void testEmptyObject() throws Exception{
		assertNotNull(converter.convert(new UnitOfMeasureCommand()));
	}
	
	@Test
	public void convert() throws Exception{
		UnitOfMeasureCommand command = new UnitOfMeasureCommand();
		command.setId(LONG_VALUE);
		command.setDescription(DESCRIPTION);
		
		UnitOfMeasure uom = converter.convert(command);
		assertNotNull(uom);
		assertEquals(LONG_VALUE, uom.getId());
		assertEquals(DESCRIPTION, uom.getDescription());
		
	}
	
}
