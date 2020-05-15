package p000;

/* renamed from: btvt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btvt extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final btvt f152640a;

    /* renamed from: b */
    private static volatile bxxk f152641b;

    static {
        btvt btvt = new btvt();
        f152640a = btvt;
        GeneratedMessageLite.m124024a(btvt.class, btvt);
    }

    private btvt() {
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
            return GeneratedMessageLite.m124022a(f152640a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new btvt();
        }
        if (i2 == 4) {
            return new bxvd(f152640a);
        }
        if (i2 == 5) {
            return f152640a;
        }
        bxxk bxxk = f152641b;
        if (bxxk == null) {
            synchronized (btvt.class) {
                bxxk = f152641b;
                if (bxxk == null) {
                    bxxk = new bxve(f152640a);
                    f152641b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
