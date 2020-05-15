package com.google.android.gms.ads.internal.util.future;

import com.google.android.gms.ads.internal.C0387d;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.ads.internal.util.future.g */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class C0648g implements bqgg {

    /* renamed from: a */
    private final bqgy f8979a = bqgy.m112818c();

    /* renamed from: a */
    public static C0648g m5689a() {
        return new C0648g();
    }

    public final boolean cancel(boolean z) {
        return this.f8979a.cancel(z);
    }

    public final Object get() {
        return this.f8979a.get();
    }

    public final boolean isCancelled() {
        return this.f8979a.isCancelled();
    }

    public final boolean isDone() {
        return this.f8979a.isDone();
    }

    /* renamed from: a */
    private static final void m5690a(boolean z) {
        if (!z) {
            C0387d.m5366d().mo6785b(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture");
        }
    }

    public final Object get(long j, TimeUnit timeUnit) {
        return this.f8979a.get(j, timeUnit);
    }

    /* renamed from: a */
    public final void mo6830a(Object obj) {
        m5690a(this.f8979a.mo69138b(obj));
    }

    /* renamed from: a */
    public final void mo741a(Runnable runnable, Executor executor) {
        this.f8979a.mo741a(runnable, executor);
    }

    /* renamed from: a */
    public final void mo6831a(Throwable th) {
        m5690a(this.f8979a.mo69136a(th));
    }
}
