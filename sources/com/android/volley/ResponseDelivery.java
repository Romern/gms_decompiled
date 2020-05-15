package com.android.volley;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface ResponseDelivery {
    void postError(Request request, VolleyError volleyError);

    void postResponse(Request request, Response response);

    void postResponse(Request request, Response response, Runnable runnable);
}
