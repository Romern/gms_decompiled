package com.android.volley;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.volley.Cache;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.Map;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class Request implements Comparable {

    /* renamed from: CZ */
    private final String f7280CZ;

    /* renamed from: Da */
    private final int f7281Da;

    /* renamed from: Db */
    private Response.ErrorListener f7282Db;

    /* renamed from: Dc */
    private boolean f7283Dc;

    /* renamed from: Dd */
    private boolean f7284Dd;

    /* renamed from: De */
    private boolean f7285De;

    /* renamed from: Df */
    private boolean f7286Df;

    /* renamed from: Dg */
    private RetryPolicy f7287Dg;

    /* renamed from: Dh */
    private Cache.Entry f7288Dh;

    /* renamed from: a */
    public final bnt f7289a;

    /* renamed from: b */
    public final Object f7290b;

    /* renamed from: c */
    public bnn f7291c;

    /* renamed from: d */
    private final int f7292d;

    /* renamed from: h */
    private Integer f7293h;

    /* renamed from: i */
    private RequestQueue f7294i;

    /* renamed from: p */
    private Object f7295p;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public interface Method {
        public static final int DELETE = 3;
        public static final int DEPRECATED_GET_OR_POST = -1;
        public static final int GET = 0;
        public static final int HEAD = 4;
        public static final int OPTIONS = 5;
        public static final int PATCH = 7;
        public static final int POST = 1;
        public static final int PUT = 2;
        public static final int TRACE = 6;
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public enum Priority {
        LOW,
        NORMAL,
        HIGH,
        IMMEDIATE
    }

    public Request(int i, String str, Response.ErrorListener errorListener) {
        bnt bnt;
        Uri parse;
        String host;
        if (bnt.f5207a) {
            bnt = new bnt();
        } else {
            bnt = null;
        }
        this.f7289a = bnt;
        this.f7290b = new Object();
        this.f7283Dc = true;
        int i2 = 0;
        this.f7284Dd = false;
        this.f7285De = false;
        this.f7286Df = false;
        this.f7288Dh = null;
        this.f7292d = i;
        this.f7280CZ = str;
        this.f7282Db = errorListener;
        setRetryPolicy(new DefaultRetryPolicy());
        if (!(TextUtils.isEmpty(str) || (parse = Uri.parse(str)) == null || (host = parse.getHost()) == null)) {
            i2 = host.hashCode();
        }
        this.f7281Da = i2;
    }

    /* renamed from: a */
    private static final byte[] m4757a(Map map, String str) {
        StringBuilder sb = new StringBuilder();
        try {
            for (Map.Entry entry : map.entrySet()) {
                if (entry.getKey() == null || entry.getValue() == null) {
                    throw new IllegalArgumentException(String.format("Request#getParams() or Request#getPostParams() returned a map containing a null key or value: (%s, %s). All keys and values must be non-null.", entry.getKey(), entry.getValue()));
                }
                sb.append(URLEncoder.encode((String) entry.getKey(), str));
                sb.append('=');
                sb.append(URLEncoder.encode((String) entry.getValue(), str));
                sb.append('&');
            }
            return sb.toString().getBytes(str);
        } catch (UnsupportedEncodingException e) {
            String valueOf = String.valueOf(str);
            throw new RuntimeException(valueOf.length() == 0 ? new String("Encoding not supported: ") : "Encoding not supported: ".concat(valueOf), e);
        }
    }

    public void addMarker(String str) {
        if (bnt.f5207a) {
            this.f7289a.mo3308a(str, Thread.currentThread().getId());
        }
    }

    public void cancel() {
        synchronized (this.f7290b) {
            this.f7284Dd = true;
            this.f7282Db = null;
        }
    }

    public int compareTo(Request request) {
        Priority priority = getPriority();
        Priority priority2 = request.getPriority();
        return priority == priority2 ? this.f7293h.intValue() - request.f7293h.intValue() : priority2.ordinal() - priority.ordinal();
    }

    public void deliverError(VolleyError volleyError) {
        Response.ErrorListener errorListener;
        synchronized (this.f7290b) {
            errorListener = this.f7282Db;
        }
        if (errorListener != null) {
            errorListener.onErrorResponse(volleyError);
        }
    }

    public abstract void deliverResponse(Object obj);

    public byte[] getBody() {
        Map params = getParams();
        if (params == null || params.size() <= 0) {
            return null;
        }
        return m4757a(params, getParamsEncoding());
    }

    public String getBodyContentType() {
        String valueOf = String.valueOf(getParamsEncoding());
        return valueOf.length() == 0 ? new String("application/x-www-form-urlencoded; charset=") : "application/x-www-form-urlencoded; charset=".concat(valueOf);
    }

    public Cache.Entry getCacheEntry() {
        return this.f7288Dh;
    }

    public String getCacheKey() {
        String url = getUrl();
        int method = getMethod();
        if (method == 0 || method == -1) {
            return url;
        }
        String num = Integer.toString(method);
        StringBuilder sb = new StringBuilder(String.valueOf(num).length() + 1 + String.valueOf(url).length());
        sb.append(num);
        sb.append('-');
        sb.append(url);
        return sb.toString();
    }

    public Response.ErrorListener getErrorListener() {
        Response.ErrorListener errorListener;
        synchronized (this.f7290b) {
            errorListener = this.f7282Db;
        }
        return errorListener;
    }

    public Map getHeaders() {
        return Collections.emptyMap();
    }

    public int getMethod() {
        return this.f7292d;
    }

    /* access modifiers changed from: protected */
    public Map getParams() {
        return null;
    }

    /* access modifiers changed from: protected */
    public String getParamsEncoding() {
        return "UTF-8";
    }

    @Deprecated
    public byte[] getPostBody() {
        Map postParams = getPostParams();
        if (postParams == null || postParams.size() <= 0) {
            return null;
        }
        return m4757a(postParams, getPostParamsEncoding());
    }

    @Deprecated
    public String getPostBodyContentType() {
        return getBodyContentType();
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public Map getPostParams() {
        return getParams();
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public String getPostParamsEncoding() {
        return getParamsEncoding();
    }

    public Priority getPriority() {
        return Priority.NORMAL;
    }

    public RetryPolicy getRetryPolicy() {
        return this.f7287Dg;
    }

    public final int getSequence() {
        Integer num = this.f7293h;
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("getSequence called before setSequence");
    }

    public Object getTag() {
        return this.f7295p;
    }

    public final int getTimeoutMs() {
        return getRetryPolicy().getCurrentTimeout();
    }

    public int getTrafficStatsTag() {
        return this.f7281Da;
    }

    public String getUrl() {
        return this.f7280CZ;
    }

    public boolean hasHadResponseDelivered() {
        boolean z;
        synchronized (this.f7290b) {
            z = this.f7285De;
        }
        return z;
    }

    public boolean isCanceled() {
        boolean z;
        synchronized (this.f7290b) {
            z = this.f7284Dd;
        }
        return z;
    }

    public void markDelivered() {
        synchronized (this.f7290b) {
            this.f7285De = true;
        }
    }

    /* access modifiers changed from: protected */
    public VolleyError parseNetworkError(VolleyError volleyError) {
        return volleyError;
    }

    /* access modifiers changed from: protected */
    public abstract Response parseNetworkResponse(NetworkResponse networkResponse);

    public Request setCacheEntry(Cache.Entry entry) {
        this.f7288Dh = entry;
        return this;
    }

    public Request setRequestQueue(RequestQueue requestQueue) {
        this.f7294i = requestQueue;
        return this;
    }

    public Request setRetryPolicy(RetryPolicy retryPolicy) {
        this.f7287Dg = retryPolicy;
        return this;
    }

    public final Request setSequence(int i) {
        this.f7293h = Integer.valueOf(i);
        return this;
    }

    public final Request setShouldCache(boolean z) {
        this.f7283Dc = z;
        return this;
    }

    public final Request setShouldRetryServerErrors(boolean z) {
        this.f7286Df = z;
        return this;
    }

    public Request setTag(Object obj) {
        this.f7295p = obj;
        return this;
    }

    public final boolean shouldCache() {
        return this.f7283Dc;
    }

    public final boolean shouldRetryServerErrors() {
        return this.f7286Df;
    }

    public String toString() {
        String str;
        String valueOf = String.valueOf(Integer.toHexString(getTrafficStatsTag()));
        String str2 = valueOf.length() == 0 ? new String("0x") : "0x".concat(valueOf);
        if (!isCanceled()) {
            str = "[ ] ";
        } else {
            str = "[X] ";
        }
        String url = getUrl();
        String valueOf2 = String.valueOf(getPriority());
        String valueOf3 = String.valueOf(this.f7293h);
        int length = str.length();
        int length2 = String.valueOf(url).length();
        StringBuilder sb = new StringBuilder(length + 3 + length2 + String.valueOf(str2).length() + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append(str);
        sb.append(url);
        sb.append(" ");
        sb.append(str2);
        sb.append(" ");
        sb.append(valueOf2);
        sb.append(" ");
        sb.append(valueOf3);
        return sb.toString();
    }

    @Deprecated
    public Request(String str, Response.ErrorListener errorListener) {
        this(-1, str, errorListener);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4164a() {
        bnn bnn;
        synchronized (this.f7290b) {
            bnn = this.f7291c;
        }
        if (bnn != null) {
            bnn.mo3301a(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4165a(int i) {
        RequestQueue requestQueue = this.f7294i;
        if (requestQueue != null) {
            requestQueue.mo4209a(this, i);
        }
    }

    /* renamed from: a */
    public final void mo4166a(bnn bnn) {
        synchronized (this.f7290b) {
            this.f7291c = bnn;
        }
    }

    /* renamed from: a */
    public final void mo4167a(String str) {
        RequestQueue requestQueue = this.f7294i;
        if (requestQueue != null) {
            synchronized (requestQueue.f7297a) {
                requestQueue.f7297a.remove(this);
            }
            synchronized (requestQueue.f7298b) {
                for (RequestQueue.RequestFinishedListener requestFinishedListener : requestQueue.f7298b) {
                    requestFinishedListener.onRequestFinished(this);
                }
            }
            requestQueue.mo4209a(this, 5);
        }
        if (bnt.f5207a) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new bnq(this, str, id));
                return;
            }
            this.f7289a.mo3308a(str, id);
            this.f7289a.mo3307a(toString());
        }
    }
}
