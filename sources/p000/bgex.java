package p000;

import java.util.Arrays;

/* renamed from: bgex */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bgex {

    /* renamed from: a */
    private long f116315a;

    /* renamed from: b */
    private long f116316b;

    /* renamed from: c */
    private int[] f116317c = new int[23];

    /* renamed from: b */
    private final void m98716b() {
        if (this.f116317c == null) {
            throw new IllegalStateException("The Builder is invalid after is has been built.");
        }
    }

    /* renamed from: a */
    public final synchronized bgew mo62726a() {
        bgew bgew;
        m98716b();
        bgew = new bgew(this.f116317c, this.f116315a, this.f116316b);
        this.f116317c = null;
        return bgew;
    }

    /* renamed from: a */
    public final synchronized bgew mo62727a(int i) {
        m98716b();
        int i2 = 0;
        for (int i3 = 0; i3 < 23; i3++) {
            int i4 = this.f116317c[i3];
            if (!(i3 == i || i4 == 0)) {
                i2 += i4;
            }
        }
        double d = (double) i2;
        Double.isNaN(d);
        double d2 = d / 30.0d;
        if (d2 == 0.0d) {
            Arrays.fill(this.f116317c, 0);
            this.f116317c[4] = 100;
        } else {
            for (int i5 = 0; i5 < 23; i5++) {
                int[] iArr = this.f116317c;
                double d3 = (double) iArr[i5];
                Double.isNaN(d3);
                iArr[i5] = (int) Math.round(d3 / d2);
            }
            this.f116317c[i] = 70;
        }
        return mo62726a();
    }

    /* renamed from: b */
    public final synchronized void mo62731b(long j) {
        m98716b();
        this.f116316b = j;
    }

    /* renamed from: a */
    public final synchronized void mo62728a(int i, int i2) {
        m98716b();
        this.f116317c[i] = i2;
    }

    /* renamed from: a */
    public final synchronized void mo62729a(long j) {
        m98716b();
        this.f116315a = j;
    }

    /* renamed from: a */
    public final synchronized void mo62730a(bgew bgew) {
        m98716b();
        this.f116315a = bgew.f116312a;
        this.f116316b = bgew.f116313b;
        System.arraycopy(bgew.f116314c, 0, this.f116317c, 0, 23);
    }
}
