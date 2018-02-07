package org.poem.service;

import com.alibaba.dubbo.config.annotation.Reference;
import org.poem.api.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class DemoConsumer {

    private static Logger logger = LoggerFactory.getLogger(DemoConsumer.class);

    @Reference(
            interfaceClass = DemoService.class,
            version = "1.0.0",
            lazy = true
    )
    private DemoService demoService;

    public void sayHello() {
        String result = demoService.sayHello("DIDI ");
        logger.info(" consumer result : " + result);
    }
}
