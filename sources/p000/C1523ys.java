package p000;

/* renamed from: ys */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1523ys {

    /* renamed from: a */
    long f27680a = 0;

    /* renamed from: b */
    C1523ys f27681b;

    /* renamed from: b */
    private final void m20884b() {
        if (this.f27681b == null) {
            this.f27681b = new C1523ys();
        }
    }

    /* renamed from: a */
    public final void mo16573a() {
        this.f27680a = 0;
        C1523ys ysVar = this.f27681b;
        if (ysVar != null) {
            ysVar.mo16573a();
        }
    }

    /* renamed from: c */
    public final boolean mo16577c(int i) {
        if (i < 64) {
            return (this.f27680a & (1 << i)) != 0;
        }
        m20884b();
        return this.f27681b.mo16577c(i - 64);
    }

    /* renamed from: d */
    public final boolean mo16578d(int i) {
        boolean z;
        if (i < 64) {
            long j = 1 << i;
            long j2 = this.f27680a;
            if ((j2 & j) != 0) {
                z = true;
            } else {
                z = false;
            }
            long j3 = j2 & (j ^ -1);
            this.f27680a = j3;
            long j4 = j - 1;
            this.f27680a = Long.rotateRight((j4 ^ -1) & j3, 1) | (j3 & j4);
            C1523ys ysVar = this.f27681b;
            if (ysVar != null) {
                if (ysVar.mo16577c(0)) {
                    mo16574a(63);
                }
                this.f27681b.mo16578d(0);
            }
            return z;
        }
        m20884b();
        return this.f27681b.mo16578d(i - 64);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final int mo16579e(int i) {
        C1523ys ysVar = this.f27681b;
        if (ysVar != null) {
            if (i >= 64) {
                return ysVar.mo16579e(i - 64) + Long.bitCount(this.f27680a);
            }
            return Long.bitCount(this.f27680a & ((1 << i) - 1));
        } else if (i < 64) {
            return Long.bitCount(this.f27680a & ((1 << i) - 1));
        } else {
            return Long.bitCount(this.f27680a);
        }
    }

    public final String toString() {
        if (this.f27681b == null) {
            return Long.toBinaryString(this.f27680a);
        }
        return this.f27681b.toString() + "xx" + Long.toBinaryString(this.f27680a);
    }

    /* renamed from: a */
    public final void mo16574a(int i) {
        if (i < 64) {
            this.f27680a |= 1 << i;
            return;
        }
        m20884b();
        this.f27681b.mo16574a(i - 64);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo16576b(int i) {
        if (i >= 64) {
            C1523ys ysVar = this.f27681b;
            if (ysVar != null) {
                ysVar.mo16576b(i - 64);
                return;
            }
            return;
        }
        this.f27680a &= (1 << i) ^ -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo16575a(int i, boolean z) {
        if (i < 64) {
            long j = this.f27680a;
            boolean z2 = (Long.MIN_VALUE & j) != 0;
            long j2 = (1 << i) - 1;
            long j3 = (-1 ^ j2) & j;
            this.f27680a = (j & j2) | (j3 + j3);
            if (z) {
                mo16574a(i);
            } else {
                mo16576b(i);
            }
            if (z2 || this.f27681b != null) {
                m20884b();
                this.f27681b.mo16575a(0, z2);
                return;
            }
            return;
        }
        m20884b();
        this.f27681b.mo16575a(i - 64, z);
    }
}
