package com.android.volley.toolbox;

import android.content.Context;
import android.os.Build;
import com.android.volley.Network;
import com.android.volley.RequestQueue;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class Volley {
    /* renamed from: a */
    private static RequestQueue m4795a(Context context, Network network) {
        RequestQueue requestQueue = new RequestQueue(new DiskBasedCache(new boi(context.getApplicationContext())), network);
        requestQueue.start();
        return requestQueue;
    }

    public static RequestQueue newRequestQueue(Context context) {
        return newRequestQueue(context, (BaseHttpStack) null);
    }

    public static RequestQueue newRequestQueue(Context context, BaseHttpStack baseHttpStack) {
        BasicNetwork basicNetwork;
        if (baseHttpStack == null) {
            int i = Build.VERSION.SDK_INT;
            basicNetwork = new BasicNetwork((BaseHttpStack) new HurlStack());
        } else {
            basicNetwork = new BasicNetwork(baseHttpStack);
        }
        return m4795a(context, basicNetwork);
    }

    @Deprecated
    public static RequestQueue newRequestQueue(Context context, HttpStack httpStack) {
        if (httpStack != null) {
            return m4795a(context, new BasicNetwork(httpStack));
        }
        return newRequestQueue(context, (BaseHttpStack) null);
    }
}
