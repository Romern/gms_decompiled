package p000;

/* renamed from: bzus */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzus extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bzus f171460b;

    /* renamed from: c */
    private static volatile bxxk f171461c;

    /* renamed from: a */
    public bzuq f171462a;

    static {
        bzus bzus = new bzus();
        f171460b = bzus;
        GeneratedMessageLite.m124024a(bzus.class, bzus);
    }

    private bzus() {
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
            return GeneratedMessageLite.m124022a(f171460b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bzus();
        } else {
            if (i2 == 4) {
                return new bxvd(f171460b);
            }
            if (i2 == 5) {
                return f171460b;
            }
            bxxk bxxk = f171461c;
            if (bxxk == null) {
                synchronized (bzus.class) {
                    bxxk = f171461c;
                    if (bxxk == null) {
                        bxxk = new bxve(f171460b);
                        f171461c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
