package slash.code.spring6webapp.services;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware,
        BeanFactoryAware, ApplicationContextAware, BeanPostProcessor {


   private String javaVer;

   @Value("${java.specification.version}")
    public void setJavaVer(String javaVer) {
        this.javaVer = javaVer;
       System.out.println("##1 Property Set Java ver : "+this.javaVer);
    }

    public LifeCycleDemoBean(){
        System.out.println("I m in lifecycle bean constructor");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("##3 BeanFactory has been set  ");

    }

    @Override
    public void setBeanName(String name) {
        System.out.println("##2 BeanNameAware My Bean Name is : "+name);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("## destroy method has been called   ");
        System.out.println("##Disposable bean. destroy the 'lifeCycleBean' has been terminated");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("##6 afterPropertiesSet populate properties the 'lifeCycleBean' has been populated  ");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("##4 ApplicationContext has been set  ");
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization "+beanName);

        if(bean instanceof LifeCycleDemoBean){
            LifeCycleDemoBean demobean=(LifeCycleDemoBean) bean;
            System.out.println("calling before init");
            demobean.beforeInit();
        }
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization "+beanName);
        if(bean instanceof LifeCycleDemoBean){
            LifeCycleDemoBean demobean=(LifeCycleDemoBean) bean;
            System.out.println("calling after init");
            demobean.afterInit();
        }
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("##5 PostConstruct method has been called  ");
    }
    @PreDestroy
    public void preDestroy(){
        System.out.println("##7 @PreDestroy annotation & annotated method has been called   ");
    }
    public void beforeInit(){
        System.out.println("## before init called by bean post processor");
    }
    public void afterInit(){
        System.out.println("## After init called by bean post processor");
    }


}
