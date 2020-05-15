package p000;

import android.os.CountDownTimer;
import android.os.SystemClock;

/* renamed from: gzy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class gzy {

    /* renamed from: a */
    public final CountDownTimer f19312a = new gzw(this, cccr.m129263b());

    /* renamed from: b */
    public long f19313b;

    /* renamed from: c */
    final /* synthetic */ gzz f19314c;

    public gzy(gzz gzz) {
        this.f19314c = gzz;
    }

    /* renamed from: a */
    public final bqgg mo12355a() {
        long c = cccr.m129264c();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.f19313b;
        long j2 = c - (elapsedRealtime - j);
        if (j != 0 && j2 >= 0) {
            bqgy c2 = bqgy.m112818c();
            new gzx(j2, c2).start();
            return c2;
        }
        this.f19312a.cancel();
        return bqga.m112775a((Object) null);
    }
}
