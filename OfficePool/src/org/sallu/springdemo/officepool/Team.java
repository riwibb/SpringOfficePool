package org.sallu.springdemo.officepool;

import org.springframework.beans.factory.annotation.Required;

public class Team {
	private int teamID;
	private String teamName;
	public int getTeamID() {
		return teamID;
	}
	@Required
	public void setTeamID(int teamID) {
		this.teamID = teamID;
	}
	public String getTeamName() {
		return teamName;
	}
	@Required
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	@Override
	public String toString() {
		return teamName;
	}
}
