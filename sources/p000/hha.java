package p000;

import android.os.CountDownTimer;
import android.os.SystemClock;

/* renamed from: hha */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class hha extends CountDownTimer {

    /* renamed from: a */
    final /* synthetic */ hhc f19738a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hha(hhc hhc, long j) {
        super(j, 50);
        this.f19738a = hhc;
    }

    public final void onFinish() {
        this.f19738a.f19742c.f19762q.mo2453l(1);
        this.f19738a.f19741b = SystemClock.elapsedRealtime();
    }

    public final void onTick(long j) {
    }
}
