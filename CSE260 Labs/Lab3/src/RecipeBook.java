import java.util.ArrayList;

public class RecipeBook {
	private String bookName;
	private ArrayList<CookingRecipe> recipes = new ArrayList<CookingRecipe>();

	public RecipeBook(String bookName) {
		this.bookName = bookName;
	}

	public CookingRecipe addRecipe(String name, RecipeIngredient[] ingredients) {
		for (CookingRecipe a : recipes) {
			if (a.getName().equals(name)) {
				return null;
			}
		}

		CookingRecipe newRecipe = new CookingRecipe(name);
		for (int l = 0; l < ingredients.length; l++) {
			newRecipe.addOrUpdateRecipeIngredient(ingredients[l], ingredients[l].getQuantity());
		}
		return newRecipe;
	}

	public CookingRecipe removeRecipe(String name) {
		for (int i = 0; i < recipes.size(); i++) {
			if (recipes.get(i).getName().equals(name)) {
				recipes.remove(i);
				return recipes.get(i);
			}
		}
		return null;
	}

	public CookingRecipe[] findRecipes(RecipeIngredient[] ingredients) {
		int place = 0;
		CookingRecipe[] same = new CookingRecipe[recipes.size()];
		for (int k = 0; k < recipes.size(); k++) {
			if (recipes.get(k).containsIngredients(ingredients)) {
				same[place] = recipes.get(k);
				place++;
			}
		}
		return same;
	}

	public CookingRecipe[] findRecipesWithFewIngredients(int numberOfIngredients)
	{
		int hold = 0;
		CookingRecipe[] less = new CookingRecipe[recipes.size()];
		for(int y = 0; y<recipes.size(); y++)
		{
			if(recipes.get(y).getNumberOfIngredients()<numberOfIngredients))
{
				less[hold] = recipes.get(y);
				hold++;
}
		}
		return less;
	}

}
