/**
 * @author sijt
 * @date 2018/11/23 17:16.
 */
import com.sijt.Idol;
import com.sijt.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
    public static void main(String[] args){
        ApplicationContext context=new ClassPathXmlApplicationContext(new String[]{"Bean.xml"});
//        Idol i=(Idol)context.getBean("lyj");
//        System.out.println(i.getName());
//        System.out.println(i.getAge());
        Product p = (Product) context.getBean("p");
        System.out.println(p.getName());
        System.out.println(p.getIdol().getName());
    }
}
