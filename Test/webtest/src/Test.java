/**
 * @author sijt
 * @date 2018/11/23 15:00.
 */
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

public class Test {
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) throws Exception {
        File f=new File("D:\\JavaLogin\\TestProject\\webtest\\src\\test.txt");
        Properties p=new Properties();
        p.load(new FileInputStream(f));
        String className=(String)p.get("class");
        String methodName=(String)p.get("method");
        Class clazz=Class.forName(className);
        Method m=clazz.getMethod(methodName);
        Constructor c=clazz.getConstructor();
        Object o=c.newInstance();
        m.invoke(o);
    }
}
