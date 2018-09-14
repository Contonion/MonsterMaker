package controller;
import model.MarshmallowMonster;
import java.util.Scanner;

import javax.swing.JOptionPane;
public class MonsterController
{
	
	//Data member section
	private MarshmallowMonster myMonster;
	private MarshmallowMonster userMonster;
	//Constructor Section
	public void start()
	{
		JOptionPane.showMessageDialog(null, "Show message here :)");
		//Use this method instead of "System.out.println"
		System.out.println("What shall your monsters name be?");
		Scanner inputScanner = new Scanner(System.in);
		String answer = inputScanner.nextLine();
		JOptionPane.showMessageDialog(null, myMonster);
		JOptionPane.showMessageDialog(null, userMonster);
		
	}
	public MonsterController()
	{
		myMonster = new MarshmallowMonster("Stephen", 3, 2, false, 2);
		userMonster = new MarshmallowMonster("Dave", 79, 55, true, 3);
	}
	
	//methods section


}
