package org.example;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Service
@Data
public class OneBean {

    public String name = "123456";

    @Resource
    private ApplicationEventPublisher publisher;

    @Autowired
    public void setTwoBean(List<BeanInterface> twoBean){
        this.twoBean = twoBean.get(0);
        log.info("setTwoBean");
    }

    private BeanInterface twoBean;

    @Scheduled(initialDelay = 1000,fixedDelay=100000)
    public void publishEvent(){
        log.info("test start");
        publisher.publishEvent(new TestEvent(1));
    }

    public void print(String a,String b){
        System.out.println(a + b);
    }

    public void print(String a){
        System.out.println(a);
    }
}