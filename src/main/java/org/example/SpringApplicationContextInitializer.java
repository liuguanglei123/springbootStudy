package org.example;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

public class SpringApplicationContextInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        // 自己的逻辑实现

        // 例子1：通过硬编码的方式添加监听器
        /*EarlyListener earlyListener = new EarlyListener();
        applicationContext.addApplicationListener(earlyListener);

        // 例子2：通过硬编码的方式添加BeanFactoryPostProcessor
        MyBeanFactoryPostProcessor myBeanFactoryPostProcessor = new MyBeanFactoryPostProcessor();
        applicationContext.addBeanFactoryPostProcessor(myBeanFactoryPostProcessor);*/
    }
}
