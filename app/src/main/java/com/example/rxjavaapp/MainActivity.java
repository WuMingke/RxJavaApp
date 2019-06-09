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
         * 五种观察者模式
         *      Observable 和 Observer
         *              能够发射0或n个数据，并以成功或错误事件终止。
         *      Flowable 和 Subscriber
         *              能够发射0或n个数据，并以成功或错误事件终止。支持背压，可以控制数据源发射的速度。
         *      Single 和 SingleObserver
         *              只发射单个数据或错误事件。
         *      Completable 和 CompletableObserver
         *              从来不发射数据，只处理onComplete和onError事件。
         *      Maybe 和 MaybeObserver
         *              能够发射0或者1个数据，要么成功，要么失败。
         *
         * Observable的just/create/range/fromXXX等操作符生成Cold Observable
         * Observable分为Hot Observable 和 Cold Observable
         *      Hot Observable 无论有没有观察者进行订阅，事件都会发生。可以与多个订阅者共享信息。
         *      Cold Observable 只有订阅了，才会发射数据。且只能是一对一关系。
         *
         * Cold Observable 转换成 Hot Observable：
         * （1）使用publish操作符，把原先的Observable转换成ConnectableObservable，并调用connect();真正执行，ConnectableObservable是线程安全的。
         * （2）使用Subject/Processor，
         *          Subject既是Observable又是Observer，可以将其看作是一个桥梁或者代理。
         *          包含四个类型：AsyncSubject/BehaviorSubject/ReplaySubject/PublishSubject
         *          AsyncSubject Observer接收AsyncSubject的onComplete()之前的最后一个数据。
         *                       onComplete()必须调用才会发数据
         *          BehaviorSubject Observer接收BehaviorSubject被订阅之前的最后一个数据，订阅之后，再接收发射的数据
         *                          可缓存最近一次发出信息的数据
         *                          RxLifecycle使用了BehaviorSubject
         *          ReplaySubject 会发射所有来自原始Observable的数据给观察者，无论是何时订阅的
         *                        可限制缓存数据的数量createWithSize()，可限制缓存时间createWithTime()
         *          PublishSubject  Observer接收PublishSubject被订阅之后发送的数据
         *
         *
         *
         * Hot Observable 转换成 Cold Observable
         * （1）ConnectableObservable的refCount操作符
         * （2）Observable的share操作符
         *
         * Observable 和 Flowable 使用场景区分
         * Observable   一般处理最大不超过1000条数据，并且几乎不会出现内存溢出
         *              GUI鼠标事件，基本不会背压（可以给sampling/debouncing操作）
         *              处理同步流
         * Flowable     处理以某种方式产生超过10Kb的元素
         *              文件读取与分析
         *              读取数据库记录，也是一个阻塞的和基于拉取模式
         *              网络IO流
         *              创建一个响应式非阻塞接口
         *
         * Single 只有onSuccess、onError事件。可通过toXXX操作符转换成Observable/Flowable/Completable/Maybe
         * Completable 经常和 andThen 操作符使用。可通过toXXX操作符转换成Observable/Flowable/Completable/Maybe
         * Maybe 看作是Single和Completable的结合
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
