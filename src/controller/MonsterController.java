package controller;
import model.MarshmallowMonster;
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
		JOptionPane.showInputDialog("What shall your monsters name be?");
		//Scanner inputScanner = new Scanner(System.in);
		//String answer = inputScanner.nextLine();
		String userMonsterName = JOptionPane.showInputDialog(null, "Whats your monsters name??");
		String userNumber = JOptionPane.showInputDialog(null, "How many arms?");
		userMonster.SetUserName(userMonsterName);
		JOptionPane.showMessageDialog(null, myMonster);
		JOptionPane.showMessageDialog(null, "Your monster is named " + userMonster.userGetName() + " and they have" + userNumber + " Arms");
		JOptionPane.showMessageDialog(null, "your monster has" + userNumber + " Arms");
		//userMonster.SetUserName(answer);
		if (validInt(userNumber))
		{
			int arms = Integer.parseInt(userNumber);
			userMonster.setArmCount(arms);
		}
	}
	public MonsterController()
	{
		myMonster = new MarshmallowMonster("Stephen", 3, 2, false, 2);
		userMonster = new MarshmallowMonster("Dave", 9, 2, true, 3);
	}
	
	//methods section
	public boolean validInt(String maybeInt)
	{
		boolean isValid = false;
		
		try
		{
			Integer.parseInt(maybeInt);
			isValid = true;
		}
		catch(NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "Type an integer value like 826458723649875692386425...");
		}
		return isValid;
	}
	public boolean validDouble(String maybeDouble)
	{
		boolean isValid = false;
		try
		{
			Double.parseDouble(maybeDouble);
			isValid = true;
		}
		catch(NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "This requires a double value aka something with a .");
		}
		return isValid;
		
		
	}

}
