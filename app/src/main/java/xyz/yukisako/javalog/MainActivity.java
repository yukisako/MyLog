package xyz.yukisako.javalog;

import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Dog dog = new Dog("ポチ",3);
//
//        dog.say();
//        Log.d("javatest","犬の名前は"+dog.name+"です．");
//        Log.d("javatest","犬の年齢は"+dog.age+"です．");
//
//        BigDog bigdog = new BigDog("ヨーゼフ",15);
//
//        bigdog.say();
//        Log.d("javatest", "犬の名前は" + bigdog.name + "です");
//        Log.d("javatest", "犬の年齢は" + bigdog.age + "です");
//
//        dog.move();

        //課題 Humanクラス
        Human me = new Human("迫 佑樹", 21,"プログラミング");
        me.say();
        me.think();

    }
}
