package com.spring.di.demo.domain;

public class State
{

    String stateName;
    City city;

    public String getStateName()
    {
        return stateName;
    }

    public void setStateName( String stateName )
    {
        this.stateName = stateName;
    }

    public City getCity()
    {
        return city;
    }

    public void setCity( City city )
    {
        this.city = city;
    }

}