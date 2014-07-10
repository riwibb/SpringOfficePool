package org.sallu.springdemo.officepool;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class RoundOne implements GameRound {
	private Team oEasternOne, oEasternTwo,oEasternThree, oEasternFour,
		oEasternFive,oEasternSix,oEasternSeven,oEasternEight,
		oWesternOne, oWesternTwo,oWesternThree, oWesternFour,
		oWesternFive,oWesternSix,oWesternSeven,oWesternEight;
	private PlayerRoundOne oPlayerOne,oPlayerTwo,oPlayerThree,oPlayerFour,
		oPlayerFive,oPlayerSix,oPlayerSeven,oPlayerEight;
	
	public Team getoEasternOne() {
		return oEasternOne;
	}
	@Autowired
	@Qualifier("E1")
	public void setoEasternOne(Team oEasternOne) {
		this.oEasternOne = oEasternOne;
	}

	public Team getoEasternTwo() {
		return oEasternTwo;
	}
	@Autowired
	@Qualifier("E2")
	public void setoEasternTwo(Team oEasternTwo) {
		this.oEasternTwo = oEasternTwo;
	}

	public Team getoEasternThree() {
		return oEasternThree;
	}
	@Autowired
	@Qualifier("E3")
	public void setoEasternThree(Team oEasternThree) {
		this.oEasternThree = oEasternThree;
	}

	public Team getoEasternFour() {
		return oEasternFour;
	}
	@Autowired
	@Qualifier("E4")
	public void setoEasternFour(Team oEasternFour) {
		this.oEasternFour = oEasternFour;
	}

	public Team getoEasternFive() {
		return oEasternFive;
	}
	@Autowired
	@Qualifier("E5")
	public void setoEasternFive(Team oEasternFive) {
		this.oEasternFive = oEasternFive;
	}

	public Team getoEasternSix() {
		return oEasternSix;
	}
	@Autowired
	@Qualifier("E6")
	public void setoEasternSix(Team oEasternSix) {
		this.oEasternSix = oEasternSix;
	}

	public Team getoEasternSeven() {
		return oEasternSeven;
	}
	@Autowired
	@Qualifier("E7")
	public void setoEasternSeven(Team oEasternSeven) {
		this.oEasternSeven = oEasternSeven;
	}

	public Team getoEasternEight() {
		return oEasternEight;
	}
	@Autowired
	@Qualifier("E8")
	public void setoEasternEight(Team oEasternEight) {
		this.oEasternEight = oEasternEight;
	}

	public Team getoWesternOne() {
		return oWesternOne;
	}
	@Autowired
	@Qualifier("W1")
	public void setoWesternOne(Team oWesternOne) {
		this.oWesternOne = oWesternOne;
	}

	public Team getoWesternTwo() {
		return oWesternTwo;
	}
	@Autowired
	@Qualifier("W2")
	public void setoWesternTwo(Team oWesternTwo) {
		this.oWesternTwo = oWesternTwo;
	}

	public Team getoWesternThree() {
		return oWesternThree;
	}
	@Autowired
	@Qualifier("W3")
	public void setoWesternThree(Team oWesternThree) {
		this.oWesternThree = oWesternThree;
	}

	public Team getoWesternFour() {
		return oWesternFour;
	}
	@Autowired
	@Qualifier("W4")
	public void setoWesternFour(Team oWesternFour) {
		this.oWesternFour = oWesternFour;
	}

	public Team getoWesternFive() {
		return oWesternFive;
	}
	@Autowired
	@Qualifier("W5")
	public void setoWesternFive(Team oWesternFive) {
		this.oWesternFive = oWesternFive;
	}

	public Team getoWesternSix() {
		return oWesternSix;
	}
	@Autowired
	@Qualifier("W6")
	public void setoWesternSix(Team oWesternSix) {
		this.oWesternSix = oWesternSix;
	}

	public Team getoWesternSeven() {
		return oWesternSeven;
	}
	@Autowired
	@Qualifier("W7")
	public void setoWesternSeven(Team oWesternSeven) {
		this.oWesternSeven = oWesternSeven;
	}

	public Team getoWesternEight() {
		return oWesternEight;
	}
	@Autowired
	@Qualifier("W8")
	public void setoWesternEight(Team oWesternEight) {
		this.oWesternEight = oWesternEight;
	}

	public Player getoPlayerOne() {
		return oPlayerOne;
	}
	@Autowired
	@Qualifier("P1")
	public void setoPlayerOne(PlayerRoundOne oPlayerOne) {
		this.oPlayerOne = oPlayerOne;
	}

	public Player getoPlayerTwo() {
		return oPlayerTwo;
	}
	@Autowired
	@Qualifier("P2")
	public void setoPlayerTwo(PlayerRoundOne oPlayerTwo) {
		this.oPlayerTwo = oPlayerTwo;
	}

	public Player getoPlayerThree() {
		return oPlayerThree;
	}
	@Autowired
	@Qualifier("P3")
	public void setoPlayerThree(PlayerRoundOne oPlayerThree) {
		this.oPlayerThree = oPlayerThree;
	}

	public Player getoPlayerFour() {
		return oPlayerFour;
	}
	@Autowired
	@Qualifier("P4")
	public void setoPlayerFour(PlayerRoundOne oPlayerFour) {
		this.oPlayerFour = oPlayerFour;
	}

	public Player getoPlayerFive() {
		return oPlayerFive;
	}
	@Autowired
	@Qualifier("P5")
	public void setoPlayerFive(PlayerRoundOne oPlayerFive) {
		this.oPlayerFive = oPlayerFive;
	}

	public Player getoPlayerSix() {
		return oPlayerSix;
	}
	@Autowired
	@Qualifier("P6")
	public void setoPlayerSix(PlayerRoundOne oPlayerSix) {
		this.oPlayerSix = oPlayerSix;
	}

	public Player getoPlayerSeven() {
		return oPlayerSeven;
	}
	@Autowired
	@Qualifier("P7")
	public void setoPlayerSeven(PlayerRoundOne oPlayerSeven) {
		this.oPlayerSeven = oPlayerSeven;
	}

	public Player getoPlayerEight() {
		return oPlayerEight;
	}
	@Autowired
	@Qualifier("P8")
	public void setoPlayerEight(PlayerRoundOne oPlayerEight) {
		this.oPlayerEight = oPlayerEight;
	}

	@Override
	public void setUpRound() {
		// TODO Assign teams to players
		this.oPlayerOne.setEasternTeam(1);
		this.oPlayerOne.setWesternTeam(9);
		this.oPlayerTwo.setEasternTeam(2);
		this.oPlayerTwo.setWesternTeam(10);
		this.oPlayerThree.setEasternTeam(3);
		this.oPlayerThree.setWesternTeam(11);
		this.oPlayerFour.setEasternTeam(4);
		this.oPlayerFour.setWesternTeam(12);
		this.oPlayerFive.setEasternTeam(5);
		this.oPlayerFive.setWesternTeam(13);
		this.oPlayerSix.setEasternTeam(6);
		this.oPlayerSix.setWesternTeam(14);
		this.oPlayerSeven.setEasternTeam(7);
		this.oPlayerSeven.setWesternTeam(15);
		this.oPlayerEight.setEasternTeam(8);
		this.oPlayerEight.setWesternTeam(16);
		//Done assigning
	}
	public String getTeamNameFromID(int teamID)
	{
		if (oEasternOne.getTeamID() == teamID )
			return oEasternOne.getTeamName();
		if (oEasternTwo.getTeamID() == teamID )
			return oEasternTwo.getTeamName();
		if (oEasternThree.getTeamID() == teamID )
			return oEasternThree.getTeamName();
		if (oEasternFour.getTeamID() == teamID )
			return oEasternFour.getTeamName();
		if (oEasternFive.getTeamID() == teamID )
			return oEasternFive.getTeamName();
		if (oEasternSix.getTeamID() == teamID )
			return oEasternSix.getTeamName();
		if (oEasternSeven.getTeamID() == teamID )
			return oEasternSeven.getTeamName();
		if (oEasternEight.getTeamID() == teamID )
			return oEasternEight.getTeamName();
		if (oWesternOne.getTeamID() == teamID )
			return oWesternOne.getTeamName();
		if (oWesternTwo.getTeamID() == teamID )
			return oWesternTwo.getTeamName();
		if (oWesternThree.getTeamID() == teamID )
			return oWesternThree.getTeamName();
		if (oWesternFour.getTeamID() == teamID )
			return oWesternOne.getTeamName();
		if (oWesternFive.getTeamID() == teamID )
			return oWesternFive.getTeamName();
		if (oWesternSix.getTeamID() == teamID )
			return oWesternSix.getTeamName();
		if (oWesternSeven.getTeamID() == teamID )
			return oWesternSeven.getTeamName();
		if (oWesternEight.getTeamID() == teamID )
			return oWesternEight.getTeamName();
		return "";
	}

	@Override
	public String toString() {
		return "RoundOne Composition - \n"
				+ "[Player : " + oPlayerOne.getPlayerName() + ", Teams - " 
				+ this.getTeamNameFromID(oPlayerOne.getEasternTeam()) + " & "  
				+ this.getTeamNameFromID(oPlayerOne.getWesternTeam()) 
				+" ]\n"
				+ "[Player : " + oPlayerTwo.getPlayerName() + ", Teams - " 
				+ this.getTeamNameFromID(oPlayerTwo.getEasternTeam()) + " & " 
				+ this.getTeamNameFromID(oPlayerTwo.getWesternTeam()) 
				+" ]\n"
				+ "[Player : " + oPlayerThree.getPlayerName() + ", Teams - " 
				+ this.getTeamNameFromID(oPlayerThree.getEasternTeam()) + " & " 
				+ this.getTeamNameFromID(oPlayerThree.getWesternTeam()) 
				+" ]\n"				
				+ "[Player : " + oPlayerFour.getPlayerName() + ", Teams - " 
				+ this.getTeamNameFromID(oPlayerFour.getEasternTeam()) + " & " 
				+ this.getTeamNameFromID(oPlayerFour.getWesternTeam()) 
				+" ]\n"
				+ "[Player : " + oPlayerFive.getPlayerName() + ", Teams - " 
				+ this.getTeamNameFromID(oPlayerFive.getEasternTeam()) + " & " 
				+ this.getTeamNameFromID(oPlayerFive.getWesternTeam()) 
				+" ]\n"	
				+ "[Player : " + oPlayerSix.getPlayerName() + ", Teams - " 
				+ this.getTeamNameFromID(oPlayerSix.getEasternTeam())  + " & "
				+ this.getTeamNameFromID(oPlayerSix.getWesternTeam()) 
				+" ]\n"	
				+ "[Player : " + oPlayerSeven.getPlayerName() + ", Teams - " 
				+ this.getTeamNameFromID(oPlayerSeven.getEasternTeam()) + " & " 
				+ this.getTeamNameFromID(oPlayerSeven.getWesternTeam()) 
				+" ]\n"	
				+ "[Player : " + oPlayerEight.getPlayerName() + ", Teams - " 
				+ this.getTeamNameFromID(oPlayerEight.getEasternTeam()) + " & " 
				+ this.getTeamNameFromID(oPlayerEight.getWesternTeam()) 
				+" ]\n"	
				;
	}

}
