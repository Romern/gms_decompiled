package p000;

/* renamed from: ran */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ran {

    /* renamed from: a */
    public final int f42565a;

    /* renamed from: b */
    public final int f42566b;

    /* renamed from: c */
    public final int f42567c;

    /* renamed from: d */
    public final int f42568d;

    /* renamed from: e */
    public final qxy f42569e;

    public ran(qxy qxy, int i, int i2, qya qya) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6 = true;
        if (qxy != null) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34974b(z);
        if (i >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        sdo.m34974b(z2);
        if (i2 >= 7) {
            z3 = true;
        } else {
            z3 = false;
        }
        sdo.m34974b(z3);
        int i3 = i + i2;
        if (i3 <= qxy.mo24396a()) {
            z4 = true;
        } else {
            z4 = false;
        }
        sdo.m34974b(z4);
        if (qxx.m33079b(i) + 4 <= i2) {
            z5 = true;
        } else {
            z5 = false;
        }
        sdo.m34974b(z5);
        sdo.m34974b(qya == null ? false : z6);
        this.f42569e = qxy;
        int a = qxx.m33078a(i);
        this.f42565a = a;
        this.f42566b = a + 4;
        this.f42567c = i3;
        this.f42568d = qya.mo24403b();
    }

    /* renamed from: a */
    public final int mo24422a() {
        int b = this.f42569e.mo24400b(this.f42565a);
        if (b >= 0) {
            return b;
        }
        throw new qyb("block count is not valid");
    }

    /* renamed from: b */
    public final int mo24424b(int i) {
        byte a = this.f42569e.mo24395a(i);
        if (a <= 0 || a > 64) {
            throw new qyb("source length is not valid");
        } else if (qxx.m33078a(i + a + 1) + this.f42568d <= this.f42567c) {
            return a;
        } else {
            throw new qyb("source length is out of bounds");
        }
    }

    /* renamed from: a */
    public final String mo24423a(int i) {
        boolean z;
        int i2 = 0;
        boolean z2 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34974b(z);
        int i3 = i + 1;
        if (this.f42568d + i3 >= this.f42567c) {
            z2 = false;
        }
        sdo.m34974b(z2);
        int b = mo24424b(i);
        StringBuilder sb = new StringBuilder();
        while (i2 < b) {
            sb.append((char) this.f42569e.mo24395a(i3));
            i2++;
            i3++;
        }
        return sb.toString();
    }
}
