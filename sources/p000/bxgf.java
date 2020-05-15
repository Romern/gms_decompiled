package p000;

/* renamed from: bxgf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxgf extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bxgf f163241b;

    /* renamed from: c */
    private static volatile bxxk f163242c;

    /* renamed from: a */
    public bxvt f163243a = bxvm.f164965b;

    static {
        bxgf bxgf = new bxgf();
        f163241b = bxgf;
        GeneratedMessageLite.m124024a(bxgf.class, bxgf);
    }

    private bxgf() {
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
            return GeneratedMessageLite.m124022a(f163241b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"a", bxcl.m122572b()});
        } else if (i2 == 3) {
            return new bxgf();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[][]) null, (byte[][]) null);
            }
            if (i2 == 5) {
                return f163241b;
            }
            bxxk bxxk = f163242c;
            if (bxxk == null) {
                synchronized (bxgf.class) {
                    bxxk = f163242c;
                    if (bxxk == null) {
                        bxxk = new bxve(f163241b);
                        f163242c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
