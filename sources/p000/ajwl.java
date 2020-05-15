package p000;

import java.util.Locale;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: ajwl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ajwl {

    /* renamed from: a */
    public final ajwk f71422a = new ajwk(0, 0, ajwm.LOST);

    /* renamed from: b */
    public final ajwn f71423b = new ajwn();

    /* renamed from: c */
    public final Runnable f71424c;

    /* renamed from: d */
    public ScheduledFuture f71425d;

    /* renamed from: e */
    final /* synthetic */ ajwo f71426e;

    public ajwl(ajwo ajwo, Runnable runnable) {
        this.f71426e = ajwo;
        this.f71424c = runnable;
        this.f71425d = ajwo.f71437a.schedule(runnable, cfov.m142068u(), TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo38991a(ajwm ajwm) {
        this.f71422a.f71421c = ajwm;
    }

    public final String toString() {
        return String.format(Locale.US, "SightedBlePeripheral<advertisement: %s, weightedAverage: %s>", this.f71422a, this.f71423b);
    }
}
