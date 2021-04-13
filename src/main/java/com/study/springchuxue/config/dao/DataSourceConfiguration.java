package com.study.springchuxue.config.dao;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.beans.PropertyVetoException;


/**
 * @Description TODO
 * @Author Li jq
 * @Date 2021/4/11 22:37
 **/
@Configuration
public class DataSourceConfiguration {
      @Value("${jdbc.driver}")
	  private  String jdbcDriver;
	   @Value("${jdbc.url}")
	  private  String jdbculr;
	  @Value("${jdbc.username}")
	  private  String jdbcUsername;
	  @Value("${jdbc.password}")
	  private  String jdbcpassword;
    @Bean(name = "datasource")
	public ComboPooledDataSource dataSource() throws PropertyVetoException {
		ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();

		comboPooledDataSource.setDriverClass(jdbcDriver);

		comboPooledDataSource.setJdbcUrl(jdbculr);
		comboPooledDataSource.setUser(jdbcUsername);
		comboPooledDataSource.setPassword(jdbcpassword);
		comboPooledDataSource.setAutoCommitOnClose(false);
		return  comboPooledDataSource;

	}

}
