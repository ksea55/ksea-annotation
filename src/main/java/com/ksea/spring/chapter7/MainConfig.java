package com.ksea.spring.chapter7;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import(value = {MyImportSelector.class})
@Configuration
public class MainConfig {


}
