package com.google.android.gms.ads.nonagon.util.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.ads.nonagon.util.concurrent.i */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0856i implements bqgg {

    /* renamed from: a */
    public final Object f9357a;

    /* renamed from: b */
    public final String f9358b;

    /* renamed from: c */
    private final bqgg f9359c;

    public C0856i(Object obj, String str, bqgg bqgg) {
        this.f9357a = obj;
        this.f9358b = str;
        this.f9359c = bqgg;
    }

    /* renamed from: a */
    public final void mo741a(Runnable runnable, Executor executor) {
        this.f9359c.mo741a(runnable, executor);
    }

    public final boolean cancel(boolean z) {
        return this.f9359c.cancel(z);
    }

    public final Object get() {
        return this.f9359c.get();
    }

    public final boolean isCancelled() {
        return this.f9359c.isCancelled();
    }

    public final boolean isDone() {
        return this.f9359c.isDone();
    }

    public final String toString() {
        String str = this.f9358b;
        int identityHashCode = System.identityHashCode(this);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
        sb.append(str);
        sb.append("@");
        sb.append(identityHashCode);
        return sb.toString();
    }

    public final Object get(long j, TimeUnit timeUnit) {
        return this.f9359c.get(j, timeUnit);
    }
}
