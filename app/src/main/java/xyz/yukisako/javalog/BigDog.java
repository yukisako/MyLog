package xyz.yukisako.javalog;

import android.util.Log;
/**
 * Created by yukisako on 2017/10/02.
 */

class BigDog extends Dog{
    static String to_jp = "大型犬";

    //コンストラクタ
    public BigDog(String name, int age){
        super(name,age);
    }


    public static void introduce(){
        Log.d("javatest","これは大型犬クラスです");
    }

}
