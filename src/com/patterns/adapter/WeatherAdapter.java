package com.patterns.adapter;

public class WeatherAdapter {

	public int findTemperature(int zipcode) {
		String city = null;

		if (zipcode == 19406) {
			city = "King of prussia";
		}

		WeatherFinder finder = new WeatherFinderImpl();
		int temperature = finder.find(city);

		return temperature;

	}
}
