package p000;

import android.os.Handler;

/* renamed from: auss */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auss {

    /* renamed from: a */
    public static final aunx f92444a = new aunx("TrustAgent", "Eid", "TimeoutChecker");

    /* renamed from: b */
    private final Handler f92445b;

    public auss(Handler handler) {
        this.f92445b = handler;
    }

    /* renamed from: a */
    public final void mo50886a(ausr ausr, long j) {
        this.f92445b.postDelayed(new ausq(ausr, System.currentTimeMillis()), j);
    }
}
