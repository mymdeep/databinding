package databind.android.com.testdatabind;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import databind.android.com.testdatabind.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {
    ArrayList<String> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        list.add("cccccc");
        final ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        Person person =  new Person("umeng share","5");
        final databind.android.com.testdatabind.detail.Person realperson =  new  databind.android.com.testdatabind.detail.Person("real_umeng share","5");
        Animal animal = new Animal("cat","5");
        binding.setPerson(person);
        binding.setAnimal(animal);
        person.setSex("male");
        animal.setSex("female");
        realperson.setSex("male");
        binding.setRealperson(realperson);
        binding.setClick(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              //  Toast.makeText(MainActivity.this,"点击事件",Toast.LENGTH_LONG).show();
                binding.mutable.setText("点击事件");
                realperson.setName("点击按钮产生了变化");
            }
        });
        binding.setList(list);
        binding.setListKey(0);

      //  setContentView(R.layout.activity_main);
    }
}
