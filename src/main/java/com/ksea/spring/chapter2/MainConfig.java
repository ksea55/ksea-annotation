package com.ksea.spring.chapter2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Configuration //表明是注解配置类
/**@ComponentScan扫描包组件驱动，我们完全可以参照其xml配置它是对它的进一步的封装
 *
 */

//@ComponentScan(value ="com.ksea.spring.chapter2")  //默认是扫描其所有包
//@ComponentScan(value ="com.ksea.spring.chapter2",useDefaultFilters = true) //与上面等同

/*@ComponentScan(
        value = "com.ksea.spring.chapter2", useDefaultFilters = true,
        excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = {Controller.class})}
)

@ComponentScan(
        value = "com.ksea.spring.chapter2", useDefaultFilters = true,
        excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class})}
)*/

//上面两种方式是一样的结果，排除controller组件,在jdk8中是可以重复注解的


/*
@ComponentScan(
        value = "com.ksea.spring.chapter2", useDefaultFilters = false,
        includeFilters = {
                @ComponentScan.Filter(type = FilterType.ANNOTATION, value = Repository.class),
                @ComponentScan.Filter(type = FilterType.ANNOTATION, value = Service.class)}
)
*/

/*
@ComponentScan(
        value = "com.ksea.spring.chapter2", useDefaultFilters = false,
        includeFilters = {
                @ComponentScan.Filter(type = FilterType.ANNOTATION, value = {Repository.class, Service.class})
        }
)
*/

/*@ComponentScan(
        value = "com.ksea.spring.chapter2", useDefaultFilters = false,
        includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = Repository.class)}
)

@ComponentScan(
        value = "com.ksea.spring.chapter2", useDefaultFilters = false,
        includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = Service.class)}
)*/

// includeFilters 上面的3种方式是一样的

//当你使用的jdk是jdk8以下 需要多个配置扫描组件的方式可以使用componentScans

@ComponentScans(value = {
        @ComponentScan(
                value = "com.ksea.spring.chapter2", useDefaultFilters = false,
                includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = Repository.class)})
        , @ComponentScan(
        value = "com.ksea.spring.chapter2", useDefaultFilters = false,
        includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = Service.class)})
})
public class MainConfig {
}
