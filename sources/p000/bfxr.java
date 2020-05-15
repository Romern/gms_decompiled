package p000;

/* renamed from: bfxr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfxr extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bfxr f115610b;

    /* renamed from: c */
    private static volatile bxxk f115611c;

    /* renamed from: a */
    public bxwc f115612a = bxxn.f165040b;

    static {
        bfxr bfxr = new bfxr();
        f115610b = bfxr;
        GeneratedMessageLite.m124024a(bfxr.class, bfxr);
    }

    private bfxr() {
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
            return GeneratedMessageLite.m124022a(f115610b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bfxq.class});
        } else if (i2 == 3) {
            return new bfxr();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[][][]) null, (char[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f115610b;
            }
            bxxk bxxk = f115611c;
            if (bxxk == null) {
                synchronized (bfxr.class) {
                    bxxk = f115611c;
                    if (bxxk == null) {
                        bxxk = new bxve(f115610b);
                        f115611c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
