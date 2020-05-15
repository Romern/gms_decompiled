package p000;

/* renamed from: bzyr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzyr extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bzyr f171921b;

    /* renamed from: c */
    private static volatile bxxk f171922c;

    /* renamed from: a */
    public bxwc f171923a = bxxn.f165040b;

    static {
        bzyr bzyr = new bzyr();
        f171921b = bzyr;
        GeneratedMessageLite.m124024a(bzyr.class, bzyr);
    }

    private bzyr() {
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
            return GeneratedMessageLite.m124022a(f171921b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bzyp.class});
        } else if (i2 == 3) {
            return new bzyr();
        } else {
            if (i2 == 4) {
                return new bxvd((short[][]) null, (int[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f171921b;
            }
            bxxk bxxk = f171922c;
            if (bxxk == null) {
                synchronized (bzyr.class) {
                    bxxk = f171922c;
                    if (bxxk == null) {
                        bxxk = new bxve(f171921b);
                        f171922c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
