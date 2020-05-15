package p000;

import android.os.Looper;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: buqm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buqm implements buqg {

    /* renamed from: a */
    public static final long f154711a = TimeUnit.SECONDS.toMillis(5);

    /* renamed from: b */
    public static final long f154712b = TimeUnit.SECONDS.toMillis(2);

    /* renamed from: c */
    public final buql f154713c;

    /* renamed from: d */
    public final srn f154714d;

    /* renamed from: e */
    public volatile boolean f154715e = false;

    public buqm(String str, Looper looper) {
        this.f154714d = ahfr.m55664a(str);
        this.f154713c = new buql(this, looper);
        looper.getThread().getName();
        looper.getThread().getId();
    }

    /* renamed from: a */
    public final void mo72995a(buqn buqn, boolean z) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        if (!this.f154713c.mo72993a(new buqk(buqn.f154716m, buqn, countDownLatch), 0, z)) {
            countDownLatch.countDown();
        }
        countDownLatch.await();
    }
}
