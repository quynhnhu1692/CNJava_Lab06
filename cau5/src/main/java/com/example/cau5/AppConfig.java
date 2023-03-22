package com.example.cau5;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.example.cau5")
@PropertySource("products.properties")
public class AppConfig {
}
