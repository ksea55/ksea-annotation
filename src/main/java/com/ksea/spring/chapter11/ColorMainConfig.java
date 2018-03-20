package com.ksea.spring.chapter11;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @PropertySource注解相当于在xml中的一下配置 <context:property-placeholder location="classpath:com/ksea/spring/chapter11/color.properties"/>
 * <p>
 * 当加载之后，配置文件中的K/V的键值对的值就加载到容器中,我们就可以通过${}的方式进行获取 如 @Value("${color.red=red}")
 */
@PropertySource(value = "classpath:com/ksea/spring/chapter11/color.properties")
@Configuration
public class ColorMainConfig {


    @Bean(value = "color")
    public Color color() {
        return new Color();
    }

}
