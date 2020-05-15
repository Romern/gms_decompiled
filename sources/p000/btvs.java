package p000;

/* renamed from: btvs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btvs extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final btvs f152638a;

    /* renamed from: b */
    private static volatile bxxk f152639b;

    static {
        btvs btvs = new btvs();
        f152638a = btvs;
        GeneratedMessageLite.m124024a(btvs.class, btvs);
    }

    private btvs() {
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
            return GeneratedMessageLite.m124022a(f152638a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new btvs();
        }
        if (i2 == 4) {
            return new bxvd(f152638a);
        }
        if (i2 == 5) {
            return f152638a;
        }
        bxxk bxxk = f152639b;
        if (bxxk == null) {
            synchronized (btvs.class) {
                bxxk = f152639b;
                if (bxxk == null) {
                    bxxk = new bxve(f152638a);
                    f152639b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
