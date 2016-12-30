package com.spring.di.demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.di.demo.domain.State;

public class SpringDISetter
{

    public static void main( String[] args )
    {
        //When you working with any configuration file , First step is load the configuration file.
    	ApplicationContext appContext = new ClassPathXmlApplicationContext( "applicationContextSetter.xml" );
    	//Here am getting State bean and addition to that City bean also, because it ref the city bean
        State stateObj = (State) appContext.getBean( "stateBean" );
       
        //Communication to database and get the values here or 
        //from the client also we can get as per the MVC approach
        String stateName = stateObj.getStateName();
        String cityName = stateObj.getCity().getCityName();
        System.out.println( cityName + " is part of " + stateName + " State " );
    }
}