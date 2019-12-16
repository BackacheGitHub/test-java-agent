package test;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.lang.reflect.InvocationTargetException;

@RestController
public class BeanController implements ApplicationContextAware {

    @Resource
    private ApplicationContext applicationContext;

    @RequestMapping("/test-tools/execute")
    public String execute(@RequestParam String beanName, @RequestParam String method) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Object bean = applicationContext.getBean(beanName);
        bean.getClass().getMethod(method).invoke(bean);
        return beanName;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println(applicationContext);
    }
}
