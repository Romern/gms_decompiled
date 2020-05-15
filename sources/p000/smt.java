package p000;

import com.google.android.gms.common.stats.radio.NetworkActivityEvent;

/* renamed from: smt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class smt {

    /* renamed from: a */
    public final long f44773a;

    /* renamed from: b */
    public final int f44774b;

    public smt(long j, int i) {
        this.f44773a = j;
        this.f44774b = NetworkActivityEvent.getNetworkType(i);
    }
}
