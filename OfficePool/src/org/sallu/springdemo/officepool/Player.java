package org.sallu.springdemo.officepool;

import org.springframework.beans.factory.annotation.Required;

public class Player {
	
	private String playerName;

	public String getPlayerName() {
		return playerName;
	}
	@Required
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	@Override
	public String toString() {
		return playerName;
	}
}
