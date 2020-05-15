package p000;

import android.os.SystemClock;

/* renamed from: akvh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akvh extends akup {

    /* renamed from: a */
    private final int f72958a;

    /* renamed from: b */
    private final aksc f72959b;

    /* renamed from: c */
    private long f72960c = Long.MIN_VALUE;

    public akvh(int i, aksc aksc) {
        sdo.m34975b(true, "Minimum interval must be positive");
        this.f72958a = i;
        this.f72959b = aksc;
    }

    /* renamed from: a */
    public final Object mo39747a(Object obj) {
        aksc aksc = this.f72959b;
        if (aksc != null) {
            aksc.mo39753a();
        }
        return obj;
    }

    /* renamed from: d */
    public final boolean mo39837d(Object obj) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.f72960c;
        if (j != Long.MIN_VALUE && elapsedRealtime - j < ((long) this.f72958a)) {
            return false;
        }
        this.f72960c = elapsedRealtime;
        return true;
    }
}
