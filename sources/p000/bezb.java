package p000;

/* renamed from: bezb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bezb extends bxvk implements bxxd {

    /* renamed from: h */
    public static final bezb f113104h;

    /* renamed from: i */
    private static volatile bxxk f113105i;

    /* renamed from: a */
    public int f113106a;

    /* renamed from: b */
    public beza f113107b;

    /* renamed from: c */
    public beza f113108c;

    /* renamed from: d */
    public beza f113109d;

    /* renamed from: e */
    public int f113110e;

    /* renamed from: f */
    public bxwc f113111f = bxxn.f165040b;

    /* renamed from: g */
    public int f113112g;

    static {
        bezb bezb = new bezb();
        f113104h = bezb;
        bxvk.m124024a(bezb.class, bezb);
    }

    private bezb() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 1) {
            return null;
        }
        if (i2 == 2) {
            return bxvk.m124022a(f113104h, "\u0001\u0006\u0000\u0001\u0001\r\u0006\u0000\u0001\u0000\u0001ဉ\u0000\u0005\u001b\nဉ\u0004\u000bဉ\u0005\fင\u0006\rဌ\t", new Object[]{"a", "b", "f", beyz.class, "c", "d", "e", "g", beyy.f113078a});
        } else if (i2 == 3) {
            return new bezb();
        } else {
            if (i2 == 4) {
                return new bxvd((float[][][]) null, (int[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f113104h;
            }
            bxxk bxxk = f113105i;
            if (bxxk == null) {
                synchronized (bezb.class) {
                    bxxk = f113105i;
                    if (bxxk == null) {
                        bxxk = new bxve(f113104h);
                        f113105i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
