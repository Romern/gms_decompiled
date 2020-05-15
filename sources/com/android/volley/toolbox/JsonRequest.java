package com.android.volley.toolbox;

import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyLog;
import java.io.UnsupportedEncodingException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class JsonRequest extends Request {
    protected static final String PROTOCOL_CHARSET = "utf-8";

    /* renamed from: e */
    private static final String f7350e = String.format("application/json; charset=%s", PROTOCOL_CHARSET);

    /* renamed from: d */
    public final Object f7351d;

    /* renamed from: f */
    private Response.Listener f7352f;

    /* renamed from: g */
    private final String f7353g;

    public JsonRequest(int i, String str, String str2, Response.Listener listener, Response.ErrorListener errorListener) {
        super(i, str, errorListener);
        this.f7351d = new Object();
        this.f7352f = listener;
        this.f7353g = str2;
    }

    public void cancel() {
        super.cancel();
        synchronized (this.f7351d) {
            this.f7352f = null;
        }
    }

    public void deliverResponse(Object obj) {
        Response.Listener listener;
        synchronized (this.f7351d) {
            listener = this.f7352f;
        }
        if (listener != null) {
            listener.onResponse(obj);
        }
    }

    public byte[] getBody() {
        try {
            String str = this.f7353g;
            if (str != null) {
                return str.getBytes(PROTOCOL_CHARSET);
            }
            return null;
        } catch (UnsupportedEncodingException e) {
            VolleyLog.wtf("Unsupported Encoding while trying to get the bytes of %s using %s", this.f7353g, PROTOCOL_CHARSET);
            return null;
        }
    }

    public String getBodyContentType() {
        return f7350e;
    }

    @Deprecated
    public byte[] getPostBody() {
        return getBody();
    }

    @Deprecated
    public String getPostBodyContentType() {
        return getBodyContentType();
    }

    /* access modifiers changed from: protected */
    public abstract Response parseNetworkResponse(NetworkResponse networkResponse);

    @Deprecated
    public JsonRequest(String str, String str2, Response.Listener listener, Response.ErrorListener errorListener) {
        this(-1, str, str2, listener, errorListener);
    }
}
