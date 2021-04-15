package com.study.springchuxue.config.dao;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.activation.DataSource;

/**
 * @Description TODO
 * @Author Li jq
 * @Date 2021/4/15 21:15
 **/
@Configuration
public class SessionFactoryConfiguration {

        //mybayisconfig.xml配置文件路径
        @Value("${mybatis_config_file}")
        private  String  mybatisconfigFilePath;
        //mybatis mapper文件所在路径
        @Value("${mapper_path}")
        private  String  mapperPath;
        //实体类所在包
        @Value("${entiy_package}")
        private  String  entiyPackage;
        //数据源
        @Autowired
        @Qualifier(value = "dataSource")
        private DataSource dataSource;

        @Bean(name = "sqlSessionFactory")
        public SqlSessionFactoryBean creatsqlSessionFactoryBean(){
            //实例化sqlsessionFactory对象
            SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
            //设置mybatisconfig.xml的路径
            sqlSessionFactoryBean.setConfigLocation(new ClassPathResource(mybatisconfigFilePath));
            //mapper的配置 实现dao层 文件流的处理都离不开resolver方法
            PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
            //定位mapper文件
            String packagePath= PathMatchingResourcePatternResolver.CLASSPATH_ALL_URL_PREFIX+ mapperPath;
            //用sqlsessionfactory 设置mapper来获取路径
            sqlSessionFactoryBean.setMapperLocations(resolver.getResource(packagePath));
            //设置datasource
            /*sqlSessionFactoryBean.setDataSource(dataSource);*/
            sqlSessionFactoryBean.setDataSource((javax.sql.DataSource) dataSource);
            //设置扫描实体类
            sqlSessionFactoryBean.setTypeAliasesPackage(entiyPackage);
            return  sqlSessionFactoryBean;
        }

}
