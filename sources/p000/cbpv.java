package p000;

/* renamed from: cbpv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbpv extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final cbpv f177963a;

    /* renamed from: b */
    private static volatile bxxk f177964b;

    static {
        cbpv cbpv = new cbpv();
        f177963a = cbpv;
        GeneratedMessageLite.m124024a(cbpv.class, cbpv);
    }

    private cbpv() {
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
            return GeneratedMessageLite.m124022a(f177963a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new cbpv();
        }
        if (i2 == 4) {
            return new bxvd(f177963a);
        }
        if (i2 == 5) {
            return f177963a;
        }
        bxxk bxxk = f177964b;
        if (bxxk == null) {
            synchronized (cbpv.class) {
                bxxk = f177964b;
                if (bxxk == null) {
                    bxxk = new bxve(f177963a);
                    f177964b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
