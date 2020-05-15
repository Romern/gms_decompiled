package p000;

/* renamed from: ggx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ggx extends bxvk implements bxxd {

    /* renamed from: b */
    public static final ggx f18150b;

    /* renamed from: c */
    private static volatile bxxk f18151c;

    /* renamed from: a */
    public bxwc f18152a = bxxn.f165040b;

    static {
        ggx ggx = new ggx();
        f18150b = ggx;
        bxvk.m124024a(ggx.class, ggx);
    }

    private ggx() {
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
            return bxvk.m124022a(f18150b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", ggy.class});
        } else if (i2 == 3) {
            return new ggx();
        } else {
            if (i2 == 4) {
                return new bxvd(f18150b);
            }
            if (i2 == 5) {
                return f18150b;
            }
            bxxk bxxk = f18151c;
            if (bxxk == null) {
                synchronized (ggx.class) {
                    bxxk = f18151c;
                    if (bxxk == null) {
                        bxxk = new bxve(f18150b);
                        f18151c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
