package p000;

/* renamed from: cbnp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbnp extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final cbnp f177746a;

    /* renamed from: b */
    private static volatile bxxk f177747b;

    static {
        cbnp cbnp = new cbnp();
        f177746a = cbnp;
        GeneratedMessageLite.m124024a(cbnp.class, cbnp);
    }

    private cbnp() {
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
            return GeneratedMessageLite.m124022a(f177746a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new cbnp();
        }
        if (i2 == 4) {
            return new bxvd(f177746a);
        }
        if (i2 == 5) {
            return f177746a;
        }
        bxxk bxxk = f177747b;
        if (bxxk == null) {
            synchronized (cbnp.class) {
                bxxk = f177747b;
                if (bxxk == null) {
                    bxxk = new bxve(f177746a);
                    f177747b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
