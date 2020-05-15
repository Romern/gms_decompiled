package com.android.volley;

import android.net.TrafficStats;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import com.android.volley.Cache;
import java.util.List;
import java.util.concurrent.BlockingQueue;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NetworkDispatcher extends Thread {

    /* renamed from: a */
    private final BlockingQueue f7275a;

    /* renamed from: b */
    private final Network f7276b;

    /* renamed from: c */
    private final Cache f7277c;

    /* renamed from: d */
    private final ResponseDelivery f7278d;

    /* renamed from: e */
    private volatile boolean f7279e = false;

    public NetworkDispatcher(BlockingQueue blockingQueue, Network network, Cache cache, ResponseDelivery responseDelivery) {
        this.f7275a = blockingQueue;
        this.f7276b = network;
        this.f7277c = cache;
        this.f7278d = responseDelivery;
    }

    /* renamed from: a */
    private void m4756a() {
        bnn bnn;
        List<Request> list;
        Request request = (Request) this.f7275a.take();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        request.mo4165a(3);
        try {
            request.addMarker("network-queue-take");
            if (!request.isCanceled()) {
                int i = Build.VERSION.SDK_INT;
                TrafficStats.setThreadStatsTag(request.getTrafficStatsTag());
                NetworkResponse performRequest = this.f7276b.performRequest(request);
                request.addMarker("network-http-complete");
                if (performRequest.notModified && request.hasHadResponseDelivered()) {
                    request.mo4167a("not-modified");
                    request.mo4164a();
                } else {
                    Response parseNetworkResponse = request.parseNetworkResponse(performRequest);
                    request.addMarker("network-parse-complete");
                    if (request.shouldCache() && parseNetworkResponse.cacheEntry != null) {
                        this.f7277c.put(request.getCacheKey(), parseNetworkResponse.cacheEntry);
                        request.addMarker("network-cache-written");
                    }
                    request.markDelivered();
                    this.f7278d.postResponse(request, parseNetworkResponse);
                    synchronized (request.f7290b) {
                        bnn = request.f7291c;
                    }
                    if (bnn != null) {
                        Cache.Entry entry = parseNetworkResponse.cacheEntry;
                        if (entry == null || entry.isExpired()) {
                            bnn.mo3301a(request);
                        } else {
                            String cacheKey = request.getCacheKey();
                            synchronized (bnn) {
                                list = (List) bnn.f5194a.remove(cacheKey);
                            }
                            if (list != null) {
                                if (VolleyLog.DEBUG) {
                                    VolleyLog.m4767v("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), cacheKey);
                                }
                                for (Request request2 : list) {
                                    bnn.f5195b.f7263b.postResponse(request2, parseNetworkResponse);
                                }
                            }
                        }
                    }
                }
            } else {
                request.mo4167a("network-discard-cancelled");
                request.mo4164a();
            }
        } catch (VolleyError e) {
            e.f7308a = SystemClock.elapsedRealtime() - elapsedRealtime;
            this.f7278d.postError(request, request.parseNetworkError(e));
            request.mo4164a();
        } catch (Exception e2) {
            try {
                VolleyLog.m4766e(e2, "Unhandled exception %s", e2.toString());
                VolleyError volleyError = new VolleyError(e2);
                volleyError.f7308a = SystemClock.elapsedRealtime() - elapsedRealtime;
                this.f7278d.postError(request, volleyError);
                request.mo4164a();
            } catch (Throwable th) {
                request.mo4165a(4);
                throw th;
            }
        }
        request.mo4165a(4);
    }

    public void quit() {
        this.f7279e = true;
        interrupt();
    }

    public void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                m4756a();
            } catch (InterruptedException e) {
                if (!this.f7279e) {
                    VolleyLog.m4765e("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
                } else {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        }
    }
}
