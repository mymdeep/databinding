package databind.android.com.testdatabind;

/**
 * Created by wangfei on 17/1/1.
 */
public class Animal {
    private String name;
    private String age;
    private String sex;
    public Animal(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public String getAge() {
        return this.age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }
}
