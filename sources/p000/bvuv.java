package p000;

/* renamed from: bvuv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvuv extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bvuv f157747d;

    /* renamed from: e */
    private static volatile bxxk f157748e;

    /* renamed from: a */
    public int f157749a;

    /* renamed from: b */
    public byex f157750b;

    /* renamed from: c */
    public bxwc f157751c = bxxn.f165040b;

    static {
        bvuv bvuv = new bvuv();
        f157747d = bvuv;
        GeneratedMessageLite.m124024a(bvuv.class, bvuv);
    }

    private bvuv() {
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
            return GeneratedMessageLite.m124022a(f157747d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"a", "b", "c", bvuu.class});
        } else if (i2 == 3) {
            return new bvuv();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[]) null, (char[][][]) null);
            }
            if (i2 == 5) {
                return f157747d;
            }
            bxxk bxxk = f157748e;
            if (bxxk == null) {
                synchronized (bvuv.class) {
                    bxxk = f157748e;
                    if (bxxk == null) {
                        bxxk = new bxve(f157747d);
                        f157748e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
