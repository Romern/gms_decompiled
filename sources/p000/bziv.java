package p000;

/* renamed from: bziv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bziv extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bziv f170244b;

    /* renamed from: c */
    private static volatile bxxk f170245c;

    /* renamed from: a */
    public bxwc f170246a = bxxn.f165040b;

    static {
        bziv bziv = new bziv();
        f170244b = bziv;
        GeneratedMessageLite.m124024a(bziv.class, bziv);
    }

    private bziv() {
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
            return GeneratedMessageLite.m124022a(f170244b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", bziw.class});
        } else if (i2 == 3) {
            return new bziv();
        } else {
            if (i2 == 4) {
                return new bxvd(f170244b);
            }
            if (i2 == 5) {
                return f170244b;
            }
            bxxk bxxk = f170245c;
            if (bxxk == null) {
                synchronized (bziv.class) {
                    bxxk = f170245c;
                    if (bxxk == null) {
                        bxxk = new bxve(f170244b);
                        f170245c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
