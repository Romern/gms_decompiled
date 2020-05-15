package p000;

/* renamed from: bssa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bssa extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bssa f146821d;

    /* renamed from: e */
    private static volatile bxxk f146822e;

    /* renamed from: a */
    public int f146823a;

    /* renamed from: b */
    public long f146824b;

    /* renamed from: c */
    public bxwc f146825c = bxxn.f165040b;

    static {
        bssa bssa = new bssa();
        f146821d = bssa;
        GeneratedMessageLite.m124024a(bssa.class, bssa);
    }

    private bssa() {
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
            return GeneratedMessageLite.m124022a(f146821d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဂ\u0000\u0002\u001b", new Object[]{"a", "b", "c", bsrz.class});
        } else if (i2 == 3) {
            return new bssa();
        } else {
            if (i2 == 4) {
                return new bxvd((char[][][]) null, (float[]) null);
            }
            if (i2 == 5) {
                return f146821d;
            }
            bxxk bxxk = f146822e;
            if (bxxk == null) {
                synchronized (bssa.class) {
                    bxxk = f146822e;
                    if (bxxk == null) {
                        bxxk = new bxve(f146821d);
                        f146822e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
