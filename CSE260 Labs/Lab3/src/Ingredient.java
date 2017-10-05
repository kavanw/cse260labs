
public class Ingredient {

	private String name, measuringUnit;
	private int caloriesPerUnit;
	public Ingredient(String name, 	String measuringUnit,int caloriesPerUnit) {
		this.name = name;
		this.measuringUnit = measuringUnit;
		this.caloriesPerUnit = caloriesPerUnit;
	}
	
	public boolean equals(Ingredient compare)
	{
		return(name.equals(compare.getName()) && measuringUnit.equals(compare.getMeasuringUnit()) && (caloriesPerUnit == compare.getCaloriesPerUnit()));
	}
	public String getName()
	{
		return name;
	}
	
	public String getMeasuringUnit()
	{
		return measuringUnit;
	}
	public int getCaloriesPerUnit()
	{
		return caloriesPerUnit;
	}
	public String toString()
	{
		String ingredientRep = "";
		ingredientRep ="Ingredient\n"+ "Name= " + name + "\n" +"MeasuringUnit= " + measuringUnit + 
				"\n" + "CaloriesPerUnit= "+ caloriesPerUnit;
		return ingredientRep;
	}

}
