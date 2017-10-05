
public class RecipeIngredient extends Ingredient {
	private float quantity;

	public RecipeIngredient(String name, String measuringUnit, int caloriesPerUnit, float quantity) {
		super(name, measuringUnit, caloriesPerUnit);
		this.quantity = quantity;
	}

	public float getQuantity()
	{
		return quantity;
	}
	public boolean equals(Ingredient compare)
	{
		return(compare.equals(this));
	}
	public void setQuantity(float newQuantity) {
		quantity += newQuantity;
	}
	public String toString()
	{
		return super.toString() + "\n" + "Quantity= " + quantity;
	}
	
}
