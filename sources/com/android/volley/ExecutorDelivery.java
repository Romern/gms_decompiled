package com.android.volley;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ExecutorDelivery implements ResponseDelivery {

    /* renamed from: a */
    private final Executor f7272a;

    public ExecutorDelivery(Handler handler) {
        this.f7272a = new bno(handler);
    }

    public void postError(Request request, VolleyError volleyError) {
        request.addMarker("post-error");
        this.f7272a.execute(new bnp(request, Response.error(volleyError), null));
    }

    public void postResponse(Request request, Response response) {
        postResponse(request, response, null);
    }

    public void postResponse(Request request, Response response, Runnable runnable) {
        request.markDelivered();
        request.addMarker("post-response");
        this.f7272a.execute(new bnp(request, response, runnable));
    }

    public ExecutorDelivery(Executor executor) {
        this.f7272a = executor;
    }
}
