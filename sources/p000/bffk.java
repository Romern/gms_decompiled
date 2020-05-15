package p000;

import android.os.SystemClock;

/* renamed from: bffk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bffk {

    /* renamed from: a */
    private long f113679a = Long.MAX_VALUE;

    /* renamed from: b */
    private long f113680b = Long.MAX_VALUE;

    /* renamed from: c */
    private long f113681c = Long.MAX_VALUE;

    /* renamed from: d */
    private long f113682d = Long.MAX_VALUE;

    /* renamed from: a */
    public final synchronized long mo61609a() {
        return this.f113679a;
    }

    /* renamed from: a */
    public final synchronized void mo61610a(long j) {
        if (this.f113679a == Long.MAX_VALUE) {
            this.f113679a = j;
        }
        this.f113680b = j;
    }

    /* renamed from: a */
    public final synchronized void mo61611a(long j, long j2) {
        if (this.f113682d == Long.MAX_VALUE) {
            this.f113682d = j;
            this.f113681c = j2;
        }
    }

    /* renamed from: b */
    public final synchronized long mo61612b() {
        long j;
        j = this.f113680b;
        if (j == Long.MAX_VALUE) {
            j = SystemClock.elapsedRealtime();
            this.f113680b = j;
        }
        return j;
    }

    /* renamed from: b */
    public final synchronized long mo61613b(long j, long j2) {
        return (j - this.f113682d) + ((this.f113681c - this.f113679a) * 1000000) + j2;
    }

    /* renamed from: c */
    public final synchronized long mo61614c() {
        long j;
        j = this.f113679a;
        if (j == Long.MAX_VALUE) {
            j = SystemClock.elapsedRealtime();
            this.f113679a = j;
        }
        return j;
    }

    /* renamed from: c */
    public final synchronized long mo61615c(long j, long j2) {
        return (this.f113682d - j) + ((j2 - this.f113681c) * 1000000);
    }
}
