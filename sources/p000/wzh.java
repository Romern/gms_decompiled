package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: wzh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wzh {

    /* renamed from: a */
    long f51593a;

    /* renamed from: b */
    long f51594b;

    public wzh() {
        this(-1);
    }

    /* renamed from: a */
    public final long mo29582a() {
        sdo.m34974b(this.f51594b != -1);
        return TimeUnit.NANOSECONDS.toMillis(mo29583b() - this.f51594b);
    }

    /* renamed from: b */
    public final long mo29583b() {
        long j = this.f51593a;
        if (j == -1) {
            return System.nanoTime();
        }
        this.f51593a = -1;
        return j;
    }

    /* renamed from: c */
    public final void mo29584c() {
        this.f51594b = mo29583b();
    }

    public wzh(long j) {
        this.f51593a = j;
        this.f51594b = -1;
    }
}
