package com.yash.Entity;

public enum Level {
	BEGINNER(0),INTERMEDIATE(1),ADVANCED(2);
	private int level;
	Level(int level){
		this.level=level;
	}
	public int getLevel() {
		return level;
	}
	
}
