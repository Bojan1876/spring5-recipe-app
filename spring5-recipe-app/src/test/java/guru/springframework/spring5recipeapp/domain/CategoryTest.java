package guru.springframework.spring5recipeapp.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

class CategoryTest {
	
	Category category;
	
	public void setUp() {
		category = new Category();
	}

	@Test
	public void getId() throws Exception {
		Long idValue = 4L;
		category.setId(idValue);
		assertEquals(idValue, category.getId());
	}

	@Test
	public void getDescription() throws Exception {

	}

	@Test
	public void getRecipes() throws Exception {

	}

}
