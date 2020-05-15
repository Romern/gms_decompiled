package p000;

import com.android.volley.CacheDispatcher;
import com.android.volley.Request;

/* renamed from: bnm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnm implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Request f5192a;

    /* renamed from: b */
    final /* synthetic */ CacheDispatcher f5193b;

    public bnm(CacheDispatcher cacheDispatcher, Request request) {
        this.f5193b = cacheDispatcher;
        this.f5192a = request;
    }

    public final void run() {
        try {
            this.f5193b.f7262a.put(this.f5192a);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
