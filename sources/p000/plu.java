package p000;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: plu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class plu extends plz {

    /* renamed from: e */
    private static final long f39623e = ccxg.f180154a.mo6606a().mo76980h();

    /* renamed from: a */
    public final qav f39624a = new qav("BleProbingWorker");

    /* renamed from: b */
    public final pmx f39625b;

    /* renamed from: c */
    final Runnable f39626c;

    /* renamed from: d */
    ScheduledFuture f39627d;

    public plu(pma pma, pmx pmx) {
        super(pma);
        this.f39625b = pmx;
        this.f39626c = new plt(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo23373a() {
        ScheduledFuture scheduledFuture = this.f39627d;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f39627d = pes.m30266a().scheduleAtFixedRate(this.f39626c, 0, f39623e, TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo23374b() {
        ScheduledFuture scheduledFuture = this.f39627d;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }
}
