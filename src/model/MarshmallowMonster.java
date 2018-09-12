package model;
public class MarshmallowMonster
{
	
	//Data Members Section
	//Always private
	
	private String name;
	private int legCount;
	private int eyeCount;
	private boolean hasNoses;
	private int armCount;
	
	public MarshmallowMonster()
	{
	}
		//Default values are 0 or null :(
	public MarshmallowMonster(String name) 
	{
		this.name = name;
	}
	public MarshmallowMonster(String name, int legCount, int eyeCount, boolean hasNoses, int armCount)

	{
		this.name = name;
		this.legCount = legCount;
		this.eyeCount = eyeCount;
		this.hasNoses = hasNoses;
		this.armCount = armCount;
		
	
	}
	
	//Getters
	public String getName() 
	{
		return name;
	}
	public int getLegCount() {
		return legCount;
	}
	public int getEyeCount() 
	{
		return eyeCount;
	}
	public boolean getHasNoses() {
		return hasNoses;
	}
	public int getArmCount() {
		return armCount;
	}
    //Setters!
	public void setName(String name) {
		this.name = name;
	}
	public void setLegCount(int legCount) {
		this.legCount = legCount;
	}
	public void getEyeCount(int eyeCount) {
		this.eyeCount = eyeCount;
	}
	public void getHasNoses(boolean hasNoses) {
		this.hasNoses = hasNoses;
	}
	public void getArmCount(int armCount) {
		this.armCount = armCount;
	}
	
	
	public String toString()
	{
		String description = "My monsters name is " + name + "s/he/they has/have " + legCount + " legs, " + eyeCount + " eyes, " + hasNoses + " Noses, and has " + armCount + "arms" ;
		return description;
	}
}
