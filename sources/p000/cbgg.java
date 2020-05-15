package p000;

/* renamed from: cbgg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbgg extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final cbgg f177027d;

    /* renamed from: e */
    private static volatile bxxk f177028e;

    /* renamed from: a */
    public int f177029a = 0;

    /* renamed from: b */
    public Object f177030b;

    /* renamed from: c */
    public int f177031c;

    static {
        cbgg cbgg = new cbgg();
        f177027d = cbgg;
        GeneratedMessageLite.m124024a(cbgg.class, cbgg);
    }

    private cbgg() {
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
            return GeneratedMessageLite.m124022a(f177027d, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002<\u0000\u0003<\u0000", new Object[]{"b", "a", "c", cbge.class, cbgb.class});
        } else if (i2 == 3) {
            return new cbgg();
        } else {
            if (i2 == 4) {
                return new bxvd(f177027d);
            }
            if (i2 == 5) {
                return f177027d;
            }
            bxxk bxxk = f177028e;
            if (bxxk == null) {
                synchronized (cbgg.class) {
                    bxxk = f177028e;
                    if (bxxk == null) {
                        bxxk = new bxve(f177027d);
                        f177028e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
