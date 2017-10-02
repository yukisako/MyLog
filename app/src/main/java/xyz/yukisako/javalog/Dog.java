package xyz.yukisako.javalog;

import android.util.Log;

/**
 * Created by yukisako on 2017/10/02.
 */

public class Dog extends Animal {
    String name;
    int age;

    //コンストラクタ
    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    //クラス関数
    public static void introduce(){
        Log.d("javatest","これは犬クラス");
    }

    //メンバ関数
    public void say(){
        Log.d("javatest", this.name + "(" + this.age + "歳" + "「ワンワン」");
    }

    @Override
    public void move(){
        Log.d("javatest", "走った");
    }

}
