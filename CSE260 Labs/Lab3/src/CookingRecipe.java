import java.util.ArrayList;

public class CookingRecipe {
	private String name;
	private ArrayList<RecipeIngredient> ingredients = new ArrayList<RecipeIngredient>();
	public CookingRecipe(String name) {
		this.name = name;
		ingredients = null;
	}
	public void addOrUpdateRecipeIngredient(Ingredient ingredient, float quantity)
	{
		RecipeIngredient test = new RecipeIngredient(ingredient.getName(), ingredient.getMeasuringUnit(), ingredient.getCaloriesPerUnit(), quantity);
		if(ingredients.contains(test))
		{
			ingredients.get(ingredients.indexOf(ingredient)).setQuantity(quantity);
		}
		else
		{
			ingredients.add(test);
		}
	}
	public RecipeIngredient getRecipeIngredient(Ingredient ingredient)
	{
		for(int l = 0; l<ingredients.size(); l++)
			if(ingredients.get(l).equals(ingredient))
				return ingredients.get(l);
		return null;
	}
	public RecipeIngredient getRecipeIngredient(String ingredientName)
	{
		for(int i = 0; i<ingredients.size(); i++)
		{
			if(ingredients.get(i).getName().equals(ingredientName))
					return ingredients.get(i);
		}
		return null;
	}
	public RecipeIngredient removeRecipeIngredient(Ingredient ingredient)
	{
		for(int l = 0; l<ingredients.size(); l++)
			if(ingredients.get(l).equals(ingredient))
			   ingredients.remove(ingredients.get(l));
		return null;
	}
	public RecipeIngredient removeRecipeIngredient(String ingredientName)
	{
		for(int i = 0; i<ingredients.size(); i++)
		{
			if(ingredients.get(i).getName().equals(ingredientName))
			{
					ingredients.remove(ingredients.get(i));
					return ingredients.get(i);
			}
		}
		return null;
	}
	public String getName()
	{
		return name;
	}
	public float calculateCalories()
	{
		float totalCalories = 0;
		for(int k =0; k<ingredients.size(); k++)
		{
			totalCalories += ingredients.get(k).getQuantity();
		}
		return totalCalories;
	}
	
	public int getNumberOfIngredients()
	{
		return ingredients.size();
	}
	
	public boolean containsIngredients(Ingredient[] ingredientList)
	{
		boolean containsAll = true;
		for(int m = 0; m<ingredients.size(); m++)
			if(!ingredients.contains(ingredientList[m]))
				containsAll = false;
		return containsAll;
			
	}
	
	public String toString()
	{
		String cookingRecipe = "";
		cookingRecipe += (name + " Recipe:");
		for(int j = 0; j<ingredients.size(); j++)
			cookingRecipe+=(ingredients.get(j));
		return cookingRecipe;
	}

}
