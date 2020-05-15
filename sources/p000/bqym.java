package p000;

/* renamed from: bqym */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqym extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bqym f141963b;

    /* renamed from: c */
    private static volatile bxxk f141964c;

    /* renamed from: a */
    public bxvt f141965a = bxvm.f164965b;

    static {
        bqym bqym = new bqym();
        f141963b = bqym;
        GeneratedMessageLite.m124024a(bqym.class, bqym);
    }

    private bqym() {
        bxvm bxvm = bxvm.f164965b;
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
            return GeneratedMessageLite.m124022a(f141963b, "\u0001\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0001\u0000\u0003\u0016", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bqym();
        } else {
            if (i2 == 4) {
                return new bqyl();
            }
            if (i2 == 5) {
                return f141963b;
            }
            bxxk bxxk = f141964c;
            if (bxxk == null) {
                synchronized (bqym.class) {
                    bxxk = f141964c;
                    if (bxxk == null) {
                        bxxk = new bxve(f141963b);
                        f141964c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
