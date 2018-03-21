package com.ksea.spring.chapter13;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.util.StringValueResolver;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

//加载properties文件
@PropertySource(value = {"classpath:com/ksea/spring/chapter13/db.properties"})
@Configuration
public class ProfileMainConfig implements EmbeddedValueResolverAware {

    @Value("${db.user}") //第一种方式通过@Value注解从环境变量中获取值
    private String user;

    //第三种方式通过值解释器进行获取,实现其EmbeddedValueResolverAware接口
    private String driverclass;

    @Override
    public void setEmbeddedValueResolver(StringValueResolver resolver) {
        //通过解释器进行
        this.driverclass = resolver.resolveStringValue("${db.driver}");
    }


    @Profile("test")
    @Bean(value = "testDatasource")
    public DataSource testDatasource(@Value("${db.pwd}") String pwd) throws PropertyVetoException { //第二种方式 通过参数的方式注入值

        //使用c3p0数据源
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser(user);
        dataSource.setPassword(pwd);
        dataSource.setJdbcUrl("mysql:jdbc://localhost:3302/test");
        dataSource.setDriverClass(driverclass);
        return dataSource;
    }

    @Profile("dev")
    @Bean(value = "devDatasource")
    public DataSource devDatasource(@Value("${db.pwd}") String pwd) throws PropertyVetoException { //第二种方式 通过参数的方式注入值

        //使用c3p0数据源
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser(user);
        dataSource.setPassword(pwd);
        dataSource.setJdbcUrl("mysql:jdbc://localhost:3302/dev");
        dataSource.setDriverClass(driverclass);
        return dataSource;
    }

    @Profile(value = {"pro"})
    @Bean(value = "proDatasource")
    public DataSource proDatasource(@Value("${db.pwd}") String pwd) throws PropertyVetoException { //第二种方式 通过参数的方式注入值

        //使用c3p0数据源
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser(user);
        dataSource.setPassword(pwd);
        dataSource.setJdbcUrl("mysql:jdbc://localhost:3302/pro");
        dataSource.setDriverClass(driverclass);
        return dataSource;
    }


}
