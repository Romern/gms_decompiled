package com.android.volley.toolbox;

import android.os.SystemClock;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RequestFuture implements Future, Response.Listener, Response.ErrorListener {

    /* renamed from: a */
    private Request f7364a;

    /* renamed from: b */
    private boolean f7365b = false;

    /* renamed from: c */
    private Object f7366c;

    /* renamed from: d */
    private VolleyError f7367d;

    private RequestFuture() {
    }

    /* renamed from: a */
    private final synchronized Object m4794a(Long l) {
        VolleyError volleyError = this.f7367d;
        if (volleyError != null) {
            throw new ExecutionException(volleyError);
        } else if (!this.f7365b) {
            if (l == null) {
                while (!isDone()) {
                    wait(0);
                }
            } else if (l.longValue() > 0) {
                long uptimeMillis = SystemClock.uptimeMillis();
                long longValue = l.longValue() + uptimeMillis;
                while (!isDone() && uptimeMillis < longValue) {
                    wait(longValue - uptimeMillis);
                    uptimeMillis = SystemClock.uptimeMillis();
                }
            }
            VolleyError volleyError2 = this.f7367d;
            if (volleyError2 != null) {
                throw new ExecutionException(volleyError2);
            } else if (this.f7365b) {
                return this.f7366c;
            } else {
                throw new TimeoutException();
            }
        } else {
            return this.f7366c;
        }
    }

    public static RequestFuture newFuture() {
        return new RequestFuture();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0015, code lost:
        return false;
     */
    public synchronized boolean cancel(boolean z) {
        if (this.f7364a != null && !isDone()) {
            this.f7364a.cancel();
            return true;
        }
    }

    public Object get() {
        try {
            return m4794a(null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    public boolean isCancelled() {
        Request request = this.f7364a;
        if (request != null) {
            return request.isCanceled();
        }
        return false;
    }

    public synchronized boolean isDone() {
        return this.f7365b || this.f7367d != null || isCancelled();
    }

    public synchronized void onErrorResponse(VolleyError volleyError) {
        this.f7367d = volleyError;
        notifyAll();
    }

    public synchronized void onResponse(Object obj) {
        this.f7365b = true;
        this.f7366c = obj;
        notifyAll();
    }

    public void setRequest(Request request) {
        this.f7364a = request;
    }

    public Object get(long j, TimeUnit timeUnit) {
        return m4794a(Long.valueOf(TimeUnit.MILLISECONDS.convert(j, timeUnit)));
    }
}
