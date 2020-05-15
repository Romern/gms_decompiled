package p000;

import android.app.Application;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: bdmk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdmk {

    /* renamed from: a */
    public static final bnrt f105968a = bnrt.m110178a("bdmk");

    /* renamed from: b */
    public final AtomicBoolean f105969b = new AtomicBoolean(false);

    /* renamed from: c */
    public ScheduledFuture f105970c;

    /* renamed from: d */
    public ScheduledFuture f105971d;

    /* renamed from: e */
    public final bmzi f105972e;

    /* renamed from: f */
    public final bdfd f105973f;

    /* renamed from: g */
    public final bdez f105974g = new bdmh(this);

    /* renamed from: h */
    public final bdfa f105975h = new bdmj(this);

    /* renamed from: i */
    public final bdmn f105976i;

    public bdmk(bdmn bdmn, Application application, bmzi bmzi) {
        bdfd a = bdfd.m90662a(application);
        this.f105976i = bdmn;
        this.f105972e = bmzi;
        this.f105973f = a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo58182a() {
        if (this.f105969b.getAndSet(true)) {
            bnrq bnrq = (bnrq) f105968a.mo68388c();
            bnrq.mo68432a("bdmk", "a", (int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnrq.mo68405a("Memory Monitor has already started. This MemoryMetricMonitor.start() is ignored.");
            return;
        }
        this.f105973f.mo57955a(this.f105974g);
        this.f105973f.mo57955a(this.f105975h);
    }

    /* renamed from: b */
    public final void mo58183b() {
        ScheduledFuture scheduledFuture = this.f105970c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f105970c = null;
        }
        ScheduledFuture scheduledFuture2 = this.f105971d;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(true);
            this.f105971d = null;
        }
    }
}
