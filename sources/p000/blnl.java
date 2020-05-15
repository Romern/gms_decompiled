package p000;

/* renamed from: blnl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blnl extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final blnl f126994c;

    /* renamed from: d */
    private static volatile bxxk f126995d;

    /* renamed from: a */
    public int f126996a;

    /* renamed from: b */
    public bxbq f126997b;

    static {
        blnl blnl = new blnl();
        f126994c = blnl;
        GeneratedMessageLite.m124024a(blnl.class, blnl);
    }

    private blnl() {
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
            return GeneratedMessageLite.m124022a(f126994c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new blnl();
        } else {
            if (i2 == 4) {
                return new bxvd(f126994c);
            }
            if (i2 == 5) {
                return f126994c;
            }
            bxxk bxxk = f126995d;
            if (bxxk == null) {
                synchronized (blnl.class) {
                    bxxk = f126995d;
                    if (bxxk == null) {
                        bxxk = new bxve(f126994c);
                        f126995d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
