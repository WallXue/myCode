package com.hp.workflow.datasource;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
public class WorkflowDataSourceConfig {

    @Bean
    public DataSource workflowDataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUrl("jdbc:mysql://172.16.2.188:3310/jbpm");
        druidDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        druidDataSource.setUsername("jbpm");
        druidDataSource.setPassword("jbpm");
        return druidDataSource;
    }

    @Bean(name = "entityManagerFactoryWorkflow")
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryWorkflow() {
        LocalContainerEntityManagerFactoryBean entityManagerFactory =
                new LocalContainerEntityManagerFactoryBean();

        entityManagerFactory.setDataSource(workflowDataSource());

        entityManagerFactory.setPersistenceUnitName("WorkflowPersistenceUnit");

        return entityManagerFactory;
    }

    @Bean(name = "transactionManager")
    public JpaTransactionManager  transactionManagerWorkflow() {
        JpaTransactionManager transactionManager =
                new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(
                entityManagerFactoryWorkflow().getObject());
        return transactionManager;
    }

}
