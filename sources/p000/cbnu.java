package p000;

/* renamed from: cbnu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbnu extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final cbnu f177761a;

    /* renamed from: b */
    private static volatile bxxk f177762b;

    static {
        cbnu cbnu = new cbnu();
        f177761a = cbnu;
        GeneratedMessageLite.m124024a(cbnu.class, cbnu);
    }

    private cbnu() {
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
            return GeneratedMessageLite.m124022a(f177761a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new cbnu();
        }
        if (i2 == 4) {
            return new bxvd(f177761a);
        }
        if (i2 == 5) {
            return f177761a;
        }
        bxxk bxxk = f177762b;
        if (bxxk == null) {
            synchronized (cbnu.class) {
                bxxk = f177762b;
                if (bxxk == null) {
                    bxxk = new bxve(f177761a);
                    f177762b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
