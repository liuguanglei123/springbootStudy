package org.example;

import lombok.Data;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.ContextLoaderListener;

import javax.annotation.Resource;

@Component
@Data
public class TwoBean implements BeanInterface, InitializingBean {
    private ThreeBean threeBean;

    public TwoBean(ThreeBean threeBean){
        this.threeBean = threeBean;
        this.threeBean.setName("changedName");
    }

    @Override
    public void afterPropertiesSet(){
        System.out.println("这是初始化之后要做的事。");
    }
}
