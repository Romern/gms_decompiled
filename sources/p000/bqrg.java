package p000;

/* renamed from: bqrg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqrg extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bqrg f141433a;

    /* renamed from: b */
    private static volatile bxxk f141434b;

    static {
        bqrg bqrg = new bqrg();
        f141433a = bqrg;
        GeneratedMessageLite.m124024a(bqrg.class, bqrg);
    }

    private bqrg() {
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
            return GeneratedMessageLite.m124022a(f141433a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bqrg();
        }
        if (i2 == 4) {
            return new bxvd(f141433a);
        }
        if (i2 == 5) {
            return f141433a;
        }
        bxxk bxxk = f141434b;
        if (bxxk == null) {
            synchronized (bqrg.class) {
                bxxk = f141434b;
                if (bxxk == null) {
                    bxxk = new bxve(f141433a);
                    f141434b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
