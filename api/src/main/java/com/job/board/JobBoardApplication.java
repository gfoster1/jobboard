package com.job.board;

import com.mysql.cj.jdbc.MysqlDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

@SpringBootApplication
public class JobBoardApplication {

    public static void main(String[] args) {
        SpringApplication.run(JobBoardApplication.class, args);
    }

    @Bean
    public DataSource dataSource() {
        MysqlDataSource mysqlDataSource = new MysqlDataSource();
        mysqlDataSource.setDatabaseName("bountyjobs");
        mysqlDataSource.setPort(3306);
        mysqlDataSource.setPassword("password");
        mysqlDataSource.setUser("root");
        mysqlDataSource.setUrl("localhost");
        return mysqlDataSource;
    }

//	@Bean
//	SqlSessionFactoryBean sqlSessionFactoryBean() {
//		// Configure MyBatis here
//		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
//		sqlSessionFactoryBean.setD
//		return sqlSessionFactoryBean;
//	}

}
