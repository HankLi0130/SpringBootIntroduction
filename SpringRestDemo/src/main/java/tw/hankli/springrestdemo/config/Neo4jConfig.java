package tw.hankli.springrestdemo.config;

import org.neo4j.ogm.config.Configuration;
import org.neo4j.ogm.session.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.data.neo4j.transaction.Neo4jTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@org.springframework.context.annotation.Configuration
@EnableNeo4jRepositories(basePackages = "tw.hankli.springrestdemo.repository")
@EnableTransactionManagement
public class Neo4jConfig {

    private final Environment env;

    @Autowired
    public Neo4jConfig(Environment env) {
        this.env = env;
    }

    @Bean
    public SessionFactory sessionFactory() {
        return new SessionFactory(configuration(), "tw.hankli.springrestdemo.model");
    }

    @Bean
    public Configuration configuration() {
        Configuration config = new Configuration();
        config
                .driverConfiguration()
                .setDriverClassName(env.getProperty("neo4j.driverClassName"))
                .setURI(env.getProperty("neo4j.url"));

        return config;
    }

    @Bean
    public Neo4jTransactionManager transactionManager() {
        return new Neo4jTransactionManager(sessionFactory());
    }
}
