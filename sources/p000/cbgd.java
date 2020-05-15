package p000;

/* renamed from: cbgd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbgd extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final cbgd f177016d;

    /* renamed from: e */
    private static volatile bxxk f177017e;

    /* renamed from: a */
    public int f177018a;

    /* renamed from: b */
    public int f177019b;

    /* renamed from: c */
    public bxwc f177020c = bxxn.f165040b;

    static {
        cbgd cbgd = new cbgd();
        f177016d = cbgd;
        GeneratedMessageLite.m124024a(cbgd.class, cbgd);
    }

    private cbgd() {
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
            return GeneratedMessageLite.m124022a(f177016d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0004\u0002\u0004\u0003\u001b", new Object[]{"a", "b", "c", cbgi.class});
        } else if (i2 == 3) {
            return new cbgd();
        } else {
            if (i2 == 4) {
                return new bxvd((float[][][]) null, (short[]) null);
            }
            if (i2 == 5) {
                return f177016d;
            }
            bxxk bxxk = f177017e;
            if (bxxk == null) {
                synchronized (cbgd.class) {
                    bxxk = f177017e;
                    if (bxxk == null) {
                        bxxk = new bxve(f177016d);
                        f177017e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
