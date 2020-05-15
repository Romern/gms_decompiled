package p000;

/* renamed from: cbqa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbqa extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final cbqa f177983b;

    /* renamed from: c */
    private static volatile bxxk f177984c;

    /* renamed from: a */
    public cbqj f177985a;

    static {
        cbqa cbqa = new cbqa();
        f177983b = cbqa;
        GeneratedMessageLite.m124024a(cbqa.class, cbqa);
    }

    private cbqa() {
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
            return GeneratedMessageLite.m124022a(f177983b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
        } else if (i2 == 3) {
            return new cbqa();
        } else {
            if (i2 == 4) {
                return new bxvd(f177983b);
            }
            if (i2 == 5) {
                return f177983b;
            }
            bxxk bxxk = f177984c;
            if (bxxk == null) {
                synchronized (cbqa.class) {
                    bxxk = f177984c;
                    if (bxxk == null) {
                        bxxk = new bxve(f177983b);
                        f177984c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
