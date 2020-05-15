package p000;

/* renamed from: cbns */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbns extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final cbns f177755c;

    /* renamed from: d */
    private static volatile bxxk f177756d;

    /* renamed from: a */
    public cbmo f177757a;

    /* renamed from: b */
    public bxwc f177758b = bxxn.f165040b;

    static {
        cbns cbns = new cbns();
        f177755c = cbns;
        GeneratedMessageLite.m124024a(cbns.class, cbns);
    }

    private cbns() {
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
            return GeneratedMessageLite.m124022a(f177755c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\t\u0002\u001b", new Object[]{"a", "b", cbnr.class});
        } else if (i2 == 3) {
            return new cbns();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[][][]) null, (int[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f177755c;
            }
            bxxk bxxk = f177756d;
            if (bxxk == null) {
                synchronized (cbns.class) {
                    bxxk = f177756d;
                    if (bxxk == null) {
                        bxxk = new bxve(f177755c);
                        f177756d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
