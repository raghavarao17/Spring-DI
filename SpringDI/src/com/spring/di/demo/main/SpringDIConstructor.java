package com.spring.di.demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.di.demo.domain.Capital;
import com.spring.di.demo.domain.Country;

public class SpringDIConstructor
{

    public static void main( String[] args )
    {
    	System.out.println("args"+args[0]);
    	//Frist step to load the app-config or bean config details
    	//This is one way ..
        ApplicationContext appContext = new ClassPathXmlApplicationContext( "applicationContext.xml" );
        
        //It will load the country object and addition to that it will 
        //load the capital object by using the ref tag name
        Country countryObj = (Country) appContext.getBean("countryBean");
        
      //Generally when we are working with Object creation as follows
      //***************************************************
      Capital cp = new Capital();
      	cp.setCapitalName("Delhi");
      Country c = new Country("India",cp);

      c.getCountryName();
      c.getCapital().getCapitalName(); 
      //****************************************/
        
        
        String countryName = countryObj.getCountryName();
        String capitalName = countryObj.getCapital().getCapitalName();
        System.out.println( capitalName + " is capital of " + countryName );
    }
}

