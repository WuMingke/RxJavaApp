package com.example.rxjavaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * eg：按下开关，台灯灯亮。
         * 在这个事件中，台灯作为观察者，开关作为被观察者，台灯透过电线来观察开关的的状态并作出相应的处理。
         *
         * 被观察者(Observable)：被观察者作为事件的产生方，是主动的，是整个事件流程的起点。
         * 观察者(Observer)：观察者作为事件的处理方，是被动的，是整个事件流程的终点。
         * 操作符：在起点和终点之间，事件的传递过程可以被加工，过滤，合并等等方式处理。
         *
         * 被观察者 订阅 观察者 ：保证流式API调用风格-->被观察者产生事件，是事件的起点，
         * 那么开头就是用Observable这个主体调用来创建被观察者，产生事件，为了保证流式API调用规则，
         * 就直接让Observable作为唯一的调用主体，一路调用下去。
         *
         * 当调用订阅操作（即调用Observable.subscribe()方法）的时候，被观察者才真正开始发出事件。
         *
         * FlatMap：将每个Observable产生的事件里的信息再包装成新的Observable传递出来。
         *          FlatMap可以再次包装新的Observable,而每个Observable都可以使用from(T[])方法来创建自己，
         *          这个方法接受一个列表，然后将列表中的数据包装成一系列事件。
         *
         *
         *
         *
         *
         */
    }
}
