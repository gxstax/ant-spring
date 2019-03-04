package com.ant.config;

import com.ant.beannamegenerator.MyBeanNameGenerator;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.embedded.DataSourceFactory;

import javax.sql.DataSource;

/**
 * @author Ant
 * @ClassName: AppConfig
 * @Description: TODO
 * @datetime 2018/11/18 14:41
 * @Version 1.0
 */
@Configuration
//@ComponentScan(basePackages = "com.ant", nameGenerator = MyBeanNameGenerator.class)
@ComponentScan(basePackages = "com.ant")
//@ImportResource("classpath:spring.xml")
public class AppConfig {

//    @Bean
//    @Autowired
//    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource) {
//        SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
//        sessionFactoryBean.setDataSource(dataSource);
//        return sessionFactoryBean;
//    }
//
//    @Bean
//    public DataSource dataSource() {
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setUrl("");
//        dataSource.setUsername("");
//        dataSource.setPassword("");
//        dataSource.setDriverClassName("");
//        return dataSource;
//    }

}
