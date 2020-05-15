package p000;

import android.os.CountDownTimer;
import android.os.SystemClock;

/* renamed from: gzw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class gzw extends CountDownTimer {

    /* renamed from: a */
    final /* synthetic */ gzy f19310a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gzw(gzy gzy, long j) {
        super(j, 50);
        this.f19310a = gzy;
    }

    public final void onFinish() {
        gzz gzz = this.f19310a.f19314c;
        Logger Logger = gzz.f19315d;
        gzz.f19334w.mo2453l(1);
        this.f19310a.f19313b = SystemClock.elapsedRealtime();
    }

    public final void onTick(long j) {
    }
}
