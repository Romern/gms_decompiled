package p000;

/* renamed from: cbbr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbbr extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final cbbr f176611a;

    /* renamed from: b */
    private static volatile bxxk f176612b;

    static {
        cbbr cbbr = new cbbr();
        f176611a = cbbr;
        GeneratedMessageLite.m124024a(cbbr.class, cbbr);
    }

    private cbbr() {
        bxxn bxxn = bxxn.f165040b;
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
            return GeneratedMessageLite.m124022a(f176611a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new cbbr();
        }
        if (i2 == 4) {
            return new bxvd(f176611a);
        }
        if (i2 == 5) {
            return f176611a;
        }
        bxxk bxxk = f176612b;
        if (bxxk == null) {
            synchronized (cbbr.class) {
                bxxk = f176612b;
                if (bxxk == null) {
                    bxxk = new bxve(f176611a);
                    f176612b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
