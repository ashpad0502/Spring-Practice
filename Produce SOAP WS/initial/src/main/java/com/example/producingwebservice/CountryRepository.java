package com.example.producingwebservice;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

import io.spring.guides.gs_producing_web_service.Country;
import io.spring.guides.gs_producing_web_service.Currency;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
public class CountryRepository {
    private static final Map<String, Country> countries = new HashMap<>();

    @PostConstruct
    public void initData() {
        Country spain = new Country();
		spain.setName("Spain");
		spain.setCapital("Madrid");
		spain.setCurrency(Currency.EUR);
        spain.setPopulation(46704314);
        
        Country poland = new Country();
		poland.setName("Poland");
		poland.setCapital("Warsaw");
		poland.setCurrency(Currency.PLN);
        poland.setPopulation(38186860);
        
        Country uk = new Country();
		uk.setName("United Kingdom");
		uk.setCapital("London");
		uk.setCurrency(Currency.GBP);
        uk.setPopulation(63705000);
        
        Country us = new Country();
		us.setName("United States");
		us.setCapital("Washington DC");
		us.setCurrency(Currency.USD);
        us.setPopulation(328200000);
        
        Country india = new Country();
		india.setName("India");
		india.setCapital("New Delhi");
		india.setCurrency(Currency.INR);
        india.setPopulation(1352600000);
        
        Country australia = new Country();
		australia.setName("Australia");
		australia.setCapital("Canberra");
		australia.setCurrency(Currency.AUD);
        australia.setPopulation(25000000);
        
        Country brazil = new Country();
		brazil.setName("Brazil");
		brazil.setCapital("Rio De Janiero");
		brazil.setCurrency(Currency.BRL);
        brazil.setPopulation(209500000);
        
        Country china = new Country();
		china.setName("China");
		china.setCapital("Beijing");
		china.setCurrency(Currency.CNY);
        china.setPopulation(1392700000);
        
        Country japan = new Country();
		japan.setName("Japan");
		japan.setCapital("Tokyo");
		japan.setCurrency(Currency.JPY);
        japan.setPopulation(126500000);
        
        countries.put(spain.getName(), spain);
        countries.put(poland.getName(), poland);
        countries.put(uk.getName(), uk);
        countries.put(us.getName(), us);
        countries.put(india.getName(), india);
        countries.put(australia.getName(), australia);
        countries.put(brazil.getName(), brazil);
        countries.put(china.getName(), china);
        countries.put(japan.getName(), japan);

    }
    
    public Country findCountry(String name) {
		Assert.notNull(name, "The country's name must not be null");
		return countries.get(name);
	}
}