package p000;

/* renamed from: bzru */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzru extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bzru f171201d;

    /* renamed from: e */
    private static volatile bxxk f171202e;

    /* renamed from: a */
    public int f171203a;

    /* renamed from: b */
    public int f171204b;

    /* renamed from: c */
    public int f171205c;

    static {
        bzru bzru = new bzru();
        f171201d = bzru;
        bxvk.m124024a(bzru.class, bzru);
    }

    private bzru() {
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
            return bxvk.m124022a(f171201d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bzru();
        } else {
            if (i2 == 4) {
                return new bxvd(f171201d);
            }
            if (i2 == 5) {
                return f171201d;
            }
            bxxk bxxk = f171202e;
            if (bxxk == null) {
                synchronized (bzru.class) {
                    bxxk = f171202e;
                    if (bxxk == null) {
                        bxxk = new bxve(f171201d);
                        f171202e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
