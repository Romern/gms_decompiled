package p000;

import android.os.SystemClock;

/* renamed from: opx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class opx {

    /* renamed from: a */
    public volatile boolean f38218a = false;

    /* renamed from: b */
    public volatile long f38219b;

    /* renamed from: c */
    public volatile long f38220c;

    /* renamed from: d */
    public volatile long f38221d;

    /* renamed from: e */
    private final oqa f38222e;

    /* renamed from: f */
    private long f38223f;

    /* renamed from: g */
    private int f38224g = 0;

    /* renamed from: h */
    private int f38225h = -1;

    /* renamed from: i */
    private final int f38226i;

    public opx(oqa oqa, int i, int i2) {
        this.f38222e = oqa;
        this.f38226i = i2;
        m29542c(i);
    }

    /* renamed from: b */
    private final void m29541b(long j) {
        int i = this.f38224g + 1;
        this.f38224g = i;
        if (i < 0) {
            this.f38224g = 0;
            i = 0;
        }
        nvg nvg = ((nvk) this.f38222e).f36665k;
        if (nvg != null) {
            nvg.mo21631a(j, i);
        }
    }

    /* renamed from: c */
    private final void m29542c(int i) {
        int i2 = 1000 / i;
        this.f38219b = (long) ((i2 * 25) / 10);
        this.f38220c = (long) (((i2 * 11) + 9) / 10);
        this.f38221d = (long) (((i2 * 15) + 9) / 10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003d, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo22507a() {
        long j;
        if (this.f38218a) {
            if (this.f38226i > 0) {
                if (this.f38218a) {
                    if (SystemClock.elapsedRealtime() - this.f38223f > this.f38219b) {
                        j = this.f38220c;
                    } else {
                        j = this.f38221d;
                    }
                    mo22508a(j);
                }
            }
            this.f38223f = SystemClock.elapsedRealtime();
            oqa oqa = this.f38222e;
            ((nvk) oqa).f36604E.incrementAndGet();
            nvg nvg = ((nvk) oqa).f36665k;
            if (nvg != null) {
                nvg.mo21630a();
            }
        }
    }

    /* renamed from: a */
    public final synchronized boolean mo22509a(int i) {
        return i <= this.f38225h;
    }

    /* renamed from: b */
    public final void mo22510b() {
        this.f38218a = false;
    }

    /* renamed from: b */
    public final synchronized void mo22511b(int i) {
        m29542c(i);
    }

    /* renamed from: a */
    public final synchronized void mo22508a(long j) {
        this.f38225h = this.f38224g;
        m29541b(j);
        for (int i = 1; i < this.f38226i; i++) {
            j += this.f38220c;
            m29541b(j);
        }
    }
}
