package databind.android.com.testdatabind.detail;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import databind.android.com.testdatabind.BR;

/**
 * Created by wangfei on 17/1/1.
 */
public class Person  extends BaseObservable {
    private String name;
    private String age;
    private String sex;
    public Person(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    public void setAge(String age) {
        this.age = age;
        notifyPropertyChanged(BR.age);
    }
    @Bindable
    public String getName() {
        return this.name;
    }
    @Bindable
    public String getAge() {
        return this.age;
    }

    public void setSex(String sex) {
        this.sex = sex;
        notifyPropertyChanged(BR.sex);
    }
    @Bindable
    public String getSex() {
        return sex;
    }
}
