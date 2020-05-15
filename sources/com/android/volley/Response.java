package com.android.volley;

import com.android.volley.Cache;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class Response {
    public final Cache.Entry cacheEntry;
    public final VolleyError error;
    public boolean intermediate;
    public final Object result;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public interface ErrorListener {
        void onErrorResponse(VolleyError volleyError);
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public interface Listener {
        void onResponse(Object obj);
    }

    private Response(VolleyError volleyError) {
        this.intermediate = false;
        this.result = null;
        this.cacheEntry = null;
        this.error = volleyError;
    }

    public static Response error(VolleyError volleyError) {
        return new Response(volleyError);
    }

    public static Response success(Object obj, Cache.Entry entry) {
        return new Response(obj, entry);
    }

    public boolean isSuccess() {
        return this.error == null;
    }

    private Response(Object obj, Cache.Entry entry) {
        this.intermediate = false;
        this.result = obj;
        this.cacheEntry = entry;
        this.error = null;
    }
}
