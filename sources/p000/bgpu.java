package p000;

import android.os.SystemClock;

/* renamed from: bgpu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgpu implements sqv {

    /* renamed from: a */
    private final long f117250a;

    /* renamed from: b */
    private final long f117251b = SystemClock.elapsedRealtime();

    public bgpu(long j) {
        this.f117250a = j;
    }

    /* renamed from: a */
    public final long mo20505a() {
        return this.f117250a + (SystemClock.elapsedRealtime() - this.f117251b);
    }

    /* renamed from: b */
    public final long mo20506b() {
        return SystemClock.elapsedRealtime();
    }

    /* renamed from: c */
    public final long mo20507c() {
        return System.nanoTime();
    }
}
