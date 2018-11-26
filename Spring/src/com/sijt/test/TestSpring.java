package com.sijt.test;

/**
 * @author sijt
 * @date 2018/11/26 16:30.
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.sijt.service.ProductService;

public class TestSpring {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "Bean.xml" });
        ProductService s = (ProductService) context.getBean("s");
        s.doSomeService();
    }
}
