package com.google.android.gms.ads.internal.util.future;

import com.google.android.gms.ads.internal.C0387d;
import com.google.android.gms.ads.internal.flag.C0409v;
import com.google.android.gms.ads.internal.util.client.C0633h;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.ads.internal.util.future.f */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0647f {
    @Deprecated
    /* renamed from: a */
    public static Object m5686a(Future future) {
        try {
            return future.get(((Long) C0409v.f8367a.mo6621a()).longValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            future.cancel(true);
            C0633h.m5673d("InterruptedException caught while resolving future.", e);
            Thread.currentThread().interrupt();
            C0387d.m5366d().mo6785b(e, "Futures.resolveFuture");
            return null;
        } catch (Exception e2) {
            future.cancel(true);
            C0633h.m5669b("Error waiting for future.", e2);
            C0387d.m5366d().mo6785b(e2, "Futures.resolveFuture");
            return null;
        }
    }

    @Deprecated
    /* renamed from: a */
    public static Object m5687a(Future future, Object obj, long j, TimeUnit timeUnit) {
        try {
            return future.get(j, timeUnit);
        } catch (InterruptedException e) {
            future.cancel(true);
            C0633h.m5673d("InterruptedException caught while resolving future.", e);
            Thread.currentThread().interrupt();
            C0387d.m5366d().mo6785b(e, "Futures.resolveFuture");
            return obj;
        } catch (Exception e2) {
            future.cancel(true);
            C0633h.m5669b("Error waiting for future.", e2);
            C0387d.m5366d().mo6785b(e2, "Futures.resolveFuture");
            return obj;
        }
    }

    /* renamed from: a */
    public static void m5688a(bqgg bqgg, String str) {
        bqga.m112781a(bqgg, new C0646e(str), C0645d.f8977e);
    }
}
