package p000;

/* renamed from: bzuw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzuw extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bzuw f171480a;

    /* renamed from: b */
    private static volatile bxxk f171481b;

    static {
        bzuw bzuw = new bzuw();
        f171480a = bzuw;
        GeneratedMessageLite.m124024a(bzuw.class, bzuw);
    }

    private bzuw() {
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
            return GeneratedMessageLite.m124022a(f171480a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bzuw();
        }
        if (i2 == 4) {
            return new bxvd(f171480a);
        }
        if (i2 == 5) {
            return f171480a;
        }
        bxxk bxxk = f171481b;
        if (bxxk == null) {
            synchronized (bzuw.class) {
                bxxk = f171481b;
                if (bxxk == null) {
                    bxxk = new bxve(f171480a);
                    f171481b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
