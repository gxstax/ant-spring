package com.ant.proxy.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * @author gaoxx gaoxx@fxiaoke.com
 * @ClassName: AppConfig
 * @Description: TODO
 * @datetime 2018/11/5 8:17
 * @Version 1.0
 */
@Configuration
@ComponentScan("com.ant")
@MapperScan("com.ant")
public class AppConfig {
    @Bean
    @Autowired
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource) {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        return bean;
    }

    @Bean("dataSource")
    public DataSource dataSource () {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/mybatisTest");
        dataSource.setPassword("root");
        dataSource.setUsername("root");
        return dataSource;
    }
}
