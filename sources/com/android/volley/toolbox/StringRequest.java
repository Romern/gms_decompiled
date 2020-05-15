package com.android.volley.toolbox;

import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;
import java.io.UnsupportedEncodingException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class StringRequest extends Request {

    /* renamed from: d */
    public final Object f7368d;

    /* renamed from: e */
    private Response.Listener f7369e;

    public StringRequest(int i, String str, Response.Listener listener, Response.ErrorListener errorListener) {
        super(i, str, errorListener);
        this.f7368d = new Object();
        this.f7369e = listener;
    }

    public void cancel() {
        super.cancel();
        synchronized (this.f7368d) {
            this.f7369e = null;
        }
    }

    /* access modifiers changed from: protected */
    public Response parseNetworkResponse(NetworkResponse networkResponse) {
        String str;
        try {
            str = new String(networkResponse.data, HttpHeaderParser.parseCharset(networkResponse.headers));
        } catch (UnsupportedEncodingException e) {
            str = new String(networkResponse.data);
        }
        return Response.success(str, HttpHeaderParser.parseCacheHeaders(networkResponse));
    }

    /* access modifiers changed from: protected */
    public void deliverResponse(String str) {
        Response.Listener listener;
        synchronized (this.f7368d) {
            listener = this.f7369e;
        }
        if (listener != null) {
            listener.onResponse(str);
        }
    }

    public StringRequest(String str, Response.Listener listener, Response.ErrorListener errorListener) {
        this(0, str, listener, errorListener);
    }
}
