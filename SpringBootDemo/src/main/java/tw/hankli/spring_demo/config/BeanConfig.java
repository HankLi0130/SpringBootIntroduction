package tw.hankli.spring_demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tw.hankli.spring_demo.datasource.MySQL;
import tw.hankli.spring_demo.datasource.Oracle;

@Configuration
public class BeanConfig {

    @Bean(name = "mySQL")
    public MySQL mySQL() {
        return new MySQL();
    }

    @Bean(name = "oracle")
    public Oracle oracle() {
        return new Oracle();
    }
}
