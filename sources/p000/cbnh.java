package p000;

/* renamed from: cbnh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbnh extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final cbnh f177729a;

    /* renamed from: b */
    private static volatile bxxk f177730b;

    static {
        cbnh cbnh = new cbnh();
        f177729a = cbnh;
        GeneratedMessageLite.m124024a(cbnh.class, cbnh);
    }

    private cbnh() {
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
            return GeneratedMessageLite.m124022a(f177729a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new cbnh();
        }
        if (i2 == 4) {
            return new bxvd(f177729a);
        }
        if (i2 == 5) {
            return f177729a;
        }
        bxxk bxxk = f177730b;
        if (bxxk == null) {
            synchronized (cbnh.class) {
                bxxk = f177730b;
                if (bxxk == null) {
                    bxxk = new bxve(f177729a);
                    f177730b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
