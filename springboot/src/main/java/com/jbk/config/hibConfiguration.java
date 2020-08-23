package com.jbk.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import com.jbk.SpringDao.Employee;
@Configuration
public class hibConfiguration {

	@Autowired
	DataSource dataSource;
	
	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		//hib configuration file..
		System.out.println(dataSource);
		LocalSessionFactoryBean sessionFactory=new LocalSessionFactoryBean();
		sessionFactory.setAnnotatedClasses(Employee.class);
		sessionFactory.setDataSource(dataSource);
		
		
		return sessionFactory;
		
	}
}
