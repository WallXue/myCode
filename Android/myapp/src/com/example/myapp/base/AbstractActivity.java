package com.example.myapp.base;

import android.app.Activity;
import android.os.Bundle;

import java.lang.reflect.Field;

/**
 * Created by Administrator on 2015/12/2.
 */
public abstract class AbstractActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        onPreLoad(savedInstanceState);
        try {
            loadComponent();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        init();
    }

    protected abstract void onPreLoad(Bundle savedInstanceState);

    protected abstract void init();

    public final void loadComponent() throws IllegalAccessException {
        Class<?> clazz =  this.getClass();
        Field[] declaredFields = clazz.getDeclaredFields();
        for(int index = 0; index < declaredFields.length; index++){
            Field declaredField = declaredFields[index];
            declaredField.setAccessible(true);
            if(declaredField.isAnnotationPresent(Inject.class)){
                Inject annotation = declaredField.getAnnotation(Inject.class);
                int id = annotation.id();
                declaredField.set(this, findViewById(id));
            }

        }
    }

}
