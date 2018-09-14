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
	
	public String username;
	public int userLegCount;
	public int userEyeCount;
	public boolean userNoses;
	public int userArmCount;

		//Default values are 0 or null :(
	public MarshmallowMonster(String name, String username) 
	{
		this.name = name;
		this.username = username;
	}
	public void userMonster(String username, int userLegCount, int userEyeCount, boolean userNoses, int userArmCount) {
		this.username = username;
		this.userArmCount = userArmCount;
		this.userEyeCount = userEyeCount;
		this.userNoses = userNoses;
		this.userLegCount = userLegCount;
	}
	public String userString() {
		String description = "Your monsters name is " + username + " they have " + userLegCount + " legs, " + userEyeCount + " eyes, " + userNoses + " Noses, and " + userArmCount + " arms." ;
	    return description;
	}
	public String userGetName() 
	{
		return username;
	}
	public int userGetLegCount() {
		return userLegCount;
	}
	public int userGetEyeCount() 
	{
		return eyeCount;
	}
	public boolean userGetHasNoses() {
		return userNoses;
	}
	public int userGetArmCount() {
		return userArmCount;
	}
    //Setters!
	public void SetUserName(String username) {
		this.username = username;
	}
	public void setUserLegCount(int userLegCount) {
		this.userLegCount = userLegCount;
	}
	public void setUserEyeCount(int userEyes) {
		this.userEyeCount = userEyes;
	}
	public void setUserNoses(boolean userHasNoses) {
		this.userNoses = userHasNoses;
	}
	public void setUserArmCount(int UserArms) {
		this.userArmCount = UserArms;
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
	public void setLegCount(int legs) {
		this.legCount = legs;
	}
	public void setEyeCount(int eyes) {
		this.eyeCount = eyes;
	}
	public void setHasNoses(boolean hasNoses) {
		this.hasNoses = hasNoses;
	}
	public void setArmCount(int arms) {
		this.armCount = arms;
	}
	
	
	
	
	public String toString()
	{
		String description = "My monsters name is " + name + "s/he/they has/have " + legCount + " legs, " + eyeCount + " eyes, " + hasNoses + " Noses, and has " + armCount + " arms." ;
		return description;
	}
}
