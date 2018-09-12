package controller;
import model.MarshmallowMonster;

public class MonsterController
{
	
	//Data member section
	private MarshmallowMonster myMonster;
	private MarshmallowMonster userMonster;
	//Constructor Section
	public MonsterController()
	{
		//Job 1: initialize data members!
		myMonster = new MarshmallowMonster("Stephen", 3, 2, false, 2);
		userMonster = new MarshmallowMonster("Jeff", 79, 55, true, 3);
	}
	
	//methods section
	public void start()
	{
		System.out.println(myMonster);
		myMonster.setArmCount(1);
		System.out.println("My monster has this many arms: " + myMonster.getArmCount());
		System.out.print(userMonster);
	}

}
