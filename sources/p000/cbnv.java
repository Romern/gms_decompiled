package p000;

/* renamed from: cbnv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbnv extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final cbnv f177763a;

    /* renamed from: b */
    private static volatile bxxk f177764b;

    static {
        cbnv cbnv = new cbnv();
        f177763a = cbnv;
        GeneratedMessageLite.m124024a(cbnv.class, cbnv);
    }

    private cbnv() {
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
            return GeneratedMessageLite.m124022a(f177763a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new cbnv();
        }
        if (i2 == 4) {
            return new bxvd(f177763a);
        }
        if (i2 == 5) {
            return f177763a;
        }
        bxxk bxxk = f177764b;
        if (bxxk == null) {
            synchronized (cbnv.class) {
                bxxk = f177764b;
                if (bxxk == null) {
                    bxxk = new bxve(f177763a);
                    f177764b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
