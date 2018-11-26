/**
 * @author sijt
 * @date 2018/11/23 11:59.
 */
import java.lang.reflect.Constructor;
public class TestReflection {
    public static void main(String[] args) {
//        String className = "Idol";
//        Idol i=new Idol();
//        i.name="yingtai";
//        System.out.println(i);
        try {
            //使用反射的方式创建对象
            String className = "Idol";
            //类对象
            Class pClass=Class.forName(className);
            //构造器
            Constructor c= pClass.getConstructor();
            //通过构造器实例化对象
            Idol i1=(Idol)c.newInstance();
            i1.name="linyojia";
            System.out.println(i1);
//            Class pClass1=Class.forName(className);
//            Class pClass2=Idol.class;
//            Class pClass3=new Idol().getClass();
//            System.out.println(pClass1==pClass2);
//            System.out.println(pClass1==pClass3);
//
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
