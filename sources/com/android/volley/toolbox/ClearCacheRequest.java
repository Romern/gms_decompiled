package com.android.volley.toolbox;

import android.os.Handler;
import android.os.Looper;
import com.android.volley.Cache;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ClearCacheRequest extends Request {

    /* renamed from: d */
    private final Cache f7319d;

    /* renamed from: e */
    private final Runnable f7320e;

    public ClearCacheRequest(Cache cache, Runnable runnable) {
        super(0, null, null);
        this.f7319d = cache;
        this.f7320e = runnable;
    }

    public void deliverResponse(Object obj) {
    }

    public Request.Priority getPriority() {
        return Request.Priority.IMMEDIATE;
    }

    public boolean isCanceled() {
        this.f7319d.clear();
        if (this.f7320e == null) {
            return true;
        }
        new Handler(Looper.getMainLooper()).postAtFrontOfQueue(this.f7320e);
        return true;
    }

    /* access modifiers changed from: protected */
    public Response parseNetworkResponse(NetworkResponse networkResponse) {
        return null;
    }
}
