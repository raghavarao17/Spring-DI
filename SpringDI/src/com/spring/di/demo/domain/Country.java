package com.spring.di.demo.domain;

public class Country
{

    String countryName;
    Capital capital;
    
    //Default
    public Country() {
		// TODO Auto-generated constructor stub
	}

    /*
     * Used defined , called parameterized  constructor
     */
    public Country( String countryName,
        Capital capital )
    {
        this.countryName = countryName;//India
        this.capital = capital;
    }

    public String getCountryName()
    {
        return countryName;
    }

    public Capital getCapital()
    {
        return capital;
    }
}