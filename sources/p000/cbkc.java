package p000;

/* renamed from: cbkc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbkc extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final cbkc f177391a;

    /* renamed from: b */
    private static volatile bxxk f177392b;

    static {
        cbkc cbkc = new cbkc();
        f177391a = cbkc;
        GeneratedMessageLite.m124024a(cbkc.class, cbkc);
    }

    private cbkc() {
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
            return GeneratedMessageLite.m124022a(f177391a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new cbkc();
        }
        if (i2 == 4) {
            return new bxvd(f177391a);
        }
        if (i2 == 5) {
            return f177391a;
        }
        bxxk bxxk = f177392b;
        if (bxxk == null) {
            synchronized (cbkc.class) {
                bxxk = f177392b;
                if (bxxk == null) {
                    bxxk = new bxve(f177391a);
                    f177392b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
