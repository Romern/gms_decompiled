package com.google.android.gms.ads.nonagon.signals;

import com.google.android.gms.ads.internal.util.future.C0645d;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.ads.nonagon.signals.b */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0785b implements C0787d {

    /* renamed from: a */
    private final C0787d f9217a;

    /* renamed from: b */
    private final long f9218b;

    /* renamed from: c */
    private final ScheduledExecutorService f9219c;

    public C0785b(C0787d dVar, long j, ScheduledExecutorService scheduledExecutorService) {
        this.f9217a = dVar;
        this.f9218b = j;
        this.f9219c = scheduledExecutorService;
    }

    /* renamed from: a */
    public final bqgg mo7055a() {
        bqgg a = this.f9217a.mo7055a();
        long j = this.f9218b;
        if (j > 0) {
            a = bqga.m112773a(a, j, TimeUnit.MILLISECONDS, this.f9219c);
        }
        return bqdf.m112620a(a, Throwable.class, C0784a.f9216a, C0645d.f8977e);
    }
}
