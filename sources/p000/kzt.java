package p000;

/* renamed from: kzt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kzt extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final kzt f25471c;

    /* renamed from: d */
    private static volatile bxxk f25472d;

    /* renamed from: a */
    public long f25473a;

    /* renamed from: b */
    public bxwc f25474b = bxxn.f165040b;

    static {
        kzt kzt = new kzt();
        f25471c = kzt;
        GeneratedMessageLite.m124024a(kzt.class, kzt);
    }

    private kzt() {
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
            return GeneratedMessageLite.m124022a(f25471c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0005\u0002\u001b", new Object[]{"a", "b", kzg.class});
        } else if (i2 == 3) {
            return new kzt();
        } else {
            if (i2 == 4) {
                return new bxvd(f25471c);
            }
            if (i2 == 5) {
                return f25471c;
            }
            bxxk bxxk = f25472d;
            if (bxxk == null) {
                synchronized (kzt.class) {
                    bxxk = f25472d;
                    if (bxxk == null) {
                        bxxk = new bxve(f25471c);
                        f25472d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
