package p000;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: plj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class plj extends plz {

    /* renamed from: a */
    public static final long f39589a = cczx.m132362c();

    /* renamed from: b */
    public static final boolean f39590b = cczx.f180351a.mo6606a().mo77144c();

    /* renamed from: c */
    static final boolean f39591c = ccxa.f180142a.mo6606a().mo76963a();

    /* renamed from: h */
    private static final long f39592h = cczx.f180351a.mo6606a().mo77143b();

    /* renamed from: d */
    public final qav f39593d = new qav("AdaptiveDiscoveryWorker");

    /* renamed from: e */
    final qat f39594e;

    /* renamed from: f */
    ScheduledFuture f39595f;

    public plj(pma pma, qat qat) {
        super(pma);
        this.f39594e = qat;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo23373a() {
        ScheduledFuture scheduledFuture = this.f39595f;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f39595f = pes.m30266a().schedule(new pli(this), f39592h, TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo23374b() {
        ScheduledFuture scheduledFuture = this.f39595f;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }
}
