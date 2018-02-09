package tw.hankli.spring_demo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class DataSourceAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(DataSourceAspect.class);

    @Before("execution(* tw.hankli.spring_demo.service.Microservice1.sayHello(java.lang.String)) && args(name))")
    public void beforeSayHello(String name) {
        LOGGER.info("Aspect say hello: " + name);
    }
}
