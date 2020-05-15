package p000;

import android.content.Context;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: ppt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class ppt {

    /* renamed from: d */
    private static final long f40036d = cczq.f180312a.mo6606a().mo77110e();

    /* renamed from: a */
    protected final C0953ec f40037a;

    /* renamed from: b */
    ScheduledFuture f40038b;

    /* renamed from: c */
    public final Object f40039c = new Object();

    public ppt(Context context, pps pps) {
        C0951ea a = C0949dz.m9854a(context.getApplicationContext(), pps.f40034a, pps.f40035b);
        a.mo9901b();
        this.f40037a = a.mo9900a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo23538a();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void mo23539b() {
        synchronized (this.f40039c) {
            if (this.f40038b == null) {
                this.f40038b = pes.m30266a().schedule(new ppr(this), f40036d, TimeUnit.SECONDS);
            }
        }
    }
}
