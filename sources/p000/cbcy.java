package p000;

/* renamed from: cbcy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbcy extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final cbcy f176710b;

    /* renamed from: c */
    private static volatile bxxk f176711c;

    /* renamed from: a */
    public long f176712a;

    static {
        cbcy cbcy = new cbcy();
        f176710b = cbcy;
        GeneratedMessageLite.m124024a(cbcy.class, cbcy);
    }

    private cbcy() {
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
            return GeneratedMessageLite.m124022a(f176710b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"a"});
        } else if (i2 == 3) {
            return new cbcy();
        } else {
            if (i2 == 4) {
                return new bxvd(f176710b);
            }
            if (i2 == 5) {
                return f176710b;
            }
            bxxk bxxk = f176711c;
            if (bxxk == null) {
                synchronized (cbcy.class) {
                    bxxk = f176711c;
                    if (bxxk == null) {
                        bxxk = new bxve(f176710b);
                        f176711c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
