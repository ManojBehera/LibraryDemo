package com.mavenir.library;

import android.content.Context;
import android.widget.Toast;

public class Utils {

    /**
     * @Author Manoj Behera
     * @param context
     * @param text
     */
    public static void sayHello(Context context, String text){
        Toast.makeText(context,""+text,Toast.LENGTH_LONG).show();
    }
}
