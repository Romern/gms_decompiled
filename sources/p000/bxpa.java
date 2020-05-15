package p000;

/* renamed from: bxpa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxpa extends bxvk implements bxxd {

    /* renamed from: h */
    public static final bxpa f164219h;

    /* renamed from: i */
    private static volatile bxxk f164220i;

    /* renamed from: a */
    public int f164221a;

    /* renamed from: b */
    public int f164222b;

    /* renamed from: c */
    public int f164223c;

    /* renamed from: d */
    public bxwc f164224d = bxxn.f165040b;

    /* renamed from: e */
    public int f164225e;

    /* renamed from: f */
    public int f164226f;

    /* renamed from: g */
    public int f164227g;

    static {
        bxpa bxpa = new bxpa();
        f164219h = bxpa;
        bxvk.m124024a(bxpa.class, bxpa);
    }

    private bxpa() {
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
            return bxvk.m124022a(f164219h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003\u001b\u0004င\u0002\u0005င\u0003\u0006င\u0004", new Object[]{"a", "b", "c", "d", bxoz.class, "e", "f", "g"});
        } else if (i2 == 3) {
            return new bxpa();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[][]) null, (char[][][]) null);
            }
            if (i2 == 5) {
                return f164219h;
            }
            bxxk bxxk = f164220i;
            if (bxxk == null) {
                synchronized (bxpa.class) {
                    bxxk = f164220i;
                    if (bxxk == null) {
                        bxxk = new bxve(f164219h);
                        f164220i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
