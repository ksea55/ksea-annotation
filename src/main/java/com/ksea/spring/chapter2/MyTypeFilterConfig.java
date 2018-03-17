package com.ksea.spring.chapter2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        value = "com.ksea.spring.chapter2",
        useDefaultFilters = true,
        includeFilters = {@ComponentScan.Filter(type = FilterType.CUSTOM, value = MyTypeFilter.class)}
)
public class MyTypeFilterConfig {


}
