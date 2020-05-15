package p000;

/* renamed from: aapu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aapu extends bxvk implements bxxd {

    /* renamed from: d */
    public static final aapu f28835d;

    /* renamed from: e */
    private static volatile bxxk f28836e;

    /* renamed from: a */
    public int f28837a;

    /* renamed from: b */
    public int f28838b;

    /* renamed from: c */
    public bxun f28839c;

    static {
        aapu aapu = new aapu();
        f28835d = aapu;
        bxvk.m124024a(aapu.class, aapu);
    }

    private aapu() {
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
            return bxvk.m124022a(f28835d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", aapt.f28834a, "c"});
        } else if (i2 == 3) {
            return new aapu();
        } else {
            if (i2 == 4) {
                return new bxvd(f28835d);
            }
            if (i2 == 5) {
                return f28835d;
            }
            bxxk bxxk = f28836e;
            if (bxxk == null) {
                synchronized (aapu.class) {
                    bxxk = f28836e;
                    if (bxxk == null) {
                        bxxk = new bxve(f28835d);
                        f28836e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
