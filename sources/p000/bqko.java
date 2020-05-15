package p000;

/* renamed from: bqko */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqko extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bqko f141020a;

    /* renamed from: b */
    private static volatile bxxk f141021b;

    static {
        bqko bqko = new bqko();
        f141020a = bqko;
        GeneratedMessageLite.m124024a(bqko.class, bqko);
    }

    private bqko() {
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
            return GeneratedMessageLite.m124022a(f141020a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bqko();
        }
        if (i2 == 4) {
            return new bxvd(f141020a);
        }
        if (i2 == 5) {
            return f141020a;
        }
        bxxk bxxk = f141021b;
        if (bxxk == null) {
            synchronized (bqko.class) {
                bxxk = f141021b;
                if (bxxk == null) {
                    bxxk = new bxve(f141020a);
                    f141021b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
