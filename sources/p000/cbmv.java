package p000;

/* renamed from: cbmv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbmv extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final cbmv f177683d;

    /* renamed from: e */
    private static volatile bxxk f177684e;

    /* renamed from: a */
    public cbma f177685a;

    /* renamed from: b */
    public cbmx f177686b;

    /* renamed from: c */
    public cbmi f177687c;

    static {
        cbmv cbmv = new cbmv();
        f177683d = cbmv;
        GeneratedMessageLite.m124024a(cbmv.class, cbmv);
    }

    private cbmv() {
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
            return GeneratedMessageLite.m124022a(f177683d, "\u0000\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0000\u0000\u0001\t\u0003\t\u0004\t", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new cbmv();
        } else {
            if (i2 == 4) {
                return new bxvd(f177683d);
            }
            if (i2 == 5) {
                return f177683d;
            }
            bxxk bxxk = f177684e;
            if (bxxk == null) {
                synchronized (cbmv.class) {
                    bxxk = f177684e;
                    if (bxxk == null) {
                        bxxk = new bxve(f177683d);
                        f177684e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
