package controller;
import model.MarshmallowMonster;

public class MonsterController
{
	
	//Data member section
	private MarshmallowMonster myMonster;
	
	//Constructor Section
	public MonsterController()
	{
		//Job 1: initialize data members!
		myMonster = new MarshmallowMonster("Stephen", 3, 2, false, 2);
		
	}
	
	//methods section
	public void start()
	{
		System.out.println(myMonster);
	}

}
