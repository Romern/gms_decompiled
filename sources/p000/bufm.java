package p000;

/* renamed from: bufm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bufm extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bufm f153714f;

    /* renamed from: g */
    private static volatile bxxk f153715g;

    /* renamed from: a */
    public int f153716a;

    /* renamed from: b */
    public int f153717b;

    /* renamed from: c */
    public int f153718c;

    /* renamed from: d */
    public bxwc f153719d = bxxn.f165040b;

    /* renamed from: e */
    public bxwc f153720e = bxxn.f165040b;

    static {
        bufm bufm = new bufm();
        f153714f = bufm;
        bxvk.m124024a(bufm.class, bufm);
    }

    private bufm() {
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
            return bxvk.m124022a(f153714f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003\u001b\u0004\u001b", new Object[]{"a", "b", bufl.f153713a, "c", bufj.f153708a, "d", bufo.class, "e", bufi.class});
        } else if (i2 == 3) {
            return new bufm();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[][][]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f153714f;
            }
            bxxk bxxk = f153715g;
            if (bxxk == null) {
                synchronized (bufm.class) {
                    bxxk = f153715g;
                    if (bxxk == null) {
                        bxxk = new bxve(f153714f);
                        f153715g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
