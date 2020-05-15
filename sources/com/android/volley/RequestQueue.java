package com.android.volley;

import android.os.Handler;
import android.os.Looper;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RequestQueue {

    /* renamed from: a */
    public final Set f7297a;

    /* renamed from: b */
    public final List f7298b;

    /* renamed from: c */
    private final AtomicInteger f7299c;

    /* renamed from: d */
    private final PriorityBlockingQueue f7300d;

    /* renamed from: e */
    private final PriorityBlockingQueue f7301e;

    /* renamed from: f */
    private final Cache f7302f;

    /* renamed from: g */
    private final Network f7303g;

    /* renamed from: h */
    private final ResponseDelivery f7304h;

    /* renamed from: i */
    private final NetworkDispatcher[] f7305i;

    /* renamed from: j */
    private CacheDispatcher f7306j;

    /* renamed from: k */
    private final List f7307k;

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public @interface RequestEvent {
        public static final int REQUEST_CACHE_LOOKUP_FINISHED = 2;
        public static final int REQUEST_CACHE_LOOKUP_STARTED = 1;
        public static final int REQUEST_FINISHED = 5;
        public static final int REQUEST_NETWORK_DISPATCH_FINISHED = 4;
        public static final int REQUEST_NETWORK_DISPATCH_STARTED = 3;
        public static final int REQUEST_QUEUED = 0;
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public interface RequestEventListener {
        void onRequestEvent(Request request, int i);
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public interface RequestFilter {
        boolean apply(Request request);
    }

    @Deprecated
    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public interface RequestFinishedListener {
        void onRequestFinished(Request request);
    }

    public RequestQueue(Cache cache, Network network) {
        this(cache, network, 4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4209a(Request request, int i) {
        synchronized (this.f7307k) {
            for (RequestEventListener requestEventListener : this.f7307k) {
                requestEventListener.onRequestEvent(request, i);
            }
        }
    }

    public Request add(Request request) {
        request.setRequestQueue(this);
        synchronized (this.f7297a) {
            this.f7297a.add(request);
        }
        request.setSequence(getSequenceNumber());
        request.addMarker("add-to-queue");
        mo4209a(request, 0);
        if (!request.shouldCache()) {
            this.f7301e.add(request);
            return request;
        }
        this.f7300d.add(request);
        return request;
    }

    public void addRequestEventListener(RequestEventListener requestEventListener) {
        synchronized (this.f7307k) {
            this.f7307k.add(requestEventListener);
        }
    }

    @Deprecated
    public void addRequestFinishedListener(RequestFinishedListener requestFinishedListener) {
        synchronized (this.f7298b) {
            this.f7298b.add(requestFinishedListener);
        }
    }

    public void cancelAll(RequestFilter requestFilter) {
        synchronized (this.f7297a) {
            for (Request request : this.f7297a) {
                if (requestFilter.apply(request)) {
                    request.cancel();
                }
            }
        }
    }

    public Cache getCache() {
        return this.f7302f;
    }

    public int getSequenceNumber() {
        return this.f7299c.incrementAndGet();
    }

    public void removeRequestEventListener(RequestEventListener requestEventListener) {
        synchronized (this.f7307k) {
            this.f7307k.remove(requestEventListener);
        }
    }

    @Deprecated
    public void removeRequestFinishedListener(RequestFinishedListener requestFinishedListener) {
        synchronized (this.f7298b) {
            this.f7298b.remove(requestFinishedListener);
        }
    }

    public void start() {
        stop();
        CacheDispatcher cacheDispatcher = new CacheDispatcher(this.f7300d, this.f7301e, this.f7302f, this.f7304h);
        this.f7306j = cacheDispatcher;
        cacheDispatcher.start();
        for (int i = 0; i < this.f7305i.length; i++) {
            NetworkDispatcher networkDispatcher = new NetworkDispatcher(this.f7301e, this.f7303g, this.f7302f, this.f7304h);
            this.f7305i[i] = networkDispatcher;
            networkDispatcher.start();
        }
    }

    public void stop() {
        CacheDispatcher cacheDispatcher = this.f7306j;
        if (cacheDispatcher != null) {
            cacheDispatcher.quit();
        }
        NetworkDispatcher[] networkDispatcherArr = this.f7305i;
        for (NetworkDispatcher networkDispatcher : networkDispatcherArr) {
            if (networkDispatcher != null) {
                networkDispatcher.quit();
            }
        }
    }

    public RequestQueue(Cache cache, Network network, int i) {
        this(cache, network, i, new ExecutorDelivery(new Handler(Looper.getMainLooper())));
    }

    public void cancelAll(Object obj) {
        if (obj != null) {
            cancelAll((RequestFilter) new bnr(obj));
            return;
        }
        throw new IllegalArgumentException("Cannot cancelAll with a null tag");
    }

    public RequestQueue(Cache cache, Network network, int i, ResponseDelivery responseDelivery) {
        this.f7299c = new AtomicInteger();
        this.f7297a = new HashSet();
        this.f7300d = new PriorityBlockingQueue();
        this.f7301e = new PriorityBlockingQueue();
        this.f7298b = new ArrayList();
        this.f7307k = new ArrayList();
        this.f7302f = cache;
        this.f7303g = network;
        this.f7305i = new NetworkDispatcher[i];
        this.f7304h = responseDelivery;
    }
}
