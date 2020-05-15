package p000;

import android.os.SystemClock;

/* renamed from: ajgt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajgt {

    /* renamed from: a */
    public final ahfv f70588a;

    /* renamed from: b */
    public final long f70589b;

    /* renamed from: c */
    public final byyg f70590c;

    /* renamed from: d */
    public long f70591d;

    public ajgt(ahfv ahfv, byyg byyg) {
        this.f70588a = ahfv;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        byym byym = byyg.f168926i;
        this.f70589b = elapsedRealtime + (byym == null ? byym.f168972f : byym).f168978e;
        this.f70590c = byyg;
    }
}
