package com.patterns.memento;

public class Main {

	public static void main(String[] args) {
		Editor editor = new Editor();
		editor.setContent("a");
		editor.setContent("b");
		editor.setContent("c");
//		editor.undo();
	}
}
