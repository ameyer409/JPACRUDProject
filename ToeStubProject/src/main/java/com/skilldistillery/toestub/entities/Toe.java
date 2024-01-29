package com.skilldistillery.toestub.entities;

public enum Toe {
		RIGHTBIGTOE("Right Big Toe"),
		RIGHTINDEXTOE("Right Index Toe"),
		RIGHTMIDDLETOE("Right Middle Toe"),
		RIGHTFORETOE("Right Fore Toe"),
		RIGHTPINKYTOE("Right Pinky Toe"),
		LEFTBIGTOE("Left Big Toe"),
		LEFTINDEXTOE("Left Index Toe"),
		LEFTMIDDLETOE("Left Middle Toe"),
		LEFTFORETOE("Left Fore Toe"),
		LEFTPINKYTOE("Left Pinky Toe");
	
		Toe(String toe){
			this.toe = toe;
		}
		final private String toe;
		
		@Override
		public String toString() {
			return toe;
		}
}
