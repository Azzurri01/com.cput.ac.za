package com.cput.ac.za;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class SpringClass
{
    @Bean(name="Typical")

    public CalculatorInterface getService()
    {
        return new CalculatorInterfaceImplementation();
    }
}
