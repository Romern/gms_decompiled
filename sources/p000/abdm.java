package p000;

/* renamed from: abdm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abdm extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final abdm f57101a;

    /* renamed from: b */
    private static volatile bxxk f57102b;

    static {
        abdm abdm = new abdm();
        f57101a = abdm;
        GeneratedMessageLite.m124024a(abdm.class, abdm);
    }

    private abdm() {
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
            return GeneratedMessageLite.m124022a(f57101a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new abdm();
        }
        if (i2 == 4) {
            return new bxvd(f57101a);
        }
        if (i2 == 5) {
            return f57101a;
        }
        bxxk bxxk = f57102b;
        if (bxxk == null) {
            synchronized (abdm.class) {
                bxxk = f57102b;
                if (bxxk == null) {
                    bxxk = new bxve(f57101a);
                    f57102b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
