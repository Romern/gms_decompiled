package com.android.volley;

import android.os.Process;
import com.android.volley.Cache;
import java.util.concurrent.BlockingQueue;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CacheDispatcher extends Thread {

    /* renamed from: c */
    private static final boolean f7261c = VolleyLog.DEBUG;

    /* renamed from: a */
    public final BlockingQueue f7262a;

    /* renamed from: b */
    public final ResponseDelivery f7263b;

    /* renamed from: d */
    private final BlockingQueue f7264d;

    /* renamed from: e */
    private final Cache f7265e;

    /* renamed from: f */
    private volatile boolean f7266f = false;

    /* renamed from: g */
    private final bnn f7267g;

    public CacheDispatcher(BlockingQueue blockingQueue, BlockingQueue blockingQueue2, Cache cache, ResponseDelivery responseDelivery) {
        this.f7264d = blockingQueue;
        this.f7262a = blockingQueue2;
        this.f7265e = cache;
        this.f7263b = responseDelivery;
        this.f7267g = new bnn(this);
    }

    /* renamed from: a */
    private void m4755a() {
        Request request = (Request) this.f7264d.take();
        request.addMarker("cache-queue-take");
        request.mo4165a(1);
        try {
            if (!request.isCanceled()) {
                Cache.Entry entry = this.f7265e.get(request.getCacheKey());
                if (entry == null) {
                    request.addMarker("cache-miss");
                    if (!this.f7267g.mo3302b(request)) {
                        this.f7262a.put(request);
                    }
                } else if (!entry.isExpired()) {
                    request.addMarker("cache-hit");
                    Response parseNetworkResponse = request.parseNetworkResponse(new NetworkResponse(entry.data, entry.responseHeaders));
                    request.addMarker("cache-hit-parsed");
                    if (entry.refreshNeeded()) {
                        request.addMarker("cache-hit-refresh-needed");
                        request.setCacheEntry(entry);
                        parseNetworkResponse.intermediate = true;
                        if (!this.f7267g.mo3302b(request)) {
                            this.f7263b.postResponse(request, parseNetworkResponse, new bnm(this, request));
                        } else {
                            this.f7263b.postResponse(request, parseNetworkResponse);
                        }
                    } else {
                        this.f7263b.postResponse(request, parseNetworkResponse);
                    }
                } else {
                    request.addMarker("cache-hit-expired");
                    request.setCacheEntry(entry);
                    if (!this.f7267g.mo3302b(request)) {
                        this.f7262a.put(request);
                    }
                }
            } else {
                request.mo4167a("cache-discard-canceled");
            }
        } finally {
            request.mo4165a(2);
        }
    }

    public void quit() {
        this.f7266f = true;
        interrupt();
    }

    public void run() {
        if (f7261c) {
            VolleyLog.m4767v("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f7265e.initialize();
        while (true) {
            try {
                m4755a();
            } catch (InterruptedException e) {
                if (!this.f7266f) {
                    VolleyLog.m4765e("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
                } else {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        }
    }
}
