/**
 * @author sijt
 * @date 2018/11/23 11:51.
 */
public class Idol {
    String name;
    int age;
    static String band;
    static {
        System.out.println("初始化 band");
        band = "落日飞车";
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return this.age;
    }
}
