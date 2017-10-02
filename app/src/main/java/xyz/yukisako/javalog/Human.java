package xyz.yukisako.javalog;

import android.util.Log;

/**
 * Created by yukisako on 2017/10/02.
 */

public class Human extends Animal implements Thinkable {

    String hobby;

    public Human(String name, int age, String hobby){
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    public void say(){
        Log.d("javatest", "私の名前は"+this.name+"です。年は"+this.age+"歳です。");
    }

    //Animalクラスにmovableインタフェースがついてるのでmoveを実装する必要あり
    @Override
    public void move(){
        Log.d("javatest", "走った");
    }

    //Thinkableインタフェースが適用されているためthinkメソッドを実装する必要がある
    @Override
    public void think(){
        Log.d("javatest","私は"+this.hobby+"について考える");
    }
}
