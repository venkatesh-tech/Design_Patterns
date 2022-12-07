package com.patterns.templatemethod;

public class Test {

	public static void main(String[] args) {

		DataRenderer renderer = new XMLDataRenderer(); // abstract class object cannot be created only a reference is
														// created
		renderer.render();
	}
}
