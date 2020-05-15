package p000;

/* renamed from: bpdg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpdg extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bpdg f135933a;

    /* renamed from: b */
    private static volatile bxxk f135934b;

    static {
        bpdg bpdg = new bpdg();
        f135933a = bpdg;
        GeneratedMessageLite.m124024a(bpdg.class, bpdg);
    }

    private bpdg() {
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
            return GeneratedMessageLite.m124022a(f135933a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bpdg();
        }
        if (i2 == 4) {
            return new bxvd(f135933a);
        }
        if (i2 == 5) {
            return f135933a;
        }
        bxxk bxxk = f135934b;
        if (bxxk == null) {
            synchronized (bpdg.class) {
                bxxk = f135934b;
                if (bxxk == null) {
                    bxxk = new bxve(f135933a);
                    f135934b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
